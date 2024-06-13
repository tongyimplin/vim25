package com.vmware.vim25;

import com.vmware.vim25.StorageDrsSpaceLoadBalanceConfigSpaceThresholdMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "StorageDrsSpaceLoadBalanceConfigSpaceThresholdMode")
@XmlEnum
public enum StorageDrsSpaceLoadBalanceConfigSpaceThresholdMode {
  UTILIZATION("utilization"),
  FREE_SPACE("freeSpace");
  
  private final String value;
  
  StorageDrsSpaceLoadBalanceConfigSpaceThresholdMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static StorageDrsSpaceLoadBalanceConfigSpaceThresholdMode fromValue(String paramString) {
    for (StorageDrsSpaceLoadBalanceConfigSpaceThresholdMode storageDrsSpaceLoadBalanceConfigSpaceThresholdMode : values()) {
      if (storageDrsSpaceLoadBalanceConfigSpaceThresholdMode.value.equals(paramString))
        return storageDrsSpaceLoadBalanceConfigSpaceThresholdMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
