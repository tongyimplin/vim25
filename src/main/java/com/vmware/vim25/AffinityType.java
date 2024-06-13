package com.vmware.vim25;

import com.vmware.vim25.AffinityType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AffinityType")
@XmlEnum
public enum AffinityType {
  MEMORY("memory"),
  CPU("cpu");
  
  private final String value;
  
  AffinityType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static AffinityType fromValue(String paramString) {
    for (AffinityType affinityType : values()) {
      if (affinityType.value.equals(paramString))
        return affinityType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
