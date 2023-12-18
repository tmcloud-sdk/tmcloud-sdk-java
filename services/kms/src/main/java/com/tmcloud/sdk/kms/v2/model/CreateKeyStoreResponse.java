package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tmcloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateKeyStoreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore")

    private KeystoreInfo keystore;

    public CreateKeyStoreResponse withKeystore(KeystoreInfo keystore) {
        this.keystore = keystore;
        return this;
    }

    public CreateKeyStoreResponse withKeystore(Consumer<KeystoreInfo> keystoreSetter) {
        if (this.keystore == null) {
            this.keystore = new KeystoreInfo();
            keystoreSetter.accept(this.keystore);
        }

        return this;
    }

    public KeystoreInfo getKeystore() {
        return keystore;
    }

    public void setKeystore(KeystoreInfo keystore) {
        this.keystore = keystore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKeyStoreResponse that = (CreateKeyStoreResponse) obj;
        return Objects.equals(this.keystore, that.keystore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKeyStoreResponse {\n");
        sb.append("    keystore: ").append(toIndentedString(keystore)).append("\n");
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
