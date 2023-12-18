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

package com.tmcloud.sdk.core.auth;

import com.tmcloud.sdk.core.HcClient;
import com.tmcloud.sdk.core.exception.SdkException;
import com.tmcloud.sdk.core.http.HttpClient;
import com.tmcloud.sdk.core.http.HttpRequest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author TMCloud_SDK
 */
public interface ICredential {
    /**
     * Handle endpoint resolver and fill projectId/domainId automatically.
     *
     * @param hcClient instance of hcClient
     * @param regionId region id such as "cn-north-4"
     * @return null
     */
    CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId);

    /**
     * Handle auth request before sending to API Gateway.
     *
     * @param httpRequest instance of HttpRequest
     * @param httpClient  instance of HttpClient
     * @return null
     */
    CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient);

    /**
     * Handle auth request before sending to API Gateway.
     *
     * @param httpRequest instance of HttpRequest
     * @param httpClient  instance of HttpClient
     * @return null
     */
    default HttpRequest syncProcessAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        try {
            return processAuthRequest(httpRequest, httpClient).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new SdkException(e);
        }
    }

    /**
     * DeepClone Object
     *
     * @return ICredential
     */
    ICredential deepClone();
}