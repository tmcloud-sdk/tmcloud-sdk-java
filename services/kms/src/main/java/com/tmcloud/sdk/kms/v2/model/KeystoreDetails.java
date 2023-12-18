package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 密钥库详情
 */
public class KeystoreDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_id")

    private String keystoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_alias")

    private String keystoreAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_type")

    private String keystoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hsm_cluster_id")

    private String hsmClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    public KeystoreDetails withKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
        return this;
    }

    public String getKeystoreId() {
        return keystoreId;
    }

    public void setKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
    }

    public KeystoreDetails withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoreDetails withKeystoreAlias(String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
        return this;
    }

    public String getKeystoreAlias() {
        return keystoreAlias;
    }

    public void setKeystoreAlias(String keystoreAlias) {
        this.keystoreAlias = keystoreAlias;
    }

    public KeystoreDetails withKeystoreType(String keystoreType) {
        this.keystoreType = keystoreType;
        return this;
    }

    public String getKeystoreType() {
        return keystoreType;
    }

    public void setKeystoreType(String keystoreType) {
        this.keystoreType = keystoreType;
    }

    public KeystoreDetails withHsmClusterId(String hsmClusterId) {
        this.hsmClusterId = hsmClusterId;
        return this;
    }

    public String getHsmClusterId() {
        return hsmClusterId;
    }

    public void setHsmClusterId(String hsmClusterId) {
        this.hsmClusterId = hsmClusterId;
    }

    public KeystoreDetails withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeystoreDetails that = (KeystoreDetails) obj;
        return Objects.equals(this.keystoreId, that.keystoreId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.keystoreAlias, that.keystoreAlias)
            && Objects.equals(this.keystoreType, that.keystoreType)
            && Objects.equals(this.hsmClusterId, that.hsmClusterId) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystoreId, domainId, keystoreAlias, keystoreType, hsmClusterId, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoreDetails {\n");
        sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    keystoreAlias: ").append(toIndentedString(keystoreAlias)).append("\n");
        sb.append("    keystoreType: ").append(toIndentedString(keystoreType)).append("\n");
        sb.append("    hsmClusterId: ").append(toIndentedString(hsmClusterId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
