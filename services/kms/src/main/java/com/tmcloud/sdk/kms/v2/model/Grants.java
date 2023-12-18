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
 * Grants
 */
public class Grants {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_id")

    private String grantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grantee_principal")

    private String granteePrincipal;

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
    @JsonProperty(value = "operations")

    private List<String> operations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuing_principal")

    private String issuingPrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private String creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retiring_principal")

    private String retiringPrincipal;

    public Grants withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public Grants withGrantId(String grantId) {
        this.grantId = grantId;
        return this;
    }

    public String getGrantId() {
        return grantId;
    }

    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    public Grants withGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
        return this;
    }

    public String getGranteePrincipal() {
        return granteePrincipal;
    }

    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }

    public Grants withGranteePrincipalType(GranteePrincipalTypeEnum granteePrincipalType) {
        this.granteePrincipalType = granteePrincipalType;
        return this;
    }

    public GranteePrincipalTypeEnum getGranteePrincipalType() {
        return granteePrincipalType;
    }

    public void setGranteePrincipalType(GranteePrincipalTypeEnum granteePrincipalType) {
        this.granteePrincipalType = granteePrincipalType;
    }

    public Grants withOperations(List<String> operations) {
        this.operations = operations;
        return this;
    }

    public Grants addOperationsItem(String operationsItem) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operationsItem);
        return this;
    }

    public Grants withOperations(Consumer<List<String>> operationsSetter) {
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

    public Grants withIssuingPrincipal(String issuingPrincipal) {
        this.issuingPrincipal = issuingPrincipal;
        return this;
    }

    public String getIssuingPrincipal() {
        return issuingPrincipal;
    }

    public void setIssuingPrincipal(String issuingPrincipal) {
        this.issuingPrincipal = issuingPrincipal;
    }

    public Grants withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Grants withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grants withRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
        return this;
    }

    public String getRetiringPrincipal() {
        return retiringPrincipal;
    }

    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grants that = (Grants) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.grantId, that.grantId)
            && Objects.equals(this.granteePrincipal, that.granteePrincipal)
            && Objects.equals(this.granteePrincipalType, that.granteePrincipalType)
            && Objects.equals(this.operations, that.operations)
            && Objects.equals(this.issuingPrincipal, that.issuingPrincipal)
            && Objects.equals(this.creationDate, that.creationDate) && Objects.equals(this.name, that.name)
            && Objects.equals(this.retiringPrincipal, that.retiringPrincipal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId,
            grantId,
            granteePrincipal,
            granteePrincipalType,
            operations,
            issuingPrincipal,
            creationDate,
            name,
            retiringPrincipal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Grants {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    grantId: ").append(toIndentedString(grantId)).append("\n");
        sb.append("    granteePrincipal: ").append(toIndentedString(granteePrincipal)).append("\n");
        sb.append("    granteePrincipalType: ").append(toIndentedString(granteePrincipalType)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    issuingPrincipal: ").append(toIndentedString(issuingPrincipal)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    retiringPrincipal: ").append(toIndentedString(retiringPrincipal)).append("\n");
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
