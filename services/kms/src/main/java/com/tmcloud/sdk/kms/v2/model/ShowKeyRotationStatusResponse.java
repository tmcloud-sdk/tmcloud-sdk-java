package com.tmcloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tmcloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowKeyRotationStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_rotation_enabled")

    private Boolean keyRotationEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_interval")

    private Integer rotationInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_rotation_time")

    private String lastRotationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_rotations")

    private Integer numberOfRotations;

    public ShowKeyRotationStatusResponse withKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
        return this;
    }

    public Boolean getKeyRotationEnabled() {
        return keyRotationEnabled;
    }

    public void setKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
    }

    public ShowKeyRotationStatusResponse withRotationInterval(Integer rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }

    public Integer getRotationInterval() {
        return rotationInterval;
    }

    public void setRotationInterval(Integer rotationInterval) {
        this.rotationInterval = rotationInterval;
    }

    public ShowKeyRotationStatusResponse withLastRotationTime(String lastRotationTime) {
        this.lastRotationTime = lastRotationTime;
        return this;
    }

    public String getLastRotationTime() {
        return lastRotationTime;
    }

    public void setLastRotationTime(String lastRotationTime) {
        this.lastRotationTime = lastRotationTime;
    }

    public ShowKeyRotationStatusResponse withNumberOfRotations(Integer numberOfRotations) {
        this.numberOfRotations = numberOfRotations;
        return this;
    }

    public Integer getNumberOfRotations() {
        return numberOfRotations;
    }

    public void setNumberOfRotations(Integer numberOfRotations) {
        this.numberOfRotations = numberOfRotations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKeyRotationStatusResponse that = (ShowKeyRotationStatusResponse) obj;
        return Objects.equals(this.keyRotationEnabled, that.keyRotationEnabled)
            && Objects.equals(this.rotationInterval, that.rotationInterval)
            && Objects.equals(this.lastRotationTime, that.lastRotationTime)
            && Objects.equals(this.numberOfRotations, that.numberOfRotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyRotationEnabled, rotationInterval, lastRotationTime, numberOfRotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKeyRotationStatusResponse {\n");
        sb.append("    keyRotationEnabled: ").append(toIndentedString(keyRotationEnabled)).append("\n");
        sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
        sb.append("    lastRotationTime: ").append(toIndentedString(lastRotationTime)).append("\n");
        sb.append("    numberOfRotations: ").append(toIndentedString(numberOfRotations)).append("\n");
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
