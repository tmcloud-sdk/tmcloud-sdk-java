package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tmcloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DecryptDatakeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_key")

    private String dataKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_length")

    private String datakeyLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datakey_dgst")

    private String datakeyDgst;

    public DecryptDatakeyResponse withDataKey(String dataKey) {
        this.dataKey = dataKey;
        return this;
    }

    public String getDataKey() {
        return dataKey;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    public DecryptDatakeyResponse withDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
        return this;
    }

    public String getDatakeyLength() {
        return datakeyLength;
    }

    public void setDatakeyLength(String datakeyLength) {
        this.datakeyLength = datakeyLength;
    }

    public DecryptDatakeyResponse withDatakeyDgst(String datakeyDgst) {
        this.datakeyDgst = datakeyDgst;
        return this;
    }

    public String getDatakeyDgst() {
        return datakeyDgst;
    }

    public void setDatakeyDgst(String datakeyDgst) {
        this.datakeyDgst = datakeyDgst;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DecryptDatakeyResponse that = (DecryptDatakeyResponse) obj;
        return Objects.equals(this.dataKey, that.dataKey) && Objects.equals(this.datakeyLength, that.datakeyLength)
            && Objects.equals(this.datakeyDgst, that.datakeyDgst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataKey, datakeyLength, datakeyDgst);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecryptDatakeyResponse {\n");
        sb.append("    dataKey: ").append(toIndentedString(dataKey)).append("\n");
        sb.append("    datakeyLength: ").append(toIndentedString(datakeyLength)).append("\n");
        sb.append("    datakeyDgst: ").append(toIndentedString(datakeyDgst)).append("\n");
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
