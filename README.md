<p align="center">
<a href="https://www.tmone.com.my/"><img src="https://www.tmone.com.my/wp-content/themes/TM_One_Theme/images/tmone-logo.svg" width="82px" height="56px"></a>
</p>

<h1 align="center">TM Cloud Java Software Development Kit (Java SDK)</h1>

The TM Cloud Java SDK allows you to easily work with TM Cloud services such as Elastic Compute Service (ECS) and
Virtual Private Cloud (VPC) without the need to handle API related tasks.

This document introduces how to obtain and use TM Cloud Java SDK.

## Requirements

- To use TM Cloud Java SDK, you must have TM Cloud account as well as the Access Key (AK) and Secret key (SK) of the
  TM Cloud account. You can create an Access Key in the TM Cloud console.

- To use TM Cloud Java SDK to access the APIs of specific service, please make sure you do have activated the
  service in [TM Cloud console](https://console.alphaedge.tmone.com.my/) if needed.

- TM Cloud Java SDK requires **Java JDK 1.8** or later.

## Install Java SDK

It is recommended to use Maven to declare dependencies to use our Java SDK.

At first, you need to [download](https://maven.apache.org/download.cgi)
and [install](https://maven.apache.org/install.html) Maven, and then declare dependencies in the `pom.xml` file in your
Java project.

Please choose a specific version number when specifying dependencies, otherwise it may cause unforeseen issues at build time.

### Individual Services

You can add depenencies for the specific services only. Take using ECS and VPC SDK for example, you need to
import `tmcloud-sdk-ecs` and `tmcloud-sdk-vpc` libraries:

``` xml
<dependency>
    <groupId>io.github.tmcloud-sdk</groupId>
    <artifactId>tmcloud-sdk-ecs</artifactId>
    <version>[0.0.1-beta, 1.0.0)</version>
</dependency>
<dependency>
    <groupId>io.github.tmcloud-sdk</groupId>
    <artifactId>tmcloud-sdk-vpc</artifactId>
    <version>[0.0.1-beta, 1.0.0)</version>
</dependency>
```

## Code Example

- The following example shows how to query a list of VPCs synchronously in a specific region, you need to substitute
  your real `{Service}Client` for `VpcClient` in actual use.
- Substitute the values for `{your ak string}`, `{your sk string}`, `{your endpoint string}` and `{your project id}`.

``` java
package com.tmcloud.sdk.test;

/* Import dependent module */
// Logger
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// Authentication
import com.tmcloud.sdk.core.auth.BasicCredentials;
// Service response exception class
import com.tmcloud.sdk.core.exception.ServiceResponseException;
// Http Configuration
import com.tmcloud.sdk.core.http.HttpConfig;
import com.tmcloud.sdk.vpc.v2.VpcClient;
// Import the request and response classes
import com.tmcloud.sdk.vpc.v2.model.ListVpcsRequest;
import com.tmcloud.sdk.vpc.v2.model.ListVpcsResponse;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void listVpcs(VpcClient client) {
        try {
            // Instantiate the ListVpcsRequest object and call the listVpcs interface
            ListVpcsResponse listVpcsResponse = client.listVpcs(new ListVpcsRequest().withLimit(1));
            // Output string response in json format
            logger.info(listVpcsResponse.toString());
        } catch (ServiceResponseException e) {
            logger.error("HttpStatusCode: " + e.getHttpStatusCode());
            logger.error("RequestId: " + e.getRequestId());
            logger.error("ErrorCode: " + e.getErrorCode());
            logger.error("ErrorMsg: " + e.getErrorMsg());
        }
    }

    public static void main(String[] args) {
        String ak = "{your ak string}";
        String sk = "{your sk string}";
        String endpoint = "{your endpoint string}";
        String projectId = "{your project id}";

        // Http Configuration for client
        HttpConfig config = HttpConfig.getDefaultHttpConfig();
        config.withIgnoreSSLVerification(true);

        // Create the authentication
        BasicCredentials auth = new BasicCredentials()
            .withAk(ak)
            .withSk(sk)
            .withProjectId(projectId);

        // Create VpcClient instance
        VpcClient vpcClient = VpcClient.newBuilder()
            .withHttpConfig(config)
            .withCredential(auth)
            .withEndpoint(endpoint)
            .build();

        listVpcs(vpcClient);
    }
}
```

## Changelog

Detailed changes for each released version are documented in
the [CHANGELOG.md](https://github.com/tmcloud-sdk/tmcloud-sdk-java/blob/master/CHANGELOG.md).

## User Manual [:top:](#tm-cloud-java-software-development-kit-java-sdk)

* [1. Client Configuration](#1-client-configuration-top)
    * [1.1 Default Configuration](#11-default-configuration-top)
    * [1.2 Network Proxy](#12-network-proxy-top)
    * [1.3 Timeout Configuration](#13-timeout-configuration-top)
    * [1.4 SSL Certification](#14-ssl-certification-top)
* [2. Credentials Configuration](#2-credentials-configuration-top)
    * [2.1 Use Permanent AK&SK](#21-use-permanent-aksk-top)
    * [2.2 Use Temporary AK&SK](#22-use-temporary-aksk-top)
* [3. Client Initialization](#3-client-initialization-top)
    * [3.1 Initialize the client with specified Endpoint](#31-initialize-the-serviceclient-with-specified-endpoint-top)
* [4. Send Requests and Handle Responses](#4-send-requests-and-handle-responses-top)
    * [4.1 Exceptions](#41-exceptions-top)
* [5. Use Asynchronous Client](#5-use-asynchronous-client-top)
* [6. Troubleshooting](#6-troubleshooting-top)
    * [6.1 Access Log](#61-access-log-top)
    * [6.2 Original HTTP Listener](#62-original-http-listener-top)
* [7. Retry For Request](#7-retry-for-request-top)
    * [7.1 Synchronous Retry](#71-synchronous-retry-top)
    * [7.2 Asynchronous Retry](#72-asynchronous-retry-top)
    * [7.3 Typical Usage Scenarios](#73-typical-usage-scenarios-top)

### 1. Client Configuration [:top:](#user-manual-top)

#### 1.1 Default Configuration [:top:](#user-manual-top)

``` java
// Use default configuration
HttpConfig config = HttpConfig.getDefaultHttpConfig();
```

#### 1.2 Network Proxy [:top:](#user-manual-top)

Java SDK only supports HTTP proxy configuration currently.

``` java
// Use network proxy if needed, the default protocol is `http`
config.withProxyHost("proxy.tm.com")
    .withProxyPort(8080)
    .withProxyUsername("test")
    .withProxyPassword("test");
```

#### 1.3 Timeout Configuration [:top:](#user-manual-top)

``` java
// The default connection timeout is 60 seconds, change it if needed
config.withTimeout(60);
```

#### 1.4 SSL Certification [:top:](#user-manual-top)

Skip SSL certification:

``` java
// Skip SSL certification checking while using https protocol if needed
config.withIgnoreSSLVerification(true);
```

Customized configuration:

```java
// Configure SSLSocketFactory and TrustManager
config.withSSLSocketFactory(sslSocketFactory).
    withX509TrustManager(trustManager);
```

### 2. Credentials Configuration [:top:](#user-manual-top)

There are two types of TM Cloud services, `regional` services and `global` services.

Global services contain IAM.

For `regional` services' authentication, projectId is required to initialize BasicCredentials. 

For `global` services' authentication, domainId is required to initialize GlobalCredentials.

The following authentications are supported:

- permanent AK&SK
- temporary AK&SK + SecurityToken

**Parameter description**:

- `ak` is the access key ID for your account.
- `sk` is the secret access key for your account.
- `projectId` is the ID of your project depending on the region you want to operate.
- `domainId` is the account ID of TM Cloud.
- `securityToken` is the security token when using temporary AK/SK.

#### 2.1 Use Permanent AK&SK [:top:](#user-manual-top)

**Parameter description**:

- `ak` is the access key ID for your account.
- `sk` is the secret access key for your account.
- `projectId` is the ID of your project depending on the region you want to operate.
- `domainId` is the account ID of TM Cloud.

``` java
// Regional Services
    BasicCredentials basicCredentials = new BasicCredentials()
    .withAk(ak)
    .withSk(sk)
    .withProjectId(projectId)

// Global Services
GlobalCredentials globalCredentials = new GlobalCredentials()
    .withAk(ak)
    .withSk(sk)
    .withDomainId(domainId);
```

#### 2.2 Use Temporary AK&SK [:top:](#user-manual-top)

A temporary access key and securityToken are issued by the system to IAM users, and can be valid for 15 minutes to 24 hours. After the validity period expires, you need to obtain them again. It's required to obtain temporary AK&SK and security token first, which could be obtained through
permanent AK&SK or through an agency.

- Obtaining a temporary access key and security token through token, you could refer to
document: [Obtaining a Temporary AK/SK](https://support.alphaedge.tmone.com.my/en-us/api/iam/en-us_topic_0097949518.html). The API mentioned in the document above
corresponds to the method of `CreateTemporaryAccessKeyByToken` in IAM SDK.

**Parameter description**:

- `ak` is the access key ID for your account.
- `sk` is the secret access key for your account.
- `projectId` is the ID of your project depending on the region you want to operate.
- `domainId` is the account ID of TM Cloud.
- `securityToken` is the security token when using temporary AK/SK.

``` java
// Regional services
BasicCredentials basicCredentials = new BasicCredentials()
    .withAk(ak)
    .withSk(sk)
    .withSecurityToken(securityToken)
    .withProjectId(projectId)

// Global services
GlobalCredentials globalCredentials = new GlobalCredentials()
    .withAk(ak)
    .withSk(sk)
    .withSecurityToken(securityToken)
    .withDomainId(domainId);
```

### 3. Client Initialization [:top:](#user-manual-top)

There are two ways to initialize the {Service}Client, you could choose one you preferred.

#### 3.1 Initialize the {Service}Client with specified Endpoint [:top:](#user-manual-top)

``` java
// Specify the endpoint, take the endpoint of VPC service in region of cn-north-4 for example
String endpoint = "${endpoint}";

// Initialize the credentials, you should provide projectId or domainId in this way, take initializing BasicCredentials for example
BasicCredentials basicCredentials = new BasicCredentials()
    .withAk(ak)
    .withSk(sk)
    .withProjectId(projectId);

// Initialize specified service client instance, take initializing the regional service VPC's VpcClient for example
VpcClient vpcClient = VpcClient.newBuilder()
    .withHttpConfig(config)
    .withCredential(basicCredentials)
    .withEndpoint(endpoint)
    .build();
```

**where:**

- `endpoint` varies by services and regions,
  see [Regions and Endpoints](https://support.alphaedge.tmone.com.my/zh-cn/endpoint/index.html) to obtain correct endpoint.

### 4. Send Requests and Handle Responses [:top:](#user-manual-top)

``` java
// send a request and print response, take interface of ListVpcs for example
ListVpcRequest request = new ListVpcsRequest().withLimit(1);

ListVpcsResponse response = client.listVpcs(request); 
logger.info(response.toString());
```

#### 4.1 Exceptions [:top:](#user-manual-top)

| Level 1 | Notice | Level 2 | Notice |
| :---- | :---- | :---- | :---- |
| ConnectionException | Connection error | HostUnreachableException | host is not reachable |
| | | SslHandShakeException | SSL certification error |
| | | ConnectionTimeoutException | connect timed out |
| RequestTimeoutException | Request timeout | CallTimeoutException | timeout for single request |
| | | RetryOutageException | no response after retrying |
| ServiceResponseException | service response error | ServerResponseException | server inner error, http status code: [500,] |
| | | ClientRequestException | invalid request, http status code: [400? 500) |

``` java
try {
    ListVpcRequest request = new ListVpcsRequest().withLimit(1);

    ListVpcsResponse response = client.listVpcs(request); 
    logger.info(response.toString());
} catch(ServiceResponseException e) {
    logger.error("HttpStatusCode: " + e.getHttpStatusCode());
    logger.error("RequestId: " + e.getRequestId());
    logger.error("ErrorCode: " + e.getErrorCode());
    logger.error("ErrorMsg: " + e.getErrorMsg());
}
```

### 5. Use Asynchronous Client [:top:](#user-manual-top)

``` java
// Initialize asynchronous client, take VpcAsyncClient for example
VpcAsyncClient vpcAsyncClient = VpcAsyncClient.newBuilder()
    .withHttpConfig(config)
    .withCredential(basicCredentials)
    .withEndpoint(endpoint)
    .build();

// send asynchronous request
CompletableFuture<ListVpcsResponse> future = vpcAsyncClient.listVpcsAsync(new ListVpcsRequest().withLimit(1));
// get asynchronous response
ListVpcsResponse response = future.get();
logger.info(response.toString());
```

### 6. Troubleshooting [:top:](#user-manual-top)

SDK supports `Access` log and `Debug` log which could be configured manually.

#### 6.1 Access Log [:top:](#user-manual-top)

**Notice:**
When running SDK, slf4j implementation library is used for printing log. If the log implementation library is not configured when running the
code example, and it prompts as follows:

``` shell
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
```

*For more, refer to [Frequently Asked Questions about SLF4J](https://www.slf4j.org/faq.html)*

The version between slf4j supported by the SDK and the corresponding log implementation is shown in the following table:

| slf4j-api | logback-classic | slf4j-log4j12 | slf4j-simple | slf4j-jdk14 |
|-----------|-----------------|---------------|--------------|-------------|
| 1.7.x     | 1.2.x           | 1.6.x/1.7.x   | 1.6.x/1.7.x  | 1.6.x/1.7.x |

You can add corresponding library for log implementation according to actual situation of your target project. For
example, you can add one of the following dependency to your **pom.xml** file:

**logback**

``` xml
<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.12</version>
</dependency>
```

**log4j**

``` xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-log4j12</artifactId>
    <version>1.7.36</version>
</dependency>
```

**slf4j simple**

``` xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-simple</artifactId>
    <version>1.7.36</version>
</dependency>
```

**jul**

``` xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-jdk14</artifactId>
    <version>1.7.36</version>
</dependency>
```

The SDK will print the access log by default, every request will be recorded to the console.

You can shield access log in the log configuration depending on your project, or print access log to an independent
file.

For example, you can turn off the access log in logback:

``` xml
<logger name="TMCloud-SDK-Access" level="OFF"> </logger>
```

#### 6.2 Original HTTP Listener [:top:](#user-manual-top)

In some situation, you may need to debug your http requests, original http request and response information will be
needed. The SDK provides a listener function to obtain the original encrypted http request and response information.

> :warning:  Warning: The original http log information is used in debugging stage only, please do not print the original http header or body in the production environment. These log information is not encrypted and contains sensitive data such as the password of your ECS virtual machine, or the password of your IAM user account, etc. When the response body is binary content, the body will be printed as "***" without detailed information.

``` java
HttpConfig config = new HttpConfig().addHttpListener(HttpListener.forRequestListener(requestListener ->
    // Original http request message will be printed after registing the listener,
    // Please do not turn on http log printing in the production environment.
    logger.debug("REQUEST: {} {} {} {}",
        requestListener.httpMethod(),
        requestListener.uri(),
        requestListener.headers().entrySet().stream().flatMap(entry ->
            entry.getValue().stream().map(value -> entry.getKey() + " : " + value))
            .collect(Collectors.joining(";")),
        requestListener.body().orElse(""))))
    .addHttpListener(HttpListener.forResponseListener(responseListener ->
        // Original http request message will be printed after registing the listener,
        // Please do not turn on http log printing in the production environment.
        logger.debug("RESPONSE: {} {} {} {} {}",
            responseListener.httpMethod(),
            responseListener.uri(),
            responseListener.statusCode(),
            responseListener.headers().entrySet().stream().flatMap(entry ->
                entry.getValue().stream().map(value -> entry.getKey() + " : " + value))
                .collect(Collectors.joining(";")),
            responseListener.body().orElse(""))));

VpcClient vpcClient = VpcClient.newBuilder()
    .withHttpConfig(config)
    .withCredential(auth)
    .withEndpoint(endpoint)
    .build();
```

### 7. Retry For Request [:top:](#user-manual-top)

When a request encounters a network exception or flow control on the interface, the request needs to be retried. The
Java SDK provides the retry method for our users which could be used to the requests of `GET` HTTP method. The retry
method has been supported on both synchronous client and asynchronous client, if you want to use the retry method, the
following parameters are required: `maxRetryTimes`, `retryCondition` and `backoffStrategy`.

- _maxRetryTimes_: the max value is 30, you could set to a positive integer no more than 30
- _retryCondition_: a lambda function, which determine the condition of when to retry, the java SDK provides a default
  condition, and its code is:

``` java
/**
 * The default retry condition, if the exception is ConnectionException or subclass of ConnectionException, the request would be retried.
 *
 * @param <ResT> Generics of response classes
 * @return BiFunction returns true or false which means whether to retry
 */
public static <ResT> BiFunction<ResT, SdkException, Boolean> defaultRetryCondition() {
    return (resp, exception) -> {
        if (Objects.nonNull(exception)) {
            return ConnectionException.class.isAssignableFrom(exception.getClass());
        }
        return false;
    };
}
```

- _backoffStrategy_: calculate the wait duration before next retry, the java SDK provides the default strategy which
  combines
  `random backoff` and `exponential backoff` as the algorithm to calculate the delay time before the next retry.

Now let's begin to introduce how could you use retry for different scenarios.

#### 7.1 Synchronous Retry [:top:](#user-manual-top)

If you want to use retry in synchronous client, you could use `invoker()` method in `{Service}Client`.

Take the interface `ShowJob` of ECS service for example, assume the request would retry at most 5 times, and the retry
condition use the default condition, the code would be like the following:

``` java
// initialize the sychronous client
EcsClient client = EcsClient.newBuilder()
    .withCredential(basicCredentials)
    .withRegion(EcsRegion.CN_NORTH_4)
    .withHttpConfig(config)
    .build();

String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    ShowJobResponse response = client.showJobInvoker(request)
    // max retry times
    .retryTimes(5)
    // retry condition, which would be retried for ConnectionException
    .retryCondition(BaseInvoker.defaultRetryCondition())
    .invoke();
    logger.info(response.toString());
} catch (SdkException e) {
    logger.error("", e);
}
```

#### 7.2 Asynchronous Retry [:top:](#user-manual-top)

If you want to use retry in asynchronous client, you could use `invoker()` method in `{Service}Client`.

Take the interface `ShowJob` of ECS service for example, assume the request would retry at most 5 times, and the retry
condition use the default condition, the code would be like the following:

``` java
// initialize the asychronous client
String endpoint = "{endpoint}";

EcsAsyncClient asyncClient = EcsAsyncClient.newBuilder()
    .withCredential(basicCredentials)
    .withEndpoint(endpoint)
    .withHttpConfig(config)
    .build();

String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    ShowJobResponse response = asyncClient.showJobAsyncInvoker(request)
    // max retry times
    .retryTimes(5)
    // retry condition, which would be retried for ConnectionException
    .retryCondition(BaseInvoker.defaultRetryCondition())
    .invoke();
    logger.info(response.toString());
} catch (SdkException e) {
    logger.error("", e);
}
```

#### 7.3 Typical Usage Scenarios [:top:](#user-manual-top)

**Scenario 1**: If the response status code of the interface is 500(Server Error) or 429(Server Flow Control), retry for
the request, and the code would be like the following:

``` java 
String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    ShowJobResponse response = client.showJobInvoker(request)
        .retryTimes(3)
        .retryCondition(
            (resp, ex) -> Objects.nonNull(ex) && ServiceResponseException.class.isAssignableFrom(ex.getClass())
                && (((ServiceResponseException) ex).getHttpStatusCode() == 429
                || ((ServiceResponseException) ex).getHttpStatusCode() == 500))
        .invoke();
    logger.info(response.toString());
} catch (InterruptedException e) {
    logger.error("InterruptedException", e);
} catch (ExecutionException e) {
    logger.error("ExecutionException", e);
}
```

**Scenario 2**: Retry for the specified job status, if the job status is success, then stop retry and do some other
things, and the code would be like the following:

``` java
String jobId = "{valid job id}";
ShowJobRequest request = new ShowJobRequest().withJobId(jobId);
try {
    // base delay of retry in milliseconeds
    final int baseDelay = 1000;
    // max backoff time in retry
    final int maxBackoffInMilliseconds = 30000;

    ShowJobResponse response = client.showJobInvoker(request)
    // max retry times
    .retryTimes(10)
    // Request retry condition, set the retry condition to stop when the job status is success
    .retryCondition((resp, ex) -> Objects.nonNull(resp) && !resp.getStatus().equals(ShowJobResponse.StatusEnum.SUCCESS))
     // Request backoff policy, calculate the next request time after each request fails
     // Polling job status requires a long basic delay
    .backoffStrategy(new SdkBackoffStrategy(baseDelay, maxBackoffInMilliseconds))
    .invoke();
    logger.info(response.toString());
} catch (SdkException e) {
    logger.error("", e);
}
```
