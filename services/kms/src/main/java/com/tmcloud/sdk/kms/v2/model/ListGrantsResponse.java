package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tmcloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListGrantsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grants")

    private List<Grants> grants = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    public static final class TruncatedEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final TruncatedEnum TRUE = new TruncatedEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final TruncatedEnum FALSE = new TruncatedEnum("false");

        private static final Map<String, TruncatedEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TruncatedEnum> createStaticFields() {
            Map<String, TruncatedEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TruncatedEnum(String value) {
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
        public static TruncatedEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TruncatedEnum(value));
        }

        public static TruncatedEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TruncatedEnum) {
                return this.value.equals(((TruncatedEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "truncated")

    private TruncatedEnum truncated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListGrantsResponse withGrants(List<Grants> grants) {
        this.grants = grants;
        return this;
    }

    public ListGrantsResponse addGrantsItem(Grants grantsItem) {
        if (this.grants == null) {
            this.grants = new ArrayList<>();
        }
        this.grants.add(grantsItem);
        return this;
    }

    public ListGrantsResponse withGrants(Consumer<List<Grants>> grantsSetter) {
        if (this.grants == null) {
            this.grants = new ArrayList<>();
        }
        grantsSetter.accept(this.grants);
        return this;
    }

    public List<Grants> getGrants() {
        return grants;
    }

    public void setGrants(List<Grants> grants) {
        this.grants = grants;
    }

    public ListGrantsResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListGrantsResponse withTruncated(TruncatedEnum truncated) {
        this.truncated = truncated;
        return this;
    }

    public TruncatedEnum getTruncated() {
        return truncated;
    }

    public void setTruncated(TruncatedEnum truncated) {
        this.truncated = truncated;
    }

    public ListGrantsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGrantsResponse that = (ListGrantsResponse) obj;
        return Objects.equals(this.grants, that.grants) && Objects.equals(this.nextMarker, that.nextMarker)
            && Objects.equals(this.truncated, that.truncated) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grants, nextMarker, truncated, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGrantsResponse {\n");
        sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
        sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
