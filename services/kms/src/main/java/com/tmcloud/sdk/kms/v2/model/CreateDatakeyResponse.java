package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tmcloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateDatakeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plain_text")

    private String plainText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher_text")

    private String cipherText;

    public CreateDatakeyResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public CreateDatakeyResponse withPlainText(String plainText) {
        this.plainText = plainText;
        return this;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public CreateDatakeyResponse withCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDatakeyResponse that = (CreateDatakeyResponse) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.plainText, that.plainText)
            && Objects.equals(this.cipherText, that.cipherText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, plainText, cipherText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatakeyResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    plainText: ").append(toIndentedString(plainText)).append("\n");
        sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
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
