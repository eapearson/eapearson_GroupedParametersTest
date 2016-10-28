
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
 * <p>Original spec-file type: CarChecklist</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "date",
    "left_door",
    "right_door",
    "interior",
    "gas",
    "wiper_fluid",
    "coolant"
})
public class CarChecklist {

    /**
     * <p>Original spec-file type: Date</p>
     * 
     * 
     */
    @JsonProperty("date")
    private Date date;
    /**
     * <p>Original spec-file type: InspectionItem</p>
     * 
     * 
     */
    @JsonProperty("left_door")
    private InspectionItem leftDoor;
    /**
     * <p>Original spec-file type: InspectionItem</p>
     * 
     * 
     */
    @JsonProperty("right_door")
    private InspectionItem rightDoor;
    /**
     * <p>Original spec-file type: InspectionItem</p>
     * 
     * 
     */
    @JsonProperty("interior")
    private InspectionItem interior;
    /**
     * <p>Original spec-file type: Fluid</p>
     * <pre>
     * Now some flat groups
     * </pre>
     * 
     */
    @JsonProperty("gas")
    private Fluid gas;
    /**
     * <p>Original spec-file type: Fluid</p>
     * <pre>
     * Now some flat groups
     * </pre>
     * 
     */
    @JsonProperty("wiper_fluid")
    private Fluid wiperFluid;
    /**
     * <p>Original spec-file type: Fluid</p>
     * <pre>
     * Now some flat groups
     * </pre>
     * 
     */
    @JsonProperty("coolant")
    private Fluid coolant;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * <p>Original spec-file type: Date</p>
     * 
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * <p>Original spec-file type: Date</p>
     * 
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public CarChecklist withDate(Date date) {
        this.date = date;
        return this;
    }

    /**
     * <p>Original spec-file type: InspectionItem</p>
     * 
     * 
     */
    @JsonProperty("left_door")
    public InspectionItem getLeftDoor() {
        return leftDoor;
    }

    /**
     * <p>Original spec-file type: InspectionItem</p>
     * 
     * 
     */
    @JsonProperty("left_door")
    public void setLeftDoor(InspectionItem leftDoor) {
        this.leftDoor = leftDoor;
    }

    public CarChecklist withLeftDoor(InspectionItem leftDoor) {
        this.leftDoor = leftDoor;
        return this;
    }

    /**
     * <p>Original spec-file type: InspectionItem</p>
     * 
     * 
     */
    @JsonProperty("right_door")
    public InspectionItem getRightDoor() {
        return rightDoor;
    }

    /**
     * <p>Original spec-file type: InspectionItem</p>
     * 
     * 
     */
    @JsonProperty("right_door")
    public void setRightDoor(InspectionItem rightDoor) {
        this.rightDoor = rightDoor;
    }

    public CarChecklist withRightDoor(InspectionItem rightDoor) {
        this.rightDoor = rightDoor;
        return this;
    }

    /**
     * <p>Original spec-file type: InspectionItem</p>
     * 
     * 
     */
    @JsonProperty("interior")
    public InspectionItem getInterior() {
        return interior;
    }

    /**
     * <p>Original spec-file type: InspectionItem</p>
     * 
     * 
     */
    @JsonProperty("interior")
    public void setInterior(InspectionItem interior) {
        this.interior = interior;
    }

    public CarChecklist withInterior(InspectionItem interior) {
        this.interior = interior;
        return this;
    }

    /**
     * <p>Original spec-file type: Fluid</p>
     * <pre>
     * Now some flat groups
     * </pre>
     * 
     */
    @JsonProperty("gas")
    public Fluid getGas() {
        return gas;
    }

    /**
     * <p>Original spec-file type: Fluid</p>
     * <pre>
     * Now some flat groups
     * </pre>
     * 
     */
    @JsonProperty("gas")
    public void setGas(Fluid gas) {
        this.gas = gas;
    }

    public CarChecklist withGas(Fluid gas) {
        this.gas = gas;
        return this;
    }

    /**
     * <p>Original spec-file type: Fluid</p>
     * <pre>
     * Now some flat groups
     * </pre>
     * 
     */
    @JsonProperty("wiper_fluid")
    public Fluid getWiperFluid() {
        return wiperFluid;
    }

    /**
     * <p>Original spec-file type: Fluid</p>
     * <pre>
     * Now some flat groups
     * </pre>
     * 
     */
    @JsonProperty("wiper_fluid")
    public void setWiperFluid(Fluid wiperFluid) {
        this.wiperFluid = wiperFluid;
    }

    public CarChecklist withWiperFluid(Fluid wiperFluid) {
        this.wiperFluid = wiperFluid;
        return this;
    }

    /**
     * <p>Original spec-file type: Fluid</p>
     * <pre>
     * Now some flat groups
     * </pre>
     * 
     */
    @JsonProperty("coolant")
    public Fluid getCoolant() {
        return coolant;
    }

    /**
     * <p>Original spec-file type: Fluid</p>
     * <pre>
     * Now some flat groups
     * </pre>
     * 
     */
    @JsonProperty("coolant")
    public void setCoolant(Fluid coolant) {
        this.coolant = coolant;
    }

    public CarChecklist withCoolant(Fluid coolant) {
        this.coolant = coolant;
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
        return ((((((((((((((((("CarChecklist"+" [date=")+ date)+", leftDoor=")+ leftDoor)+", rightDoor=")+ rightDoor)+", interior=")+ interior)+", gas=")+ gas)+", wiperFluid=")+ wiperFluid)+", coolant=")+ coolant)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
