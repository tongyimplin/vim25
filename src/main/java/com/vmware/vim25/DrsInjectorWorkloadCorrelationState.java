package com.vmware.vim25;

import com.vmware.vim25.DrsInjectorWorkloadCorrelationState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DrsInjectorWorkloadCorrelationState")
@XmlEnum
public enum DrsInjectorWorkloadCorrelationState {
  CORRELATED("Correlated"),
  UNCORRELATED("Uncorrelated");
  
  private final String value;
  
  DrsInjectorWorkloadCorrelationState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DrsInjectorWorkloadCorrelationState fromValue(String paramString) {
    for (DrsInjectorWorkloadCorrelationState drsInjectorWorkloadCorrelationState : values()) {
      if (drsInjectorWorkloadCorrelationState.value.equals(paramString))
        return drsInjectorWorkloadCorrelationState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
