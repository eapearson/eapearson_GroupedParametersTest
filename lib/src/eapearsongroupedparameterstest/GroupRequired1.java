
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
 * <p>Original spec-file type: GroupRequired1</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stringParamOptional1GroupRequired1",
    "stringParamOptiona2GroupRequired1"
})
public class GroupRequired1 {

    @JsonProperty("stringParamOptional1GroupRequired1")
    private String stringParamOptional1GroupRequired1;
    @JsonProperty("stringParamOptiona2GroupRequired1")
    private String stringParamOptiona2GroupRequired1;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stringParamOptional1GroupRequired1")
    public String getStringParamOptional1GroupRequired1() {
        return stringParamOptional1GroupRequired1;
    }

    @JsonProperty("stringParamOptional1GroupRequired1")
    public void setStringParamOptional1GroupRequired1(String stringParamOptional1GroupRequired1) {
        this.stringParamOptional1GroupRequired1 = stringParamOptional1GroupRequired1;
    }

    public GroupRequired1 withStringParamOptional1GroupRequired1(String stringParamOptional1GroupRequired1) {
        this.stringParamOptional1GroupRequired1 = stringParamOptional1GroupRequired1;
        return this;
    }

    @JsonProperty("stringParamOptiona2GroupRequired1")
    public String getStringParamOptiona2GroupRequired1() {
        return stringParamOptiona2GroupRequired1;
    }

    @JsonProperty("stringParamOptiona2GroupRequired1")
    public void setStringParamOptiona2GroupRequired1(String stringParamOptiona2GroupRequired1) {
        this.stringParamOptiona2GroupRequired1 = stringParamOptiona2GroupRequired1;
    }

    public GroupRequired1 withStringParamOptiona2GroupRequired1(String stringParamOptiona2GroupRequired1) {
        this.stringParamOptiona2GroupRequired1 = stringParamOptiona2GroupRequired1;
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
        return ((((((("GroupRequired1"+" [stringParamOptional1GroupRequired1=")+ stringParamOptional1GroupRequired1)+", stringParamOptiona2GroupRequired1=")+ stringParamOptiona2GroupRequired1)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
