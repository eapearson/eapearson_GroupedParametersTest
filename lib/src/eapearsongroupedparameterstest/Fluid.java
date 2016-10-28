
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
 * <p>Original spec-file type: Fluid</p>
 * <pre>
 * Now some flat groups
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "max_capacity",
    "current_capacity"
})
public class Fluid {

    @JsonProperty("max_capacity")
    private Double maxCapacity;
    @JsonProperty("current_capacity")
    private Double currentCapacity;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("max_capacity")
    public Double getMaxCapacity() {
        return maxCapacity;
    }

    @JsonProperty("max_capacity")
    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Fluid withMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    @JsonProperty("current_capacity")
    public Double getCurrentCapacity() {
        return currentCapacity;
    }

    @JsonProperty("current_capacity")
    public void setCurrentCapacity(Double currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public Fluid withCurrentCapacity(Double currentCapacity) {
        this.currentCapacity = currentCapacity;
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
        return ((((((("Fluid"+" [maxCapacity=")+ maxCapacity)+", currentCapacity=")+ currentCapacity)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
