
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
 * <p>Original spec-file type: GroupOptional2</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stringParamRequiredGroupOptional2",
    "stringParamOptionalGroupOptional2"
})
public class GroupOptional2 {

    @JsonProperty("stringParamRequiredGroupOptional2")
    private String stringParamRequiredGroupOptional2;
    @JsonProperty("stringParamOptionalGroupOptional2")
    private String stringParamOptionalGroupOptional2;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stringParamRequiredGroupOptional2")
    public String getStringParamRequiredGroupOptional2() {
        return stringParamRequiredGroupOptional2;
    }

    @JsonProperty("stringParamRequiredGroupOptional2")
    public void setStringParamRequiredGroupOptional2(String stringParamRequiredGroupOptional2) {
        this.stringParamRequiredGroupOptional2 = stringParamRequiredGroupOptional2;
    }

    public GroupOptional2 withStringParamRequiredGroupOptional2(String stringParamRequiredGroupOptional2) {
        this.stringParamRequiredGroupOptional2 = stringParamRequiredGroupOptional2;
        return this;
    }

    @JsonProperty("stringParamOptionalGroupOptional2")
    public String getStringParamOptionalGroupOptional2() {
        return stringParamOptionalGroupOptional2;
    }

    @JsonProperty("stringParamOptionalGroupOptional2")
    public void setStringParamOptionalGroupOptional2(String stringParamOptionalGroupOptional2) {
        this.stringParamOptionalGroupOptional2 = stringParamOptionalGroupOptional2;
    }

    public GroupOptional2 withStringParamOptionalGroupOptional2(String stringParamOptionalGroupOptional2) {
        this.stringParamOptionalGroupOptional2 = stringParamOptionalGroupOptional2;
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
        return ((((((("GroupOptional2"+" [stringParamRequiredGroupOptional2=")+ stringParamRequiredGroupOptional2)+", stringParamOptionalGroupOptional2=")+ stringParamOptionalGroupOptional2)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
