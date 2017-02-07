
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
    "group1",
    "group2",
    "group3",
    "group4"
})
public class ValidateSeqParamsInput {

    @JsonProperty("stringParamRequired")
    private List<String> stringParamRequired;
    @JsonProperty("stringParamOptional")
    private List<String> stringParamOptional;
    @JsonProperty("group1")
    private List<Group1> group1;
    @JsonProperty("group2")
    private List<Group2> group2;
    @JsonProperty("group3")
    private List<Group3> group3;
    @JsonProperty("group4")
    private List<Group4> group4;
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

    @JsonProperty("group1")
    public List<Group1> getGroup1() {
        return group1;
    }

    @JsonProperty("group1")
    public void setGroup1(List<Group1> group1) {
        this.group1 = group1;
    }

    public ValidateSeqParamsInput withGroup1(List<Group1> group1) {
        this.group1 = group1;
        return this;
    }

    @JsonProperty("group2")
    public List<Group2> getGroup2() {
        return group2;
    }

    @JsonProperty("group2")
    public void setGroup2(List<Group2> group2) {
        this.group2 = group2;
    }

    public ValidateSeqParamsInput withGroup2(List<Group2> group2) {
        this.group2 = group2;
        return this;
    }

    @JsonProperty("group3")
    public List<Group3> getGroup3() {
        return group3;
    }

    @JsonProperty("group3")
    public void setGroup3(List<Group3> group3) {
        this.group3 = group3;
    }

    public ValidateSeqParamsInput withGroup3(List<Group3> group3) {
        this.group3 = group3;
        return this;
    }

    @JsonProperty("group4")
    public List<Group4> getGroup4() {
        return group4;
    }

    @JsonProperty("group4")
    public void setGroup4(List<Group4> group4) {
        this.group4 = group4;
    }

    public ValidateSeqParamsInput withGroup4(List<Group4> group4) {
        this.group4 = group4;
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
        return ((((((((((((((("ValidateSeqParamsInput"+" [stringParamRequired=")+ stringParamRequired)+", stringParamOptional=")+ stringParamOptional)+", group1=")+ group1)+", group2=")+ group2)+", group3=")+ group3)+", group4=")+ group4)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
