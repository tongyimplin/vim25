package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LatencySensitivity;
import com.vmware.vim25.LatencySensitivitySensitivityLevel;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LatencySensitivity", propOrder = {"level", "sensitivity"})
public class LatencySensitivity extends DynamicData {
  @XmlElement(required = true)
  protected LatencySensitivitySensitivityLevel level;
  
  protected Integer sensitivity;
  
  public LatencySensitivitySensitivityLevel getLevel() {
    return this.level;
  }
  
  public void setLevel(LatencySensitivitySensitivityLevel paramLatencySensitivitySensitivityLevel) {
    this.level = paramLatencySensitivitySensitivityLevel;
  }
  
  public Integer getSensitivity() {
    return this.sensitivity;
  }
  
  public void setSensitivity(Integer paramInteger) {
    this.sensitivity = paramInteger;
  }
}
