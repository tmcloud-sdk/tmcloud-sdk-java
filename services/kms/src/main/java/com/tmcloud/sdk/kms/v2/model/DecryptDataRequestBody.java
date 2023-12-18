package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DecryptDataRequestBody
 */
public class DecryptDataRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cipher_text")

    private String cipherText;

    public static final class EncryptionAlgorithmEnum {

        /**
         * Enum SYMMETRIC_DEFAULT for value: "SYMMETRIC_DEFAULT"
         */
        public static final EncryptionAlgorithmEnum SYMMETRIC_DEFAULT =
            new EncryptionAlgorithmEnum("SYMMETRIC_DEFAULT");

        /**
         * Enum RSAES_OAEP_SHA_256 for value: "RSAES_OAEP_SHA_256"
         */
        public static final EncryptionAlgorithmEnum RSAES_OAEP_SHA_256 =
            new EncryptionAlgorithmEnum("RSAES_OAEP_SHA_256");

        /**
         * Enum SM2_ENCRYPT for value: "SM2_ENCRYPT"
         */
        public static final EncryptionAlgorithmEnum SM2_ENCRYPT = new EncryptionAlgorithmEnum("SM2_ENCRYPT");

        private static final Map<String, EncryptionAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncryptionAlgorithmEnum> createStaticFields() {
            Map<String, EncryptionAlgorithmEnum> map = new HashMap<>();
            map.put("SYMMETRIC_DEFAULT", SYMMETRIC_DEFAULT);
            map.put("RSAES_OAEP_SHA_256", RSAES_OAEP_SHA_256);
            map.put("SM2_ENCRYPT", SM2_ENCRYPT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncryptionAlgorithmEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EncryptionAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncryptionAlgorithmEnum(value));
        }

        public static EncryptionAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncryptionAlgorithmEnum) {
                return this.value.equals(((EncryptionAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_algorithm")

    private EncryptionAlgorithmEnum encryptionAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public DecryptDataRequestBody withCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public DecryptDataRequestBody withEncryptionAlgorithm(EncryptionAlgorithmEnum encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    public EncryptionAlgorithmEnum getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(EncryptionAlgorithmEnum encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public DecryptDataRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public DecryptDataRequestBody withSequence(String sequence) {
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
        DecryptDataRequestBody that = (DecryptDataRequestBody) obj;
        return Objects.equals(this.cipherText, that.cipherText)
            && Objects.equals(this.encryptionAlgorithm, that.encryptionAlgorithm)
            && Objects.equals(this.keyId, that.keyId) && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cipherText, encryptionAlgorithm, keyId, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDataRequestBody {\n");
        sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
        sb.append("    encryptionAlgorithm: ").append(toIndentedString(encryptionAlgorithm)).append("\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
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
