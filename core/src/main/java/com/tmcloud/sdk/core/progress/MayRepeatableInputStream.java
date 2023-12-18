/*
 * Copyright (c) TM Technologies Co., Ltd. 2023-2023. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tmcloud.sdk.core.progress;

import com.tmcloud.sdk.core.exception.SdkException;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class MayRepeatableInputStream extends FilterInputStream {

    private static class SdkBufferedInputStream extends BufferedInputStream {

        public SdkBufferedInputStream(InputStream in, int size) {
            super(in, size);
        }

        public void tearDown() {
            this.count = 0;
            this.markpos = -1;
            this.marklimit = 0;
            this.pos = 0;
        }
    }

    private FileChannel fileChannel;
    private long markPos;
    private final InputStream originInputStream;

    public MayRepeatableInputStream(InputStream in, int bufferSize) {
        super(in);
        this.init(bufferSize);
        this.originInputStream = in;
    }

    private void init(int bufferSize) {
        if (this.in instanceof FileInputStream) {
            fileChannel = ((FileInputStream) in).getChannel();
            try {
                markPos = fileChannel.position();
            } catch (IOException e) {
                throw new IllegalArgumentException("Invalid FileInputStream", e);
            }
        }
        if (bufferSize > 0) {
            synchronized (this) {
                this.in = new SdkBufferedInputStream(in, bufferSize);
            }
        }
    }

    @Override
    public final boolean markSupported() {
        return fileChannel != null || (originInputStream instanceof ByteArrayInputStream);
    }

    protected final void throwExceptionWhileInterrupted() {
        if (Thread.interrupted()) {
            throw new SdkException("Abort io due to thread interrupted");
        }
    }

    @Override
    public synchronized void mark(int a) {
        throwExceptionWhileInterrupted();
        try {
            if (fileChannel != null) {
                markPos = fileChannel.position();
            } else if (originInputStream instanceof ByteArrayInputStream) {
                originInputStream.mark(a);
            }
        } catch (IOException e) {
            throw new SdkException("Failed to mark the file position", e);
        }
    }

    @Override
    public synchronized void reset() throws IOException {
        if (fileChannel != null) {
            fileChannel.position(markPos);
            if (in instanceof SdkBufferedInputStream) {
                ((SdkBufferedInputStream) in).tearDown();
            }
        } else if (originInputStream instanceof ByteArrayInputStream) {
            if (in instanceof SdkBufferedInputStream) {
                ((SdkBufferedInputStream) in).tearDown();
            }
            ((ByteArrayInputStream) originInputStream).reset();
        } else {
            throw new SdkException("UnRepeatable");
        }
    }

    @Override
    public long skip(long n) throws IOException {
        throwExceptionWhileInterrupted();
        return super.skip(n);
    }

    @Override
    public int available() throws IOException {
        throwExceptionWhileInterrupted();
        return super.available();
    }

    @Override
    public void close() throws IOException {
        super.close();
        throwExceptionWhileInterrupted();
    }

    @Override
    public int read() throws IOException {
        throwExceptionWhileInterrupted();
        return super.read();
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        throwExceptionWhileInterrupted();
        return super.read(b, off, len);
    }

}
