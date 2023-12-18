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

import com.tmcloud.sdk.core.utils.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author TMCloud_SDK
 */
public class AuthCache {
    private static final Map<String, String> AUTH_MAP = new ConcurrentHashMap<>();

    /**
     * @param akWithName use ak and regionId as key of project, use ak as key of domain
     * @return find value with akWithName
     */
    public static String getAuth(String akWithName) {
        return StringUtils.isEmpty(akWithName) ? null : AUTH_MAP.get(akWithName);
    }

    /**
     * @param akWithName use ak and regionId as key of project, use ak as key of domain
     * @param id         projectId or domainId of the account
     */
    public static void putAuth(String akWithName, String id) {
        AUTH_MAP.put(akWithName, id);
    }

    /**
     * @param akWithName use ak and regionId as key of project, use ak as key of domain
     */
    public static void removeAuth(String akWithName) {
        AUTH_MAP.remove(akWithName);
    }
}
