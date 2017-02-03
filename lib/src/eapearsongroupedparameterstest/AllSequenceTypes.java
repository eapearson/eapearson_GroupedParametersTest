
package eapearsongroupedparameterstest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: AllSequenceTypes</p>
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
public class AllSequenceTypes {

    @JsonProperty("stringParam")
    private List<String> stringParam;
    @JsonProperty("textareaParam")
    private List<String> textareaParam;
    @JsonProperty("dropdownParam")
    private List<String> dropdownParam;
    @JsonProperty("booleanParam")
    private List<Long> booleanParam;
    @JsonProperty("integerParam")
    private List<Long> integerParam;
    @JsonProperty("floatParam")
    private List<Double> floatParam;
    @JsonProperty("objectRefParam")
    private List<String> objectRefParam;
    @JsonProperty("autocompleteParam")
    private List<String> autocompleteParam;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("stringParam")
    public List<String> getStringParam() {
        return stringParam;
    }

    @JsonProperty("stringParam")
    public void setStringParam(List<String> stringParam) {
        this.stringParam = stringParam;
    }

    public AllSequenceTypes withStringParam(List<String> stringParam) {
        this.stringParam = stringParam;
        return this;
    }

    @JsonProperty("textareaParam")
    public List<String> getTextareaParam() {
        return textareaParam;
    }

    @JsonProperty("textareaParam")
    public void setTextareaParam(List<String> textareaParam) {
        this.textareaParam = textareaParam;
    }

    public AllSequenceTypes withTextareaParam(List<String> textareaParam) {
        this.textareaParam = textareaParam;
        return this;
    }

    @JsonProperty("dropdownParam")
    public List<String> getDropdownParam() {
        return dropdownParam;
    }

    @JsonProperty("dropdownParam")
    public void setDropdownParam(List<String> dropdownParam) {
        this.dropdownParam = dropdownParam;
    }

    public AllSequenceTypes withDropdownParam(List<String> dropdownParam) {
        this.dropdownParam = dropdownParam;
        return this;
    }

    @JsonProperty("booleanParam")
    public List<Long> getBooleanParam() {
        return booleanParam;
    }

    @JsonProperty("booleanParam")
    public void setBooleanParam(List<Long> booleanParam) {
        this.booleanParam = booleanParam;
    }

    public AllSequenceTypes withBooleanParam(List<Long> booleanParam) {
        this.booleanParam = booleanParam;
        return this;
    }

    @JsonProperty("integerParam")
    public List<Long> getIntegerParam() {
        return integerParam;
    }

    @JsonProperty("integerParam")
    public void setIntegerParam(List<Long> integerParam) {
        this.integerParam = integerParam;
    }

    public AllSequenceTypes withIntegerParam(List<Long> integerParam) {
        this.integerParam = integerParam;
        return this;
    }

    @JsonProperty("floatParam")
    public List<Double> getFloatParam() {
        return floatParam;
    }

    @JsonProperty("floatParam")
    public void setFloatParam(List<Double> floatParam) {
        this.floatParam = floatParam;
    }

    public AllSequenceTypes withFloatParam(List<Double> floatParam) {
        this.floatParam = floatParam;
        return this;
    }

    @JsonProperty("objectRefParam")
    public List<String> getObjectRefParam() {
        return objectRefParam;
    }

    @JsonProperty("objectRefParam")
    public void setObjectRefParam(List<String> objectRefParam) {
        this.objectRefParam = objectRefParam;
    }

    public AllSequenceTypes withObjectRefParam(List<String> objectRefParam) {
        this.objectRefParam = objectRefParam;
        return this;
    }

    @JsonProperty("autocompleteParam")
    public List<String> getAutocompleteParam() {
        return autocompleteParam;
    }

    @JsonProperty("autocompleteParam")
    public void setAutocompleteParam(List<String> autocompleteParam) {
        this.autocompleteParam = autocompleteParam;
    }

    public AllSequenceTypes withAutocompleteParam(List<String> autocompleteParam) {
        this.autocompleteParam = autocompleteParam;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((((((((("AllSequenceTypes"+" [stringParam=")+ stringParam)+", textareaParam=")+ textareaParam)+", dropdownParam=")+ dropdownParam)+", booleanParam=")+ booleanParam)+", integerParam=")+ integerParam)+", floatParam=")+ floatParam)+", objectRefParam=")+ objectRefParam)+", autocompleteParam=")+ autocompleteParam)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
