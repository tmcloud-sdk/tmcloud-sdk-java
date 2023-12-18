package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tmcloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateParametersForImportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_token")

    private String importToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private Long expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_key")

    private String publicKey;

    public CreateParametersForImportResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public CreateParametersForImportResponse withImportToken(String importToken) {
        this.importToken = importToken;
        return this;
    }

    public String getImportToken() {
        return importToken;
    }

    public void setImportToken(String importToken) {
        this.importToken = importToken;
    }

    public CreateParametersForImportResponse withExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public CreateParametersForImportResponse withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateParametersForImportResponse that = (CreateParametersForImportResponse) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.importToken, that.importToken)
            && Objects.equals(this.expirationTime, that.expirationTime)
            && Objects.equals(this.publicKey, that.publicKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, importToken, expirationTime, publicKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateParametersForImportResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    importToken: ").append(toIndentedString(importToken)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
