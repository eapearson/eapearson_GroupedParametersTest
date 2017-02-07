
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
 * <p>Original spec-file type: Group1</p>
 * <pre>
 * All Configurations of Sequences
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stringParamRequiredGroup1",
    "stringParamOptionalGroup1"
})
public class Group1 {

    @JsonProperty("stringParamRequiredGroup1")
    private String stringParamRequiredGroup1;
    @JsonProperty("stringParamOptionalGroup1")
    private String stringParamOptionalGroup1;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stringParamRequiredGroup1")
    public String getStringParamRequiredGroup1() {
        return stringParamRequiredGroup1;
    }

    @JsonProperty("stringParamRequiredGroup1")
    public void setStringParamRequiredGroup1(String stringParamRequiredGroup1) {
        this.stringParamRequiredGroup1 = stringParamRequiredGroup1;
    }

    public Group1 withStringParamRequiredGroup1(String stringParamRequiredGroup1) {
        this.stringParamRequiredGroup1 = stringParamRequiredGroup1;
        return this;
    }

    @JsonProperty("stringParamOptionalGroup1")
    public String getStringParamOptionalGroup1() {
        return stringParamOptionalGroup1;
    }

    @JsonProperty("stringParamOptionalGroup1")
    public void setStringParamOptionalGroup1(String stringParamOptionalGroup1) {
        this.stringParamOptionalGroup1 = stringParamOptionalGroup1;
    }

    public Group1 withStringParamOptionalGroup1(String stringParamOptionalGroup1) {
        this.stringParamOptionalGroup1 = stringParamOptionalGroup1;
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
        return ((((((("Group1"+" [stringParamRequiredGroup1=")+ stringParamRequiredGroup1)+", stringParamOptionalGroup1=")+ stringParamOptionalGroup1)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
