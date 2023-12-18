package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tmcloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListKeyStoresResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystores")

    private List<KeystoreDetails> keystores = null;

    public ListKeyStoresResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListKeyStoresResponse withKeystores(List<KeystoreDetails> keystores) {
        this.keystores = keystores;
        return this;
    }

    public ListKeyStoresResponse addKeystoresItem(KeystoreDetails keystoresItem) {
        if (this.keystores == null) {
            this.keystores = new ArrayList<>();
        }
        this.keystores.add(keystoresItem);
        return this;
    }

    public ListKeyStoresResponse withKeystores(Consumer<List<KeystoreDetails>> keystoresSetter) {
        if (this.keystores == null) {
            this.keystores = new ArrayList<>();
        }
        keystoresSetter.accept(this.keystores);
        return this;
    }

    public List<KeystoreDetails> getKeystores() {
        return keystores;
    }

    public void setKeystores(List<KeystoreDetails> keystores) {
        this.keystores = keystores;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKeyStoresResponse that = (ListKeyStoresResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.keystores, that.keystores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, keystores);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeyStoresResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    keystores: ").append(toIndentedString(keystores)).append("\n");
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
