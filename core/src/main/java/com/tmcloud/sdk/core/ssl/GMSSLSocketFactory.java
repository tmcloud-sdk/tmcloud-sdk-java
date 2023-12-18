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

package com.tmcloud.sdk.core.ssl;

import com.tmcloud.sdk.core.Constants;
import com.tmcloud.sdk.core.exception.SdkException;
import com.tmcloud.sdk.core.utils.RandomUtils;
import org.openeuler.BGMProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;

public class GMSSLSocketFactory {
    private static final Logger logger = LoggerFactory.getLogger(GMSSLSocketFactory.class);

    private static final BGMProvider BGM_PROVIDER = new BGMProvider();

    private static final X509TrustManager TRUST_MANAGER = createX509TrustManager();

    private static X509TrustManager createX509TrustManager() {
        TrustManagerFactory trustManagerFactory;
        try {
            trustManagerFactory = TrustManagerFactory.getInstance(
                    TrustManagerFactory.getDefaultAlgorithm(), BGM_PROVIDER);
            trustManagerFactory.init((KeyStore) null);
        } catch (NoSuchAlgorithmException | KeyStoreException e) {
            logger.error("Unable to retrieve default TrustManagerFactory", e);
            throw new SdkException("Unable to retrieve default TrustManagerFactory", e);
        }

        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }

        logger.error("No X509TrustManager found");
        throw new SdkException("No X509TrustManager found");
    }

    public static SSLContext getSSLContext() {
        return getSSLContext(RandomUtils.getDefaultSecureRandom());
    }

    public static SSLContext getSSLContext(SecureRandom secureRandom) {
        try {
            SSLContext sslContext = SSLContext.getInstance(
                    Constants.TLS_PROTOCOL_GM, Constants.SECURITY_PROVIDER_BGM);
            sslContext.init(null, new TrustManager[]{TRUST_MANAGER}, secureRandom);
            return sslContext;
        } catch (NoSuchAlgorithmException e) {
            logger.error("Init SSL Context Error", e);
            throw new SdkException("Init SSL Context Error", e);
        } catch (NoSuchProviderException e) {
            logger.error("Init SSL Provider Error", e);
            throw new SdkException("Init SSL Provider Error", e);
        } catch (KeyManagementException e) {
            logger.error("Init SSL KeyManagement Error", e);
            throw new SdkException("Init SSL KeyManagement Error", e);
        }
    }

    public static X509TrustManager getX509TrustManager() {
        return TRUST_MANAGER;
    }

    static {
        if (Security.getProvider(Constants.SECURITY_PROVIDER_BGM) == null) {
            Security.addProvider(BGM_PROVIDER);
        }
    }
}