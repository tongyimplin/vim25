package com.vmware.vim25;

import com.vmware.vim25.VMotionCompatibilityType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VMotionCompatibilityType")
@XmlEnum
public enum VMotionCompatibilityType {
  CPU("cpu"),
  SOFTWARE("software");
  
  private final String value;
  
  VMotionCompatibilityType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VMotionCompatibilityType fromValue(String paramString) {
    for (VMotionCompatibilityType vMotionCompatibilityType : values()) {
      if (vMotionCompatibilityType.value.equals(paramString))
        return vMotionCompatibilityType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
