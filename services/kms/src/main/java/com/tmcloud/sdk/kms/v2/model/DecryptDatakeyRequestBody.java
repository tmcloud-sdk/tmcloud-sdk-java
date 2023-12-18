package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DecryptDatakeyRequestBody
 */
public class DecryptDatakeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher_text")

    private String cipherText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_cipher_length")

    private String datakeyCipherLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public DecryptDatakeyRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public DecryptDatakeyRequestBody withCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public DecryptDatakeyRequestBody withDatakeyCipherLength(String datakeyCipherLength) {
        this.datakeyCipherLength = datakeyCipherLength;
        return this;
    }

    public String getDatakeyCipherLength() {
        return datakeyCipherLength;
    }

    public void setDatakeyCipherLength(String datakeyCipherLength) {
        this.datakeyCipherLength = datakeyCipherLength;
    }

    public DecryptDatakeyRequestBody withSequence(String sequence) {
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
        DecryptDatakeyRequestBody that = (DecryptDatakeyRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.cipherText, that.cipherText)
            && Objects.equals(this.datakeyCipherLength, that.datakeyCipherLength)
            && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, cipherText, datakeyCipherLength, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDatakeyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
        sb.append("    datakeyCipherLength: ").append(toIndentedString(datakeyCipherLength)).append("\n");
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
