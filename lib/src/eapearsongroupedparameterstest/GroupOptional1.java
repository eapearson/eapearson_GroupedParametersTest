
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
 * <p>Original spec-file type: GroupOptional1</p>
 * <pre>
 * All Configurations of Sequences
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stringParamOptional1GroupOptional1",
    "stringParamOptional2GroupOptional1"
})
public class GroupOptional1 {

    @JsonProperty("stringParamOptional1GroupOptional1")
    private String stringParamOptional1GroupOptional1;
    @JsonProperty("stringParamOptional2GroupOptional1")
    private String stringParamOptional2GroupOptional1;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stringParamOptional1GroupOptional1")
    public String getStringParamOptional1GroupOptional1() {
        return stringParamOptional1GroupOptional1;
    }

    @JsonProperty("stringParamOptional1GroupOptional1")
    public void setStringParamOptional1GroupOptional1(String stringParamOptional1GroupOptional1) {
        this.stringParamOptional1GroupOptional1 = stringParamOptional1GroupOptional1;
    }

    public GroupOptional1 withStringParamOptional1GroupOptional1(String stringParamOptional1GroupOptional1) {
        this.stringParamOptional1GroupOptional1 = stringParamOptional1GroupOptional1;
        return this;
    }

    @JsonProperty("stringParamOptional2GroupOptional1")
    public String getStringParamOptional2GroupOptional1() {
        return stringParamOptional2GroupOptional1;
    }

    @JsonProperty("stringParamOptional2GroupOptional1")
    public void setStringParamOptional2GroupOptional1(String stringParamOptional2GroupOptional1) {
        this.stringParamOptional2GroupOptional1 = stringParamOptional2GroupOptional1;
    }

    public GroupOptional1 withStringParamOptional2GroupOptional1(String stringParamOptional2GroupOptional1) {
        this.stringParamOptional2GroupOptional1 = stringParamOptional2GroupOptional1;
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
        return ((((((("GroupOptional1"+" [stringParamOptional1GroupOptional1=")+ stringParamOptional1GroupOptional1)+", stringParamOptional2GroupOptional1=")+ stringParamOptional2GroupOptional1)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
