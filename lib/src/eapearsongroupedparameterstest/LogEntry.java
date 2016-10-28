
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
 * <p>Original spec-file type: LogEntry</p>
 * <pre>
 * Throw in floats and ints
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "time_started",
    "time_spent",
    "comments"
})
public class LogEntry {

    @JsonProperty("time_started")
    private String timeStarted;
    @JsonProperty("time_spent")
    private Double timeSpent;
    @JsonProperty("comments")
    private String comments;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time_started")
    public String getTimeStarted() {
        return timeStarted;
    }

    @JsonProperty("time_started")
    public void setTimeStarted(String timeStarted) {
        this.timeStarted = timeStarted;
    }

    public LogEntry withTimeStarted(String timeStarted) {
        this.timeStarted = timeStarted;
        return this;
    }

    @JsonProperty("time_spent")
    public Double getTimeSpent() {
        return timeSpent;
    }

    @JsonProperty("time_spent")
    public void setTimeSpent(Double timeSpent) {
        this.timeSpent = timeSpent;
    }

    public LogEntry withTimeSpent(Double timeSpent) {
        this.timeSpent = timeSpent;
        return this;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    public LogEntry withComments(String comments) {
        this.comments = comments;
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
        return ((((((((("LogEntry"+" [timeStarted=")+ timeStarted)+", timeSpent=")+ timeSpent)+", comments=")+ comments)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
