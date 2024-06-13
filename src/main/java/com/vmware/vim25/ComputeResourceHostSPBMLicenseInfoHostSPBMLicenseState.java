package com.vmware.vim25;

import com.vmware.vim25.ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState")
@XmlEnum
public enum ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState {
  LICENSED("licensed"),
  UNLICENSED("unlicensed"),
  UNKNOWN("unknown");
  
  private final String value;
  
  ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState fromValue(String paramString) {
    for (ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState computeResourceHostSPBMLicenseInfoHostSPBMLicenseState : values()) {
      if (computeResourceHostSPBMLicenseInfoHostSPBMLicenseState.value.equals(paramString))
        return computeResourceHostSPBMLicenseInfoHostSPBMLicenseState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
