
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
 * <p>Original spec-file type: Date</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "year",
    "month",
    "day"
})
public class Date {

    @JsonProperty("year")
    private Long year;
    @JsonProperty("month")
    private Long month;
    @JsonProperty("day")
    private Long day;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("year")
    public Long getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Long year) {
        this.year = year;
    }

    public Date withYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonProperty("month")
    public Long getMonth() {
        return month;
    }

    @JsonProperty("month")
    public void setMonth(Long month) {
        this.month = month;
    }

    public Date withMonth(Long month) {
        this.month = month;
        return this;
    }

    @JsonProperty("day")
    public Long getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(Long day) {
        this.day = day;
    }

    public Date withDay(Long day) {
        this.day = day;
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
        return ((((((((("Date"+" [year=")+ year)+", month=")+ month)+", day=")+ day)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
