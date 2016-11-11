
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
 * <p>Original spec-file type: Measure</p>
 * <pre>
 * Measurement 
 * We use this to test all parameter types.
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "measure_label",
    "measure_description",
    "measure_int",
    "measure_float",
    "measure_bool",
    "measure_type"
})
public class Measure {

    @JsonProperty("measure_label")
    private String measureLabel;
    @JsonProperty("measure_description")
    private String measureDescription;
    @JsonProperty("measure_int")
    private Long measureInt;
    @JsonProperty("measure_float")
    private Double measureFloat;
    @JsonProperty("measure_bool")
    private Long measureBool;
    @JsonProperty("measure_type")
    private String measureType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("measure_label")
    public String getMeasureLabel() {
        return measureLabel;
    }

    @JsonProperty("measure_label")
    public void setMeasureLabel(String measureLabel) {
        this.measureLabel = measureLabel;
    }

    public Measure withMeasureLabel(String measureLabel) {
        this.measureLabel = measureLabel;
        return this;
    }

    @JsonProperty("measure_description")
    public String getMeasureDescription() {
        return measureDescription;
    }

    @JsonProperty("measure_description")
    public void setMeasureDescription(String measureDescription) {
        this.measureDescription = measureDescription;
    }

    public Measure withMeasureDescription(String measureDescription) {
        this.measureDescription = measureDescription;
        return this;
    }

    @JsonProperty("measure_int")
    public Long getMeasureInt() {
        return measureInt;
    }

    @JsonProperty("measure_int")
    public void setMeasureInt(Long measureInt) {
        this.measureInt = measureInt;
    }

    public Measure withMeasureInt(Long measureInt) {
        this.measureInt = measureInt;
        return this;
    }

    @JsonProperty("measure_float")
    public Double getMeasureFloat() {
        return measureFloat;
    }

    @JsonProperty("measure_float")
    public void setMeasureFloat(Double measureFloat) {
        this.measureFloat = measureFloat;
    }

    public Measure withMeasureFloat(Double measureFloat) {
        this.measureFloat = measureFloat;
        return this;
    }

    @JsonProperty("measure_bool")
    public Long getMeasureBool() {
        return measureBool;
    }

    @JsonProperty("measure_bool")
    public void setMeasureBool(Long measureBool) {
        this.measureBool = measureBool;
    }

    public Measure withMeasureBool(Long measureBool) {
        this.measureBool = measureBool;
        return this;
    }

    @JsonProperty("measure_type")
    public String getMeasureType() {
        return measureType;
    }

    @JsonProperty("measure_type")
    public void setMeasureType(String measureType) {
        this.measureType = measureType;
    }

    public Measure withMeasureType(String measureType) {
        this.measureType = measureType;
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
        return ((((((((((((((("Measure"+" [measureLabel=")+ measureLabel)+", measureDescription=")+ measureDescription)+", measureInt=")+ measureInt)+", measureFloat=")+ measureFloat)+", measureBool=")+ measureBool)+", measureType=")+ measureType)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
