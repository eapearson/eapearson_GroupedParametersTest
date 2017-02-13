
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
 * <p>Original spec-file type: GenerateErrorParamsInput</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "field1"
})
public class GenerateErrorParamsInput {

    @JsonProperty("field1")
    private String field1;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("field1")
    public String getField1() {
        return field1;
    }

    @JsonProperty("field1")
    public void setField1(String field1) {
        this.field1 = field1;
    }

    public GenerateErrorParamsInput withField1(String field1) {
        this.field1 = field1;
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
        return ((((("GenerateErrorParamsInput"+" [field1=")+ field1)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
