
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
 * <p>Original spec-file type: InspectionItem</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "checked",
    "condition",
    "repair_cost"
})
public class InspectionItem {

    @JsonProperty("checked")
    private Long checked;
    @JsonProperty("condition")
    private String condition;
    @JsonProperty("repair_cost")
    private Double repairCost;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("checked")
    public Long getChecked() {
        return checked;
    }

    @JsonProperty("checked")
    public void setChecked(Long checked) {
        this.checked = checked;
    }

    public InspectionItem withChecked(Long checked) {
        this.checked = checked;
        return this;
    }

    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public InspectionItem withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    @JsonProperty("repair_cost")
    public Double getRepairCost() {
        return repairCost;
    }

    @JsonProperty("repair_cost")
    public void setRepairCost(Double repairCost) {
        this.repairCost = repairCost;
    }

    public InspectionItem withRepairCost(Double repairCost) {
        this.repairCost = repairCost;
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
        return ((((((((("InspectionItem"+" [checked=")+ checked)+", condition=")+ condition)+", repairCost=")+ repairCost)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
