package com.vmware.vim25;

import com.vmware.vim25.HostProfileValidationState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostProfileValidationState")
@XmlEnum
public enum HostProfileValidationState {
  READY("Ready"),
  RUNNING("Running"),
  FAILED("Failed");
  
  private final String value;
  
  HostProfileValidationState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostProfileValidationState fromValue(String paramString) {
    for (HostProfileValidationState hostProfileValidationState : values()) {
      if (hostProfileValidationState.value.equals(paramString))
        return hostProfileValidationState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
