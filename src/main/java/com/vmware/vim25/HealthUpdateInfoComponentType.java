package com.vmware.vim25;

import com.vmware.vim25.HealthUpdateInfoComponentType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HealthUpdateInfoComponentType")
@XmlEnum
public enum HealthUpdateInfoComponentType {
  MEMORY("Memory"),
  POWER("Power"),
  FAN("Fan"),
  NETWORK("Network"),
  STORAGE("Storage");
  
  private final String value;
  
  HealthUpdateInfoComponentType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HealthUpdateInfoComponentType fromValue(String paramString) {
    for (HealthUpdateInfoComponentType healthUpdateInfoComponentType : values()) {
      if (healthUpdateInfoComponentType.value.equals(paramString))
        return healthUpdateInfoComponentType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
