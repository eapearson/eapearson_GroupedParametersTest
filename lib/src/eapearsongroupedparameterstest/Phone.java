
package eapearsongroupedparameterstest;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: Phone</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "phone_type",
    "phone_number",
    "phone_comments"
})
public class Phone {

    @JsonProperty("phone_type")
    private String phoneType;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("phone_comments")
    private String phoneComments;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("phone_type")
    public String getPhoneType() {
        return phoneType;
    }

    @JsonProperty("phone_type")
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public Phone withPhoneType(String phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @JsonProperty("phone_comments")
    public String getPhoneComments() {
        return phoneComments;
    }

    @JsonProperty("phone_comments")
    public void setPhoneComments(String phoneComments) {
        this.phoneComments = phoneComments;
    }

    public Phone withPhoneComments(String phoneComments) {
        this.phoneComments = phoneComments;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((("Phone"+" [phoneType=")+ phoneType)+", phoneNumber=")+ phoneNumber)+", phoneComments=")+ phoneComments)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
