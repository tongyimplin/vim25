package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.HostNumericSensorInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNumericSensorInfo", propOrder = {"name", "healthState", "currentReading", "unitModifier", "baseUnits", "rateUnits", "sensorType", "id", "timeStamp"})
public class HostNumericSensorInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected ElementDescription healthState;
  
  protected long currentReading;
  
  protected int unitModifier;
  
  @XmlElement(required = true)
  protected String baseUnits;
  
  protected String rateUnits;
  
  @XmlElement(required = true)
  protected String sensorType;
  
  protected String id;
  
  protected String timeStamp;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ElementDescription getHealthState() {
    return this.healthState;
  }
  
  public void setHealthState(ElementDescription paramElementDescription) {
    this.healthState = paramElementDescription;
  }
  
  public long getCurrentReading() {
    return this.currentReading;
  }
  
  public void setCurrentReading(long paramLong) {
    this.currentReading = paramLong;
  }
  
  public int getUnitModifier() {
    return this.unitModifier;
  }
  
  public void setUnitModifier(int paramInt) {
    this.unitModifier = paramInt;
  }
  
  public String getBaseUnits() {
    return this.baseUnits;
  }
  
  public void setBaseUnits(String paramString) {
    this.baseUnits = paramString;
  }
  
  public String getRateUnits() {
    return this.rateUnits;
  }
  
  public void setRateUnits(String paramString) {
    this.rateUnits = paramString;
  }
  
  public String getSensorType() {
    return this.sensorType;
  }
  
  public void setSensorType(String paramString) {
    this.sensorType = paramString;
  }
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getTimeStamp() {
    return this.timeStamp;
  }
  
  public void setTimeStamp(String paramString) {
    this.timeStamp = paramString;
  }
}
