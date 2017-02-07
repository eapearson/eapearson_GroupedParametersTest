
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
 * <p>Original spec-file type: Group2</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stringParamOptional1Group2",
    "stringParamOptional2Group2"
})
public class Group2 {

    @JsonProperty("stringParamOptional1Group2")
    private String stringParamOptional1Group2;
    @JsonProperty("stringParamOptional2Group2")
    private String stringParamOptional2Group2;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stringParamOptional1Group2")
    public String getStringParamOptional1Group2() {
        return stringParamOptional1Group2;
    }

    @JsonProperty("stringParamOptional1Group2")
    public void setStringParamOptional1Group2(String stringParamOptional1Group2) {
        this.stringParamOptional1Group2 = stringParamOptional1Group2;
    }

    public Group2 withStringParamOptional1Group2(String stringParamOptional1Group2) {
        this.stringParamOptional1Group2 = stringParamOptional1Group2;
        return this;
    }

    @JsonProperty("stringParamOptional2Group2")
    public String getStringParamOptional2Group2() {
        return stringParamOptional2Group2;
    }

    @JsonProperty("stringParamOptional2Group2")
    public void setStringParamOptional2Group2(String stringParamOptional2Group2) {
        this.stringParamOptional2Group2 = stringParamOptional2Group2;
    }

    public Group2 withStringParamOptional2Group2(String stringParamOptional2Group2) {
        this.stringParamOptional2Group2 = stringParamOptional2Group2;
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
        return ((((((("Group2"+" [stringParamOptional1Group2=")+ stringParamOptional1Group2)+", stringParamOptional2Group2=")+ stringParamOptional2Group2)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
