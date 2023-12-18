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

/**
 * @author TMCloud_SDK
 */
public final class Constants {
    public static final String LINE_SEPARATOR = "\n";

    public static final String SDK_HMAC_SHA256 = "SDK-HMAC-SHA256";

    public static final String SDK_HMAC_SM3 = "SDK-HMAC-SM3";

    public static final String SDK_ECDSA_P256_SHA256 = "SDK-ECDSA-P256-SHA256";

    public static final String SDK_SM2_SM3 = "SDK-SM2-SM3";

    public static final String SECURITY_PROVIDER_BGM = "BGMProvider";

    public static final String TLS_PROTOCOL_GM = "GMTLS";

    public static final String X_SDK_DATE = "X-Sdk-Date";

    public static final String HTTP_SCHEME = "http";

    public static final String HTTPS_SCHEME = "https";

    public static final String HOST = "Host";

    public static final String CONTENT_TYPE = "Content-Type";

    public static final String CONTENT_LENGTH = "Content-Length";

    public static final String USER_AGENT = "User-Agent";

    public static final String AUTHORIZATION = "Authorization";

    public static final String X_PROJECT_ID = "X-Project-Id";

    public static final String X_DOMAIN_ID = "X-Domain-Id";

    public static final String X_SECURITY_TOKEN = "X-Security-Token";

    public static final String X_AUTH_TOKEN = "X-Auth-Token";

    public static final String X_IDP_ID = "X-Idp-Id";

    public static final String X_SDK_CONTENT_SHA256 = "X-Sdk-Content-Sha256";

    public static final String X_SDK_CONTENT_SM3 = "X-Sdk-Content-Sm3";

    public static final String X_SUBJECT_TOKEN = "X-Subject-Token";

    public static final String UNSIGNED_PAYLOAD = "UNSIGNED-PAYLOAD";

    public static final String CUSTOMIZATION = "Customization";

    public static final String ISO_8601_BASIC_FORMAT = "yyyyMMdd'T'HHmmss'Z'";

    public static final int DEFAULT_CHUNK_SIZE = 4096;

    public static final int DEFAULT_WRITE_BUFFER_STREAM = 8192;

    public static final int DEFAULT_READ_BUFFER_STREAM = 8192;

    public static final long DEFAULT_PROGRESS_INTERVAL = 100 * 1024L;

    /**
     * Supported media type
     */
    public static class MEDIATYPE {
        public static final String APPLICATION_JSON = "application/json";

        public static final String APPLICATION_JSON_UTF8 = "application/json;charset=UTF-8";

        public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";

        public static final String BINARY_OCTET_STREAM = "binary/octet-stream";

        public static final String APPLICATION_BSON = "application/bson";

        public static final String APPLICATION_XML = "application/xml";

        public static final String MULTIPART_FORM_DATA = "multipart/form-data";

        public static final String TEXT = "text";

        public static final String IMAGE = "image";
    }

    public static final String BODY = "body";

    public static final String ERROR_CODE = "error_code";

    public static final String ERROR_MSG = "error_msg";

    public static final String REQUEST_ID = "request_id";

    public static final String X_REQUEST_ID = "X-Request-Id";

    public static final String ENCODED_AUTHORIZATION_MESSAGE = "encoded_authorization_message";

    public static final String CODE = "code";

    public static final String MESSAGE = "message";

    public static final String PROJECT_ID = "project_id";

    public static final String DOMAIN_ID = "domain_id";

    public static final String SDK_EXCHANGE = "SDK_EXCHANGE";

    public static final String DEFAULT_IAM_ENDPOINT = "https://iam.my-kualalumpur-1.alphaedge.tmone.com.my";

    public static final String IAM_ENDPOINT_ENV_NAME = "TMCLOUD_SDK_IAM_ENDPOINT";

    public static final String DEFAULT_ENDPOINT_REG =
            "^[a-z][a-z0-9-]+(\\.[a-z]{2,}-[a-z]+-\\d{1,2})?\\.(my)?(tmone.com).(com|my)";

    public static final String GLOBAL_REGION_ID = "globe";

    public static final String DEFAULT_PROFILE_DIR_NAME = ".tmcloud";

    public static class ErrorMessage {
        public static final String NO_DOMAIN_ID_FOUND = "no domain id found," +
                " please select one of the following solutions:\n" +
                "  1. Manually specify domainId when initializing the credentials," +
                " GlobalCredentials cred = new GlobalCredentials().withAk(ak).withSk(sk).withDomainId(domainId)\n" +
                "  2. Use the domain account to grant IAM read permission to the current account\n" +
                "  3. Replace the ak/sk of the IAM account with the ak/sk of the domain account";

        public static final String NO_PROJECT_ID_FOUND = "no project id found," +
                " please select one of the following solutions:\n" +
                "  1. Manually specify projectId when initializing the credentials," +
                " BasicCredentials cred = new BasicCredentials().withAk(ak).withSk(sk).withProjectId(projectId)\n" +
                "  2. Use the domain account to grant IAM read permission to the current account\n" +
                "  3. Replace the ak/sk of the IAM account with the ak/sk of the domain account";
    }

    /**
     * some special status code
     */
    public static class StatusCode {
        public static final int SUCCESS = 200;

        public static final int CLIENT_ERROR = 400;

        public static final int TOO_MANY_REQUEST = 429;

        public static final int SERVER_ERROR = 500;

        public static final int SERVER_ERROR_UPPER_LIMIT = 600;
    }

    /**
     * credential type
     */
    public static class Credentials {
        public static final String BASIC_CREDENTIAL = "BasicCredentials";

        public static final String GLOBAL_CREDENTIAL = "GlobalCredentials";

        public static final String BASIC = "basic";

        public static final String GLOBAL = "global";
    }

    /**
     * The utility class should hide the public constructor
     */
    private Constants() {

    }
}
