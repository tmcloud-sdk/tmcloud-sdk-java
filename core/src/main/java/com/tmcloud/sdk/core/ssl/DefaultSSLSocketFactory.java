/*
 * Copyright (c) TM Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.tmcloud.sdk.core.ssl;

import com.tmcloud.sdk.core.exception.SdkException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class DefaultSSLSocketFactory {

    private static final Logger logger = LoggerFactory.getLogger(DefaultSSLSocketFactory.class);

    public static SSLSocketFactory getDefaultSSLSocketFactory() {
        return (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    public static X509TrustManager getDefaultX509TrustManager() {
        TrustManagerFactory trustManagerFactory;
        try {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

}


