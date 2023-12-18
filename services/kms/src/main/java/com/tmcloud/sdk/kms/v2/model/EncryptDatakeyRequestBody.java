package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EncryptDatakeyRequestBody
 */
public class EncryptDatakeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plain_text")

    private String plainText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_plain_length")

    private String datakeyPlainLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public EncryptDatakeyRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public EncryptDatakeyRequestBody withPlainText(String plainText) {
        this.plainText = plainText;
        return this;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public EncryptDatakeyRequestBody withDatakeyPlainLength(String datakeyPlainLength) {
        this.datakeyPlainLength = datakeyPlainLength;
        return this;
    }

    public String getDatakeyPlainLength() {
        return datakeyPlainLength;
    }

    public void setDatakeyPlainLength(String datakeyPlainLength) {
        this.datakeyPlainLength = datakeyPlainLength;
    }

    public EncryptDatakeyRequestBody withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncryptDatakeyRequestBody that = (EncryptDatakeyRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.plainText, that.plainText)
            && Objects.equals(this.datakeyPlainLength, that.datakeyPlainLength)
            && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, plainText, datakeyPlainLength, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptDatakeyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    plainText: ").append(toIndentedString(plainText)).append("\n");
        sb.append("    datakeyPlainLength: ").append(toIndentedString(datakeyPlainLength)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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
