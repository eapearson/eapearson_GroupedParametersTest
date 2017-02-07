
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
 * <p>Original spec-file type: Group3</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stringParamRequiredGroup3",
    "stringParamOptionalGroup3"
})
public class Group3 {

    @JsonProperty("stringParamRequiredGroup3")
    private String stringParamRequiredGroup3;
    @JsonProperty("stringParamOptionalGroup3")
    private String stringParamOptionalGroup3;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stringParamRequiredGroup3")
    public String getStringParamRequiredGroup3() {
        return stringParamRequiredGroup3;
    }

    @JsonProperty("stringParamRequiredGroup3")
    public void setStringParamRequiredGroup3(String stringParamRequiredGroup3) {
        this.stringParamRequiredGroup3 = stringParamRequiredGroup3;
    }

    public Group3 withStringParamRequiredGroup3(String stringParamRequiredGroup3) {
        this.stringParamRequiredGroup3 = stringParamRequiredGroup3;
        return this;
    }

    @JsonProperty("stringParamOptionalGroup3")
    public String getStringParamOptionalGroup3() {
        return stringParamOptionalGroup3;
    }

    @JsonProperty("stringParamOptionalGroup3")
    public void setStringParamOptionalGroup3(String stringParamOptionalGroup3) {
        this.stringParamOptionalGroup3 = stringParamOptionalGroup3;
    }

    public Group3 withStringParamOptionalGroup3(String stringParamOptionalGroup3) {
        this.stringParamOptionalGroup3 = stringParamOptionalGroup3;
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
        return ((((((("Group3"+" [stringParamRequiredGroup3=")+ stringParamRequiredGroup3)+", stringParamOptionalGroup3=")+ stringParamOptionalGroup3)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
