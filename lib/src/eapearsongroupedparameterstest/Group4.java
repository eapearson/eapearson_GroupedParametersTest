
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
 * <p>Original spec-file type: Group4</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stringParamOptional1Group4",
    "stringParamOptiona2Group4"
})
public class Group4 {

    @JsonProperty("stringParamOptional1Group4")
    private String stringParamOptional1Group4;
    @JsonProperty("stringParamOptiona2Group4")
    private String stringParamOptiona2Group4;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stringParamOptional1Group4")
    public String getStringParamOptional1Group4() {
        return stringParamOptional1Group4;
    }

    @JsonProperty("stringParamOptional1Group4")
    public void setStringParamOptional1Group4(String stringParamOptional1Group4) {
        this.stringParamOptional1Group4 = stringParamOptional1Group4;
    }

    public Group4 withStringParamOptional1Group4(String stringParamOptional1Group4) {
        this.stringParamOptional1Group4 = stringParamOptional1Group4;
        return this;
    }

    @JsonProperty("stringParamOptiona2Group4")
    public String getStringParamOptiona2Group4() {
        return stringParamOptiona2Group4;
    }

    @JsonProperty("stringParamOptiona2Group4")
    public void setStringParamOptiona2Group4(String stringParamOptiona2Group4) {
        this.stringParamOptiona2Group4 = stringParamOptiona2Group4;
    }

    public Group4 withStringParamOptiona2Group4(String stringParamOptiona2Group4) {
        this.stringParamOptiona2Group4 = stringParamOptiona2Group4;
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
        return ((((((("Group4"+" [stringParamOptional1Group4=")+ stringParamOptional1Group4)+", stringParamOptiona2Group4=")+ stringParamOptiona2Group4)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
