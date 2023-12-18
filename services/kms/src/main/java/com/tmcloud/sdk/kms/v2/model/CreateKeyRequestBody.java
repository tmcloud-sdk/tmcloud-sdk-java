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
 * CreateKeyRequestBody
 */
public class CreateKeyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_alias")

    private String keyAlias;

    public static final class KeySpecEnum {

        /**
         * Enum AES_256 for value: "AES_256"
         */
        public static final KeySpecEnum AES_256 = new KeySpecEnum("AES_256");

        /**
         * Enum SM4 for value: "SM4"
         */
        public static final KeySpecEnum SM4 = new KeySpecEnum("SM4");

        /**
         * Enum RSA_2048 for value: "RSA_2048"
         */
        public static final KeySpecEnum RSA_2048 = new KeySpecEnum("RSA_2048");

        /**
         * Enum RSA_3072 for value: "RSA_3072"
         */
        public static final KeySpecEnum RSA_3072 = new KeySpecEnum("RSA_3072");

        /**
         * Enum RSA_4096 for value: "RSA_4096"
         */
        public static final KeySpecEnum RSA_4096 = new KeySpecEnum("RSA_4096");

        /**
         * Enum EC_P256 for value: "EC_P256"
         */
        public static final KeySpecEnum EC_P256 = new KeySpecEnum("EC_P256");

        /**
         * Enum EC_P384 for value: "EC_P384"
         */
        public static final KeySpecEnum EC_P384 = new KeySpecEnum("EC_P384");

        /**
         * Enum SM2 for value: "SM2"
         */
        public static final KeySpecEnum SM2 = new KeySpecEnum("SM2");

        private static final Map<String, KeySpecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeySpecEnum> createStaticFields() {
            Map<String, KeySpecEnum> map = new HashMap<>();
            map.put("AES_256", AES_256);
            map.put("SM4", SM4);
            map.put("RSA_2048", RSA_2048);
            map.put("RSA_3072", RSA_3072);
            map.put("RSA_4096", RSA_4096);
            map.put("EC_P256", EC_P256);
            map.put("EC_P384", EC_P384);
            map.put("SM2", SM2);
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

    public static final class KeyUsageEnum {

        /**
         * Enum ENCRYPT_DECRYPT for value: "ENCRYPT_DECRYPT"
         */
        public static final KeyUsageEnum ENCRYPT_DECRYPT = new KeyUsageEnum("ENCRYPT_DECRYPT");

        /**
         * Enum SIGN_VERIFY for value: "SIGN_VERIFY"
         */
        public static final KeyUsageEnum SIGN_VERIFY = new KeyUsageEnum("SIGN_VERIFY");

        private static final Map<String, KeyUsageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyUsageEnum> createStaticFields() {
            Map<String, KeyUsageEnum> map = new HashMap<>();
            map.put("ENCRYPT_DECRYPT", ENCRYPT_DECRYPT);
            map.put("SIGN_VERIFY", SIGN_VERIFY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyUsageEnum(String value) {
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
        public static KeyUsageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeyUsageEnum(value));
        }

        public static KeyUsageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyUsageEnum) {
                return this.value.equals(((KeyUsageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_usage")

    private KeyUsageEnum keyUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_description")

    private String keyDescription;

    public static final class OriginEnum {

        /**
         * Enum KMS for value: "kms"
         */
        public static final OriginEnum KMS = new OriginEnum("kms");

        /**
         * Enum EXTERNAL for value: "external"
         */
        public static final OriginEnum EXTERNAL = new OriginEnum("external");

        private static final Map<String, OriginEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginEnum> createStaticFields() {
            Map<String, OriginEnum> map = new HashMap<>();
            map.put("kms", KMS);
            map.put("external", EXTERNAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginEnum(String value) {
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
        public static OriginEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OriginEnum(value));
        }

        public static OriginEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OriginEnum) {
                return this.value.equals(((OriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin")

    private OriginEnum origin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_id")

    private String keystoreId;

    public CreateKeyRequestBody withKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
        return this;
    }

    public String getKeyAlias() {
        return keyAlias;
    }

    public void setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
    }

    public CreateKeyRequestBody withKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    public KeySpecEnum getKeySpec() {
        return keySpec;
    }

    public void setKeySpec(KeySpecEnum keySpec) {
        this.keySpec = keySpec;
    }

    public CreateKeyRequestBody withKeyUsage(KeyUsageEnum keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }

    public KeyUsageEnum getKeyUsage() {
        return keyUsage;
    }

    public void setKeyUsage(KeyUsageEnum keyUsage) {
        this.keyUsage = keyUsage;
    }

    public CreateKeyRequestBody withKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
        return this;
    }

    public String getKeyDescription() {
        return keyDescription;
    }

    public void setKeyDescription(String keyDescription) {
        this.keyDescription = keyDescription;
    }

    public CreateKeyRequestBody withOrigin(OriginEnum origin) {
        this.origin = origin;
        return this;
    }

    public OriginEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
    }

    public CreateKeyRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateKeyRequestBody withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public CreateKeyRequestBody withKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
        return this;
    }

    public String getKeystoreId() {
        return keystoreId;
    }

    public void setKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKeyRequestBody that = (CreateKeyRequestBody) obj;
        return Objects.equals(this.keyAlias, that.keyAlias) && Objects.equals(this.keySpec, that.keySpec)
            && Objects.equals(this.keyUsage, that.keyUsage) && Objects.equals(this.keyDescription, that.keyDescription)
            && Objects.equals(this.origin, that.origin)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.sequence, that.sequence) && Objects.equals(this.keystoreId, that.keystoreId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(keyAlias, keySpec, keyUsage, keyDescription, origin, enterpriseProjectId, sequence, keystoreId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKeyRequestBody {\n");
        sb.append("    keyAlias: ").append(toIndentedString(keyAlias)).append("\n");
        sb.append("    keySpec: ").append(toIndentedString(keySpec)).append("\n");
        sb.append("    keyUsage: ").append(toIndentedString(keyUsage)).append("\n");
        sb.append("    keyDescription: ").append(toIndentedString(keyDescription)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
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
