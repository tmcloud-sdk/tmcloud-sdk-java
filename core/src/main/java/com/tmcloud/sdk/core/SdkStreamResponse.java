/*
 * Copyright (c) TM Technologies Co., Ltd. 2021-2021. All rights reserved.
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

package com.tmcloud.sdk.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tmcloud.sdk.core.exception.SdkException;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Consumer;

/**
 * @author TMCloud_SDK
 */
public class SdkStreamResponse extends SdkResponse {

    @JsonIgnore
    private InputStream body;

    /**
     * 解析http响应body，用于content-type是application/bson或application/octet-stream的响应
     *
     * @param inputStream http response body
     */
    public Object parseBody(InputStream inputStream) {
        this.body = inputStream;
        return this;
    }

    /**
     * 解析http响应body到XXXResponse，XXXResponse是SdkBsonDocResponse的子类，
     * 目前只有SdkBsonDocResponse的子类的解析会使用这个函数，即content-type是application/bson的响应。
     * 把该函数放在SdkStreamResponse的目的是为了解除core模块对core-bson模块的依赖。
     *
     * @param buf http response body
     * @return object deserialized from buf
     */
    public Object parseBody(byte[] buf) {
        throw new SdkException("only used in application/bson response");
    }

    public void consumeDownloadStream(Consumer<InputStream> consumer) {
        try (InputStream inputStream = this.body) {
            consumer.accept(inputStream);
        } catch (IOException e) {
            throw new SdkException(e);
        }
    }
}
