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
 * CreateDatakeyRequestBody
 */
public class CreateDatakeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    public static final class KeySpecEnum {

        /**
         * Enum AES_256 for value: "AES_256"
         */
        public static final KeySpecEnum AES_256 = new KeySpecEnum("AES_256");

        /**
         * Enum AES_128 for value: "AES_128"
         */
        public static final KeySpecEnum AES_128 = new KeySpecEnum("AES_128");

        private static final Map<String, KeySpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeySpecEnum> createStaticFields() {
            Map<String, KeySpecEnum> map = new HashMap<>();
            map.put("AES_256", AES_256);
            map.put("AES_128", AES_128);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeySpecEnum(String value) {
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
        public static KeySpecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeySpecEnum(value));
        }

        public static KeySpecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeySpecEnum) {
                return this.value.equals(((KeySpecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_spec")

    private KeySpecEnum keySpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_length")

    private String datakeyLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public CreateDatakeyRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public CreateDatakeyRequestBody withKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    public KeySpecEnum getKeySpec() {
        return keySpec;
    }

    public void setKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
    }

    public CreateDatakeyRequestBody withDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
        return this;
    }

    public String getDatakeyLength() {
        return datakeyLength;
    }

    public void setDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
    }

    public CreateDatakeyRequestBody withSequence(String sequence) {
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
        CreateDatakeyRequestBody that = (CreateDatakeyRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.keySpec, that.keySpec)
            && Objects.equals(this.datakeyLength, that.datakeyLength) && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, keySpec, datakeyLength, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatakeyRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
        sb.append("    datakeyLength: ").append(toIndentedString(datakeyLength)).append("\n");
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
