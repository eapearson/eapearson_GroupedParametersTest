
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
 * <p>Original spec-file type: GroupRequired2</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stringParamRequiredGroupRequired2",
    "stringParamOptionalGroupRequired2"
})
public class GroupRequired2 {

    @JsonProperty("stringParamRequiredGroupRequired2")
    private String stringParamRequiredGroupRequired2;
    @JsonProperty("stringParamOptionalGroupRequired2")
    private String stringParamOptionalGroupRequired2;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stringParamRequiredGroupRequired2")
    public String getStringParamRequiredGroupRequired2() {
        return stringParamRequiredGroupRequired2;
    }

    @JsonProperty("stringParamRequiredGroupRequired2")
    public void setStringParamRequiredGroupRequired2(String stringParamRequiredGroupRequired2) {
        this.stringParamRequiredGroupRequired2 = stringParamRequiredGroupRequired2;
    }

    public GroupRequired2 withStringParamRequiredGroupRequired2(String stringParamRequiredGroupRequired2) {
        this.stringParamRequiredGroupRequired2 = stringParamRequiredGroupRequired2;
        return this;
    }

    @JsonProperty("stringParamOptionalGroupRequired2")
    public String getStringParamOptionalGroupRequired2() {
        return stringParamOptionalGroupRequired2;
    }

    @JsonProperty("stringParamOptionalGroupRequired2")
    public void setStringParamOptionalGroupRequired2(String stringParamOptionalGroupRequired2) {
        this.stringParamOptionalGroupRequired2 = stringParamOptionalGroupRequired2;
    }

    public GroupRequired2 withStringParamOptionalGroupRequired2(String stringParamOptionalGroupRequired2) {
        this.stringParamOptionalGroupRequired2 = stringParamOptionalGroupRequired2;
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
        return ((((((("GroupRequired2"+" [stringParamRequiredGroupRequired2=")+ stringParamRequiredGroupRequired2)+", stringParamOptionalGroupRequired2=")+ stringParamOptionalGroupRequired2)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
