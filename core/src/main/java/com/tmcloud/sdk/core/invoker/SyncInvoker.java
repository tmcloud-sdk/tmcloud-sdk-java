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

package com.tmcloud.sdk.core.invoker;

import com.tmcloud.sdk.core.HcClient;
import com.tmcloud.sdk.core.exception.SdkException;
import com.tmcloud.sdk.core.http.HttpRequestDef;

import java.util.concurrent.ExecutionException;

/**
 * @param <R> Request type
 * @param <S> Response type
 * @author TMCloud_SDK
 */
public class SyncInvoker<R, S> extends BaseInvoker<R, S, SyncInvoker<R, S>> {
    /**
     * The default constructor for SyncInvoker.
     *
     * @param req original request
     * @param meta definitions for request and response used to build original HttpRequest
     * and extract original HttpResponse
     * @param hcClient encapsulated client before default http client
     */
    public SyncInvoker(R req, HttpRequestDef<R, S> meta, HcClient hcClient) {
        super(req, meta, hcClient);
    }

    /**
     * This method will invoke synchronous request for specified interface.
     *
     * @return CompletableFuture
     */
    public S invoke() {
        try {
            return retry(() -> this.hcClient.preInvoke(extraHeader).asyncInvokeHttp(req, meta, exchange)).get();
        } catch (ExecutionException e) {
            throw (SdkException) e.getCause();
        } catch (InterruptedException e) {
            throw new SdkException(e);
        }
    }
}
