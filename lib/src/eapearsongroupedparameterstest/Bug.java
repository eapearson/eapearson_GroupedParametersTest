
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
 * <p>Original spec-file type: Bug</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "title",
    "description",
    "severity",
    "effort",
    "log_entries"
})
public class Bug {

    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("severity")
    private Long severity;
    @JsonProperty("effort")
    private String effort;
    @JsonProperty("log_entries")
    private List<LogEntry> logEntries;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Bug withTitle(String title) {
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

    public Bug withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("severity")
    public Long getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(Long severity) {
        this.severity = severity;
    }

    public Bug withSeverity(Long severity) {
        this.severity = severity;
        return this;
    }

    @JsonProperty("effort")
    public String getEffort() {
        return effort;
    }

    @JsonProperty("effort")
    public void setEffort(String effort) {
        this.effort = effort;
    }

    public Bug withEffort(String effort) {
        this.effort = effort;
        return this;
    }

    @JsonProperty("log_entries")
    public List<LogEntry> getLogEntries() {
        return logEntries;
    }

    @JsonProperty("log_entries")
    public void setLogEntries(List<LogEntry> logEntries) {
        this.logEntries = logEntries;
    }

    public Bug withLogEntries(List<LogEntry> logEntries) {
        this.logEntries = logEntries;
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
        return ((((((((((((("Bug"+" [title=")+ title)+", description=")+ description)+", severity=")+ severity)+", effort=")+ effort)+", logEntries=")+ logEntries)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
