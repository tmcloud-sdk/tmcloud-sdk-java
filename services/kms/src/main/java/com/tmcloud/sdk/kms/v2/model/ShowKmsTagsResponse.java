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
public class ShowKmsTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagItem> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existTagsNum")

    private Integer existTagsNum;

    public ShowKmsTagsResponse withTags(List<TagItem> tags) {
        this.tags = tags;
        return this;
    }

    public ShowKmsTagsResponse addTagsItem(TagItem tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowKmsTagsResponse withTags(Consumer<List<TagItem>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<TagItem> getTags() {
        return tags;
    }

    public void setTags(List<TagItem> tags) {
        this.tags = tags;
    }

    public ShowKmsTagsResponse withExistTagsNum(Integer existTagsNum) {
        this.existTagsNum = existTagsNum;
        return this;
    }

    public Integer getExistTagsNum() {
        return existTagsNum;
    }

    public void setExistTagsNum(Integer existTagsNum) {
        this.existTagsNum = existTagsNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKmsTagsResponse that = (ShowKmsTagsResponse) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.existTagsNum, that.existTagsNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, existTagsNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKmsTagsResponse {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    existTagsNum: ").append(toIndentedString(existTagsNum)).append("\n");
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
