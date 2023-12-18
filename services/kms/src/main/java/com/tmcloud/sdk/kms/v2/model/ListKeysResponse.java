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
public class ListKeysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keys")

    private List<String> keys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_details")

    private List<KeyDetails> keyDetails = null;

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

    public ListKeysResponse withKeys(List<String> keys) {
        this.keys = keys;
        return this;
    }

    public ListKeysResponse addKeysItem(String keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    public ListKeysResponse withKeys(Consumer<List<String>> keysSetter) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        keysSetter.accept(this.keys);
        return this;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public ListKeysResponse withKeyDetails(List<KeyDetails> keyDetails) {
        this.keyDetails = keyDetails;
        return this;
    }

    public ListKeysResponse addKeyDetailsItem(KeyDetails keyDetailsItem) {
        if (this.keyDetails == null) {
            this.keyDetails = new ArrayList<>();
        }
        this.keyDetails.add(keyDetailsItem);
        return this;
    }

    public ListKeysResponse withKeyDetails(Consumer<List<KeyDetails>> keyDetailsSetter) {
        if (this.keyDetails == null) {
            this.keyDetails = new ArrayList<>();
        }
        keyDetailsSetter.accept(this.keyDetails);
        return this;
    }

    public List<KeyDetails> getKeyDetails() {
        return keyDetails;
    }

    public void setKeyDetails(List<KeyDetails> keyDetails) {
        this.keyDetails = keyDetails;
    }

    public ListKeysResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    public ListKeysResponse withTruncated(TruncatedEnum truncated) {
        this.truncated = truncated;
        return this;
    }

    public TruncatedEnum getTruncated() {
        return truncated;
    }

    public void setTruncated(TruncatedEnum truncated) {
        this.truncated = truncated;
    }

    public ListKeysResponse withTotal(Integer total) {
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
        ListKeysResponse that = (ListKeysResponse) obj;
        return Objects.equals(this.keys, that.keys) && Objects.equals(this.keyDetails, that.keyDetails)
            && Objects.equals(this.nextMarker, that.nextMarker) && Objects.equals(this.truncated, that.truncated)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keys, keyDetails, nextMarker, truncated, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeysResponse {\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
        sb.append("    keyDetails: ").append(toIndentedString(keyDetails)).append("\n");
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
