package com.vmware.vim25;

import com.vmware.vim25.DasVmPriority;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DasVmPriority")
@XmlEnum
public enum DasVmPriority {
  DISABLED("disabled"),
  LOW("low"),
  MEDIUM("medium"),
  HIGH("high");
  
  private final String value;
  
  DasVmPriority(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DasVmPriority fromValue(String paramString) {
    for (DasVmPriority dasVmPriority : values()) {
      if (dasVmPriority.value.equals(paramString))
        return dasVmPriority; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
