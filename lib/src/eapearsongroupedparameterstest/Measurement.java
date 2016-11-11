
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
 * <p>Original spec-file type: Measurement</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "title",
    "description",
    "measure"
})
public class Measurement {

    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    /**
     * <p>Original spec-file type: Measure</p>
     * <pre>
     * Measurement 
     * We use this to test all parameter types.
     * </pre>
     * 
     */
    @JsonProperty("measure")
    private Measure measure;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Measurement withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Measurement withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>Original spec-file type: Measure</p>
     * <pre>
     * Measurement 
     * We use this to test all parameter types.
     * </pre>
     * 
     */
    @JsonProperty("measure")
    public Measure getMeasure() {
        return measure;
    }

    /**
     * <p>Original spec-file type: Measure</p>
     * <pre>
     * Measurement 
     * We use this to test all parameter types.
     * </pre>
     * 
     */
    @JsonProperty("measure")
    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Measurement withMeasure(Measure measure) {
        this.measure = measure;
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
        return ((((((((("Measurement"+" [title=")+ title)+", description=")+ description)+", measure=")+ measure)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
