package com.tmcloud.sdk.core.exception;

import com.tmcloud.sdk.core.http.HttpRequest;
import com.tmcloud.sdk.core.http.HttpResponse;

public interface ExceptionHandler {
    void handleException(HttpRequest httpRequest, HttpResponse httpResponse) throws ServiceResponseException;
}
