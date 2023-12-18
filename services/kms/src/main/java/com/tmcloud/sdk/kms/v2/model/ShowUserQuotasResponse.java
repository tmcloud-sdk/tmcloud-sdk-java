package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tmcloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUserQuotasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private Quotas quotas;

    public ShowUserQuotasResponse withQuotas(Quotas quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowUserQuotasResponse withQuotas(Consumer<Quotas> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new Quotas();
            quotasSetter.accept(this.quotas);
        }

        return this;
    }

    public Quotas getQuotas() {
        return quotas;
    }

    public void setQuotas(Quotas quotas) {
        this.quotas = quotas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserQuotasResponse that = (ShowUserQuotasResponse) obj;
        return Objects.equals(this.quotas, that.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserQuotasResponse {\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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
