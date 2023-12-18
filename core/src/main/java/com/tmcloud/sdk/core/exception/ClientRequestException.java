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

package com.tmcloud.sdk.core.exception;

/**
 * Captures Server based Errors (Return Codes between 400 - 499)
 *
 * @author TMCloud_SDK
 */
public class ClientRequestException extends ServiceResponseException {

    private static final long serialVersionUID = -3427754173856991309L;

    public ClientRequestException(int httpStatusCode, SdkErrorMessage sdkErrorMessage) {
        super(httpStatusCode, sdkErrorMessage);
    }

    public ClientRequestException(int httpStatusCode, String errorCode, String errorMsg, String requestId) {
        super(httpStatusCode, errorCode, errorMsg, requestId);
    }

}
