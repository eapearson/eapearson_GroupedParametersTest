
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
    "max_volume",
    "current_volume"
})
public class Fluid {

    @JsonProperty("max_volume")
    private Double maxVolume;
    @JsonProperty("current_volume")
    private Double currentVolume;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("max_volume")
    public Double getMaxVolume() {
        return maxVolume;
    }

    @JsonProperty("max_volume")
    public void setMaxVolume(Double maxVolume) {
        this.maxVolume = maxVolume;
    }

    public Fluid withMaxVolume(Double maxVolume) {
        this.maxVolume = maxVolume;
        return this;
    }

    @JsonProperty("current_volume")
    public Double getCurrentVolume() {
        return currentVolume;
    }

    @JsonProperty("current_volume")
    public void setCurrentVolume(Double currentVolume) {
        this.currentVolume = currentVolume;
    }

    public Fluid withCurrentVolume(Double currentVolume) {
        this.currentVolume = currentVolume;
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
        return ((((((("Fluid"+" [maxVolume=")+ maxVolume)+", currentVolume=")+ currentVolume)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
