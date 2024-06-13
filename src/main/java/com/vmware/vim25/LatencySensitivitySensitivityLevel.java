package com.vmware.vim25;

import com.vmware.vim25.LatencySensitivitySensitivityLevel;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "LatencySensitivitySensitivityLevel")
@XmlEnum
public enum LatencySensitivitySensitivityLevel {
  LOW("low"),
  NORMAL("normal"),
  MEDIUM("medium"),
  HIGH("high"),
  CUSTOM("custom");
  
  private final String value;
  
  LatencySensitivitySensitivityLevel(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static LatencySensitivitySensitivityLevel fromValue(String paramString) {
    for (LatencySensitivitySensitivityLevel latencySensitivitySensitivityLevel : values()) {
      if (latencySensitivitySensitivityLevel.value.equals(paramString))
        return latencySensitivitySensitivityLevel; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
