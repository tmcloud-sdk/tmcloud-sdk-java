package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tmcloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateKeyAliasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_info")

    private KeyAliasInfo keyInfo;

    public UpdateKeyAliasResponse withKeyInfo(KeyAliasInfo keyInfo) {
        this.keyInfo = keyInfo;
        return this;
    }

    public UpdateKeyAliasResponse withKeyInfo(Consumer<KeyAliasInfo> keyInfoSetter) {
        if (this.keyInfo == null) {
            this.keyInfo = new KeyAliasInfo();
            keyInfoSetter.accept(this.keyInfo);
        }

        return this;
    }

    public KeyAliasInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyAliasInfo keyInfo) {
        this.keyInfo = keyInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateKeyAliasResponse that = (UpdateKeyAliasResponse) obj;
        return Objects.equals(this.keyInfo, that.keyInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeyAliasResponse {\n");
        sb.append("    keyInfo: ").append(toIndentedString(keyInfo)).append("\n");
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
