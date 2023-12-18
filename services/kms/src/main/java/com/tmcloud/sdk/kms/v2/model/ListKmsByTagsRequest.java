package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListKmsByTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_instances")

    private String resourceInstances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListKmsByTagsRequestBody body;

    public ListKmsByTagsRequest withResourceInstances(String resourceInstances) {
        this.resourceInstances = resourceInstances;
        return this;
    }

    public String getResourceInstances() {
        return resourceInstances;
    }

    public void setResourceInstances(String resourceInstances) {
        this.resourceInstances = resourceInstances;
    }

    public ListKmsByTagsRequest withBody(ListKmsByTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListKmsByTagsRequest withBody(Consumer<ListKmsByTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListKmsByTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public ListKmsByTagsRequestBody getBody() {
        return body;
    }

    public void setBody(ListKmsByTagsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKmsByTagsRequest that = (ListKmsByTagsRequest) obj;
        return Objects.equals(this.resourceInstances, that.resourceInstances) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceInstances, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKmsByTagsRequest {\n");
        sb.append("    resourceInstances: ").append(toIndentedString(resourceInstances)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
