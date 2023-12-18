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
 * GetParametersForImportRequestBody
 */
public class GetParametersForImportRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    public static final class WrappingAlgorithmEnum {

        /**
         * Enum RSAES_OAEP_SHA_256 for value: "RSAES_OAEP_SHA_256"
         */
        public static final WrappingAlgorithmEnum RSAES_OAEP_SHA_256 = new WrappingAlgorithmEnum("RSAES_OAEP_SHA_256");

        /**
         * Enum SM2_ENCRYPT for value: "SM2_ENCRYPT"
         */
        public static final WrappingAlgorithmEnum SM2_ENCRYPT = new WrappingAlgorithmEnum("SM2_ENCRYPT");

        private static final Map<String, WrappingAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WrappingAlgorithmEnum> createStaticFields() {
            Map<String, WrappingAlgorithmEnum> map = new HashMap<>();
            map.put("RSAES_OAEP_SHA_256", RSAES_OAEP_SHA_256);
            map.put("SM2_ENCRYPT", SM2_ENCRYPT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WrappingAlgorithmEnum(String value) {
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
        public static WrappingAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WrappingAlgorithmEnum(value));
        }

        public static WrappingAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WrappingAlgorithmEnum) {
                return this.value.equals(((WrappingAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wrapping_algorithm")

    private WrappingAlgorithmEnum wrappingAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public GetParametersForImportRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public GetParametersForImportRequestBody withWrappingAlgorithm(WrappingAlgorithmEnum wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }

    public WrappingAlgorithmEnum getWrappingAlgorithm() {
        return wrappingAlgorithm;
    }

    public void setWrappingAlgorithm(WrappingAlgorithmEnum wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
    }

    public GetParametersForImportRequestBody withSequence(String sequence) {
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
        GetParametersForImportRequestBody that = (GetParametersForImportRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.wrappingAlgorithm, that.wrappingAlgorithm)
            && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, wrappingAlgorithm, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetParametersForImportRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    wrappingAlgorithm: ").append(toIndentedString(wrappingAlgorithm)).append("\n");
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
