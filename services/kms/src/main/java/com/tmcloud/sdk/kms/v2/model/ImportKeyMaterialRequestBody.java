package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImportKeyMaterialRequestBody
 */
public class ImportKeyMaterialRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_id")

    private String keyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_token")

    private String importToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted_key_material")

    private String encryptedKeyMaterial;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted_privatekey")

    private String encryptedPrivatekey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_time")

    private Long expirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private String sequence;

    public ImportKeyMaterialRequestBody withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public ImportKeyMaterialRequestBody withImportToken(String importToken) {
        this.importToken = importToken;
        return this;
    }

    public String getImportToken() {
        return importToken;
    }

    public void setImportToken(String importToken) {
        this.importToken = importToken;
    }

    public ImportKeyMaterialRequestBody withEncryptedKeyMaterial(String encryptedKeyMaterial) {
        this.encryptedKeyMaterial = encryptedKeyMaterial;
        return this;
    }

    public String getEncryptedKeyMaterial() {
        return encryptedKeyMaterial;
    }

    public void setEncryptedKeyMaterial(String encryptedKeyMaterial) {
        this.encryptedKeyMaterial = encryptedKeyMaterial;
    }

    public ImportKeyMaterialRequestBody withEncryptedPrivatekey(String encryptedPrivatekey) {
        this.encryptedPrivatekey = encryptedPrivatekey;
        return this;
    }

    public String getEncryptedPrivatekey() {
        return encryptedPrivatekey;
    }

    public void setEncryptedPrivatekey(String encryptedPrivatekey) {
        this.encryptedPrivatekey = encryptedPrivatekey;
    }

    public ImportKeyMaterialRequestBody withExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    public Long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public ImportKeyMaterialRequestBody withSequence(String sequence) {
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
        ImportKeyMaterialRequestBody that = (ImportKeyMaterialRequestBody) obj;
        return Objects.equals(this.keyId, that.keyId) && Objects.equals(this.importToken, that.importToken)
            && Objects.equals(this.encryptedKeyMaterial, that.encryptedKeyMaterial)
            && Objects.equals(this.encryptedPrivatekey, that.encryptedPrivatekey)
            && Objects.equals(this.expirationTime, that.expirationTime) && Objects.equals(this.sequence, that.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, importToken, encryptedKeyMaterial, encryptedPrivatekey, expirationTime, sequence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportKeyMaterialRequestBody {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    importToken: ").append(toIndentedString(importToken)).append("\n");
        sb.append("    encryptedKeyMaterial: ").append(toIndentedString(encryptedKeyMaterial)).append("\n");
        sb.append("    encryptedPrivatekey: ").append(toIndentedString(encryptedPrivatekey)).append("\n");
        sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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
