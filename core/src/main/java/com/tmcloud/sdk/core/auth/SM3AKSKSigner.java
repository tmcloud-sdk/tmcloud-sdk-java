/*
 * Copyright (c) TM Technologies Co., Ltd. 2022-2022. All rights reserved.
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

import com.tmcloud.sdk.core.Constants;
import org.openeuler.BGMProvider;

import java.security.Security;

public class SM3AKSKSigner extends AKSKSigner {
    private static volatile SM3AKSKSigner instance;

    protected SM3AKSKSigner() {
        super();
        this.algorithm = Constants.SDK_HMAC_SM3;
        this.contentHeader = Constants.X_SDK_CONTENT_SM3;
        this.emptyHash = "1ab21d8355cfa17f8e61194831e81a8f22bec8c728fefb747ed035eb5082aa2b";
        this.hasher = new SM3Hasher();
    }

    public static SM3AKSKSigner getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (SM3AKSKSigner.class) {
            if (instance == null) {
                Security.addProvider(new BGMProvider());
                instance = new SM3AKSKSigner();
            }
            return instance;
        }
    }
}
