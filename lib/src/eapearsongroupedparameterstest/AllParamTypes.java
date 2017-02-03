
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
 * <p>Original spec-file type: AllParamTypes</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "stringParam",
    "textareaParam",
    "dropdownParam",
    "booleanParam",
    "integerParam",
    "floatParam",
    "objectRefParam",
    "autocompleteParam"
})
public class AllParamTypes {

    @JsonProperty("stringParam")
    private String stringParam;
    @JsonProperty("textareaParam")
    private String textareaParam;
    @JsonProperty("dropdownParam")
    private String dropdownParam;
    @JsonProperty("booleanParam")
    private Long booleanParam;
    @JsonProperty("integerParam")
    private Long integerParam;
    @JsonProperty("floatParam")
    private Double floatParam;
    @JsonProperty("objectRefParam")
    private String objectRefParam;
    @JsonProperty("autocompleteParam")
    private String autocompleteParam;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stringParam")
    public String getStringParam() {
        return stringParam;
    }

    @JsonProperty("stringParam")
    public void setStringParam(String stringParam) {
        this.stringParam = stringParam;
    }

    public AllParamTypes withStringParam(String stringParam) {
        this.stringParam = stringParam;
        return this;
    }

    @JsonProperty("textareaParam")
    public String getTextareaParam() {
        return textareaParam;
    }

    @JsonProperty("textareaParam")
    public void setTextareaParam(String textareaParam) {
        this.textareaParam = textareaParam;
    }

    public AllParamTypes withTextareaParam(String textareaParam) {
        this.textareaParam = textareaParam;
        return this;
    }

    @JsonProperty("dropdownParam")
    public String getDropdownParam() {
        return dropdownParam;
    }

    @JsonProperty("dropdownParam")
    public void setDropdownParam(String dropdownParam) {
        this.dropdownParam = dropdownParam;
    }

    public AllParamTypes withDropdownParam(String dropdownParam) {
        this.dropdownParam = dropdownParam;
        return this;
    }

    @JsonProperty("booleanParam")
    public Long getBooleanParam() {
        return booleanParam;
    }

    @JsonProperty("booleanParam")
    public void setBooleanParam(Long booleanParam) {
        this.booleanParam = booleanParam;
    }

    public AllParamTypes withBooleanParam(Long booleanParam) {
        this.booleanParam = booleanParam;
        return this;
    }

    @JsonProperty("integerParam")
    public Long getIntegerParam() {
        return integerParam;
    }

    @JsonProperty("integerParam")
    public void setIntegerParam(Long integerParam) {
        this.integerParam = integerParam;
    }

    public AllParamTypes withIntegerParam(Long integerParam) {
        this.integerParam = integerParam;
        return this;
    }

    @JsonProperty("floatParam")
    public Double getFloatParam() {
        return floatParam;
    }

    @JsonProperty("floatParam")
    public void setFloatParam(Double floatParam) {
        this.floatParam = floatParam;
    }

    public AllParamTypes withFloatParam(Double floatParam) {
        this.floatParam = floatParam;
        return this;
    }

    @JsonProperty("objectRefParam")
    public String getObjectRefParam() {
        return objectRefParam;
    }

    @JsonProperty("objectRefParam")
    public void setObjectRefParam(String objectRefParam) {
        this.objectRefParam = objectRefParam;
    }

    public AllParamTypes withObjectRefParam(String objectRefParam) {
        this.objectRefParam = objectRefParam;
        return this;
    }

    @JsonProperty("autocompleteParam")
    public String getAutocompleteParam() {
        return autocompleteParam;
    }

    @JsonProperty("autocompleteParam")
    public void setAutocompleteParam(String autocompleteParam) {
        this.autocompleteParam = autocompleteParam;
    }

    public AllParamTypes withAutocompleteParam(String autocompleteParam) {
        this.autocompleteParam = autocompleteParam;
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
        return ((((((((((((((((((("AllParamTypes"+" [stringParam=")+ stringParam)+", textareaParam=")+ textareaParam)+", dropdownParam=")+ dropdownParam)+", booleanParam=")+ booleanParam)+", integerParam=")+ integerParam)+", floatParam=")+ floatParam)+", objectRefParam=")+ objectRefParam)+", autocompleteParam=")+ autocompleteParam)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
