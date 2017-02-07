
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
 * <p>Original spec-file type: EmptyParamGroupInput</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "group1"
})
public class EmptyParamGroupInput {

    /**
     * <p>Original spec-file type: EmptyGroup</p>
     * <pre>
     * EMPTY GROUP
     * </pre>
     * 
     */
    @JsonProperty("group1")
    private EmptyGroup group1;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * <p>Original spec-file type: EmptyGroup</p>
     * <pre>
     * EMPTY GROUP
     * </pre>
     * 
     */
    @JsonProperty("group1")
    public EmptyGroup getGroup1() {
        return group1;
    }

    /**
     * <p>Original spec-file type: EmptyGroup</p>
     * <pre>
     * EMPTY GROUP
     * </pre>
     * 
     */
    @JsonProperty("group1")
    public void setGroup1(EmptyGroup group1) {
        this.group1 = group1;
    }

    public EmptyParamGroupInput withGroup1(EmptyGroup group1) {
        this.group1 = group1;
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
        return ((((("EmptyParamGroupInput"+" [group1=")+ group1)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
