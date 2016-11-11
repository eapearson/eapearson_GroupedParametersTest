
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
 * <p>Original spec-file type: Range</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "range_min",
    "range_max"
})
public class Range {

    @JsonProperty("range_min")
    private Long rangeMin;
    @JsonProperty("range_max")
    private Long rangeMax;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("range_min")
    public Long getRangeMin() {
        return rangeMin;
    }

    @JsonProperty("range_min")
    public void setRangeMin(Long rangeMin) {
        this.rangeMin = rangeMin;
    }

    public Range withRangeMin(Long rangeMin) {
        this.rangeMin = rangeMin;
        return this;
    }

    @JsonProperty("range_max")
    public Long getRangeMax() {
        return rangeMax;
    }

    @JsonProperty("range_max")
    public void setRangeMax(Long rangeMax) {
        this.rangeMax = rangeMax;
    }

    public Range withRangeMax(Long rangeMax) {
        this.rangeMax = rangeMax;
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
        return ((((((("Range"+" [rangeMin=")+ rangeMin)+", rangeMax=")+ rangeMax)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
