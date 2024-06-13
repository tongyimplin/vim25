package com.vmware.vim25;

import com.vmware.vim25.ClusterPowerOnVmOption;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterPowerOnVmOption")
@XmlEnum
public enum ClusterPowerOnVmOption {
  OVERRIDE_AUTOMATION_LEVEL("OverrideAutomationLevel"),
  RESERVE_RESOURCES("ReserveResources");
  
  private final String value;
  
  ClusterPowerOnVmOption(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterPowerOnVmOption fromValue(String paramString) {
    for (ClusterPowerOnVmOption clusterPowerOnVmOption : values()) {
      if (clusterPowerOnVmOption.value.equals(paramString))
        return clusterPowerOnVmOption; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
