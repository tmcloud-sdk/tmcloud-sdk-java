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

package com.tmcloud.sdk.core.http;

import java.io.InputStream;
import java.util.Map;

/**
 * @author TMCloud_SDK
 */
public class FormDataFilePart extends FormDataPart<InputStream> {
    private Map<String, String> headers;

    private String filename;

    private String contentType;

    public FormDataFilePart(InputStream inputStream, String filename) {
        super(inputStream);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public FormDataFilePart withHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public FormDataFilePart withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public InputStream getInputStream() {
        return super.getValue();
    }

    public String getContentType() {
        return contentType;
    }
}