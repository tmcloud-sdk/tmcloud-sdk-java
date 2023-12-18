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
 * VerifyRequestBody
 */
public class VerifyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    public static final class SigningAlgorithmEnum {

        /**
         * Enum RSASSA_PSS_SHA_256 for value: "RSASSA_PSS_SHA_256"
         */
        public static final SigningAlgorithmEnum RSASSA_PSS_SHA_256 = new SigningAlgorithmEnum("RSASSA_PSS_SHA_256");

        /**
         * Enum RSASSA_PSS_SHA_384 for value: "RSASSA_PSS_SHA_384"
         */
        public static final SigningAlgorithmEnum RSASSA_PSS_SHA_384 = new SigningAlgorithmEnum("RSASSA_PSS_SHA_384");

        /**
         * Enum RSASSA_PSS_SHA_512 for value: "RSASSA_PSS_SHA_512"
         */
        public static final SigningAlgorithmEnum RSASSA_PSS_SHA_512 = new SigningAlgorithmEnum("RSASSA_PSS_SHA_512");

        /**
         * Enum RSASSA_PKCS1_V1_5_SHA_256 for value: "RSASSA_PKCS1_V1_5_SHA_256"
         */
        public static final SigningAlgorithmEnum RSASSA_PKCS1_V1_5_SHA_256 =
            new SigningAlgorithmEnum("RSASSA_PKCS1_V1_5_SHA_256");

        /**
         * Enum RSASSA_PKCS1_V1_5_SHA_384 for value: "RSASSA_PKCS1_V1_5_SHA_384"
         */
        public static final SigningAlgorithmEnum RSASSA_PKCS1_V1_5_SHA_384 =
            new SigningAlgorithmEnum("RSASSA_PKCS1_V1_5_SHA_384");

        /**
         * Enum RSASSA_PKCS1_V1_5_SHA_512 for value: "RSASSA_PKCS1_V1_5_SHA_512"
         */
        public static final SigningAlgorithmEnum RSASSA_PKCS1_V1_5_SHA_512 =
            new SigningAlgorithmEnum("RSASSA_PKCS1_V1_5_SHA_512");

        /**
         * Enum ECDSA_SHA_256 for value: "ECDSA_SHA_256"
         */
        public static final SigningAlgorithmEnum ECDSA_SHA_256 = new SigningAlgorithmEnum("ECDSA_SHA_256");

        /**
         * Enum ECDSA_SHA_384 for value: "ECDSA_SHA_384"
         */
        public static final SigningAlgorithmEnum ECDSA_SHA_384 = new SigningAlgorithmEnum("ECDSA_SHA_384");

        /**
         * Enum ECDSA_SHA_512 for value: "ECDSA_SHA_512"
         */
        public static final SigningAlgorithmEnum ECDSA_SHA_512 = new SigningAlgorithmEnum("ECDSA_SHA_512");

        /**
         * Enum SM2DSA_SM3 for value: "SM2DSA_SM3"
         */
        public static final SigningAlgorithmEnum SM2DSA_SM3 = new SigningAlgorithmEnum("SM2DSA_SM3");

        private static final Map<String, SigningAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SigningAlgorithmEnum> createStaticFields() {
            Map<String, SigningAlgorithmEnum> map = new HashMap<>();
            map.put("RSASSA_PSS_SHA_256", RSASSA_PSS_SHA_256);
            map.put("RSASSA_PSS_SHA_384", RSASSA_PSS_SHA_384);
            map.put("RSASSA_PSS_SHA_512", RSASSA_PSS_SHA_512);
            map.put("RSASSA_PKCS1_V1_5_SHA_256", RSASSA_PKCS1_V1_5_SHA_256);
            map.put("RSASSA_PKCS1_V1_5_SHA_384", RSASSA_PKCS1_V1_5_SHA_384);
            map.put("RSASSA_PKCS1_V1_5_SHA_512", RSASSA_PKCS1_V1_5_SHA_512);
            map.put("ECDSA_SHA_256", ECDSA_SHA_256);
            map.put("ECDSA_SHA_384", ECDSA_SHA_384);
            map.put("ECDSA_SHA_512", ECDSA_SHA_512);
            map.put("SM2DSA_SM3", SM2DSA_SM3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SigningAlgorithmEnum(String value) {
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
        public static SigningAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SigningAlgorithmEnum(value));
        }

        public static SigningAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SigningAlgorithmEnum) {
                return this.value.equals(((SigningAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signing_algorithm")

    private SigningAlgorithmEnum signingAlgorithm;

    public static final class MessageTypeEnum {

        /**
         * Enum DIGEST for value: "DIGEST"
         */
        public static final MessageTypeEnum DIGEST = new MessageTypeEnum("DIGEST");

        /**
         * Enum RAW for value: "RAW"
         */
        public static final MessageTypeEnum RAW = new MessageTypeEnum("RAW");

        private static final Map<String, MessageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MessageTypeEnum> createStaticFields() {
            Map<String, MessageTypeEnum> map = new HashMap<>();
            map.put("DIGEST", DIGEST);
            map.put("RAW", RAW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MessageTypeEnum(String value) {
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
        public static MessageTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MessageTypeEnum(value));
        }

        public static MessageTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MessageTypeEnum) {
                return this.value.equals(((MessageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_type")

    private MessageTypeEnum messageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public VerifyRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public VerifyRequestBody withMessage(String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public VerifyRequestBody withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public VerifyRequestBody withSigningAlgorithm(SigningAlgorithmEnum signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
        return this;
    }

    public SigningAlgorithmEnum getSigningAlgorithm() {
        return signingAlgorithm;
    }

    public void setSigningAlgorithm(SigningAlgorithmEnum signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    public VerifyRequestBody withMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    public VerifyRequestBody withSequence(String sequence) {
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
        VerifyRequestBody that = (VerifyRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.message, that.message)
            && Objects.equals(this.signature, that.signature)
            && Objects.equals(this.signingAlgorithm, that.signingAlgorithm)
            && Objects.equals(this.messageType, that.messageType) && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, message, signature, signingAlgorithm, messageType, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    signingAlgorithm: ").append(toIndentedString(signingAlgorithm)).append("\n");
        sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
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
