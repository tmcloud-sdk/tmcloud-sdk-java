package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateGrantRequestBody
 */
public class CreateGrantRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grantee_principal")

    private String granteePrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operations")

    private List<String> operations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retiring_principal")

    private String retiringPrincipal;

    public static final class GranteePrincipalTypeEnum {

        /**
         * Enum USER for value: "user"
         */
        public static final GranteePrincipalTypeEnum USER = new GranteePrincipalTypeEnum("user");

        /**
         * Enum DOMAIN for value: "domain"
         */
        public static final GranteePrincipalTypeEnum DOMAIN = new GranteePrincipalTypeEnum("domain");

        private static final Map<String, GranteePrincipalTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GranteePrincipalTypeEnum> createStaticFields() {
            Map<String, GranteePrincipalTypeEnum> map = new HashMap<>();
            map.put("user", USER);
            map.put("domain", DOMAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GranteePrincipalTypeEnum(String value) {
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
        public static GranteePrincipalTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GranteePrincipalTypeEnum(value));
        }

        public static GranteePrincipalTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GranteePrincipalTypeEnum) {
                return this.value.equals(((GranteePrincipalTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grantee_principal_type")

    private GranteePrincipalTypeEnum granteePrincipalType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public CreateGrantRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public CreateGrantRequestBody withGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
        return this;
    }

    public String getGranteePrincipal() {
        return granteePrincipal;
    }

    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }

    public CreateGrantRequestBody withOperations(List<String> operations) {
        this.operations = operations;
        return this;
    }

    public CreateGrantRequestBody addOperationsItem(String operationsItem) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operationsItem);
        return this;
    }

    public CreateGrantRequestBody withOperations(Consumer<List<String>> operationsSetter) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        operationsSetter.accept(this.operations);
        return this;
    }

    public List<String> getOperations() {
        return operations;
    }

    public void setOperations(List<String> operations) {
        this.operations = operations;
    }

    public CreateGrantRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateGrantRequestBody withRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
        return this;
    }

    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }

    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    public CreateGrantRequestBody withGranteePrincipalType(GranteePrincipalTypeEnum granteePrincipalType) {
        this.granteePrincipalType = granteePrincipalType;
        return this;
    }

    public GranteePrincipalTypeEnum getGranteePrincipalType() {
        return granteePrincipalType;
    }

    public void setGranteePrincipalType(GranteePrincipalTypeEnum granteePrincipalType) {
        this.granteePrincipalType = granteePrincipalType;
    }

    public CreateGrantRequestBody withSequence(String sequence) {
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
        CreateGrantRequestBody that = (CreateGrantRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.granteePrincipal, that.granteePrincipal)
            && Objects.equals(this.operations, that.operations) && Objects.equals(this.name, that.name)
            && Objects.equals(this.retiringPrincipal, that.retiringPrincipal)
            && Objects.equals(this.granteePrincipalType, that.granteePrincipalType)
            && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(keyId, granteePrincipal, operations, name, retiringPrincipal, granteePrincipalType, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGrantRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    granteePrincipal: ").append(toIndentedString(granteePrincipal)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    retiringPrincipal: ").append(toIndentedString(retiringPrincipal)).append("\n");
        sb.append("    granteePrincipalType: ").append(toIndentedString(granteePrincipalType)).append("\n");
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
