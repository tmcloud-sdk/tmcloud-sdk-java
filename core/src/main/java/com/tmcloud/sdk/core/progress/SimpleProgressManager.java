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

public class SimpleProgressManager extends ProgressManager {

    protected long transferredBytes;
    protected long newlyTransferredBytes;
    protected long lastSecondBytes = -1;
    protected long currentSecondBytes;
    protected long lastSwapTimeStamp = System.currentTimeMillis();

    public SimpleProgressManager(long totalBytes, long transferredBytes, ProgressListener progressListener,
                                 long intervalBytes) {
        super(totalBytes, progressListener, intervalBytes);
        this.transferredBytes = transferredBytes < 0 ? 0 : transferredBytes;
    }

    @Override
    protected void doProgressChanged(int bytes) {
        this.transferredBytes += bytes;
        this.newlyTransferredBytes += bytes;
        long now = System.currentTimeMillis();
        long swapIntervalTime = now - lastSwapTimeStamp;
        currentSecondBytes += bytes;
        if (swapIntervalTime > 1000) {
            lastSecondBytes = (long) (currentSecondBytes / (swapIntervalTime / 1000.0));
            currentSecondBytes = 0;
            lastSwapTimeStamp = now;
        }
        if (this.newlyTransferredBytes >= this.intervalBytes
                && (this.transferredBytes < this.totalBytes || this.totalBytes == -1)) {
            DefaultProgressStatus status = new DefaultProgressStatus(this.newlyTransferredBytes, this.transferredBytes,
                    this.totalBytes, now - this.lastCheckpoint, now - this.startCheckpoint);
            status.setInstantaneousSpeed(lastSecondBytes);
            this.progressListener.progressChanged(status);
            this.newlyTransferredBytes = 0;
            this.lastCheckpoint = now;
        }
    }

    @Override
    public void progressEnd() {
        if (this.progressListener == null) {
            return;
        }
        long now = System.currentTimeMillis();
        ProgressStatus status = new DefaultProgressStatus(this.newlyTransferredBytes, this.transferredBytes,
                this.totalBytes, now - this.lastCheckpoint, now - this.startCheckpoint);
        this.progressListener.progressChanged(status);
    }

}
