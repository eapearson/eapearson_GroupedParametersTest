
package eapearsongroupedparameterstest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: ValidateSeqParamsInput</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stringParamRequired",
    "stringParamOptional",
    "groupOptional1",
    "groupOptional2",
    "groupRequired1",
    "groupRequired2"
})
public class ValidateSeqParamsInput {

    @JsonProperty("stringParamRequired")
    private List<String> stringParamRequired;
    @JsonProperty("stringParamOptional")
    private List<String> stringParamOptional;
    @JsonProperty("groupOptional1")
    private List<GroupOptional1> groupOptional1;
    @JsonProperty("groupOptional2")
    private List<GroupOptional2> groupOptional2;
    @JsonProperty("groupRequired1")
    private List<GroupRequired1> groupRequired1;
    @JsonProperty("groupRequired2")
    private List<GroupRequired2> groupRequired2;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("stringParamRequired")
    public List<String> getStringParamRequired() {
        return stringParamRequired;
    }

    @JsonProperty("stringParamRequired")
    public void setStringParamRequired(List<String> stringParamRequired) {
        this.stringParamRequired = stringParamRequired;
    }

    public ValidateSeqParamsInput withStringParamRequired(List<String> stringParamRequired) {
        this.stringParamRequired = stringParamRequired;
        return this;
    }

    @JsonProperty("stringParamOptional")
    public List<String> getStringParamOptional() {
        return stringParamOptional;
    }

    @JsonProperty("stringParamOptional")
    public void setStringParamOptional(List<String> stringParamOptional) {
        this.stringParamOptional = stringParamOptional;
    }

    public ValidateSeqParamsInput withStringParamOptional(List<String> stringParamOptional) {
        this.stringParamOptional = stringParamOptional;
        return this;
    }

    @JsonProperty("groupOptional1")
    public List<GroupOptional1> getGroupOptional1() {
        return groupOptional1;
    }

    @JsonProperty("groupOptional1")
    public void setGroupOptional1(List<GroupOptional1> groupOptional1) {
        this.groupOptional1 = groupOptional1;
    }

    public ValidateSeqParamsInput withGroupOptional1(List<GroupOptional1> groupOptional1) {
        this.groupOptional1 = groupOptional1;
        return this;
    }

    @JsonProperty("groupOptional2")
    public List<GroupOptional2> getGroupOptional2() {
        return groupOptional2;
    }

    @JsonProperty("groupOptional2")
    public void setGroupOptional2(List<GroupOptional2> groupOptional2) {
        this.groupOptional2 = groupOptional2;
    }

    public ValidateSeqParamsInput withGroupOptional2(List<GroupOptional2> groupOptional2) {
        this.groupOptional2 = groupOptional2;
        return this;
    }

    @JsonProperty("groupRequired1")
    public List<GroupRequired1> getGroupRequired1() {
        return groupRequired1;
    }

    @JsonProperty("groupRequired1")
    public void setGroupRequired1(List<GroupRequired1> groupRequired1) {
        this.groupRequired1 = groupRequired1;
    }

    public ValidateSeqParamsInput withGroupRequired1(List<GroupRequired1> groupRequired1) {
        this.groupRequired1 = groupRequired1;
        return this;
    }

    @JsonProperty("groupRequired2")
    public List<GroupRequired2> getGroupRequired2() {
        return groupRequired2;
    }

    @JsonProperty("groupRequired2")
    public void setGroupRequired2(List<GroupRequired2> groupRequired2) {
        this.groupRequired2 = groupRequired2;
    }

    public ValidateSeqParamsInput withGroupRequired2(List<GroupRequired2> groupRequired2) {
        this.groupRequired2 = groupRequired2;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((((("ValidateSeqParamsInput"+" [stringParamRequired=")+ stringParamRequired)+", stringParamOptional=")+ stringParamOptional)+", groupOptional1=")+ groupOptional1)+", groupOptional2=")+ groupOptional2)+", groupRequired1=")+ groupRequired1)+", groupRequired2=")+ groupRequired2)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
