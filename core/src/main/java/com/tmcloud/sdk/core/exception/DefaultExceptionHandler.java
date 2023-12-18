package com.tmcloud.sdk.core.exception;

import com.tmcloud.sdk.core.Constants;
import com.tmcloud.sdk.core.http.HttpRequest;
import com.tmcloud.sdk.core.http.HttpResponse;
import com.tmcloud.sdk.core.utils.ExceptionUtils;

public class DefaultExceptionHandler implements ExceptionHandler {
    @Override
    public void handleException(HttpRequest httpRequest, HttpResponse httpResponse) {
        if (httpResponse.getStatusCode() >= Constants.StatusCode.CLIENT_ERROR) {
            throw ServiceResponseException.mapException(httpResponse.getStatusCode(),
                    ExceptionUtils.extractErrorMessage(httpResponse));
        }
    }
}
