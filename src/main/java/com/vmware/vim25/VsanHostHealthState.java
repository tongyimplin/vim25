package com.vmware.vim25;

import com.vmware.vim25.VsanHostHealthState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VsanHostHealthState")
@XmlEnum
public enum VsanHostHealthState {
  UNKNOWN("unknown"),
  HEALTHY("healthy"),
  UNHEALTHY("unhealthy");
  
  private final String value;
  
  VsanHostHealthState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VsanHostHealthState fromValue(String paramString) {
    for (VsanHostHealthState vsanHostHealthState : values()) {
      if (vsanHostHealthState.value.equals(paramString))
        return vsanHostHealthState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
