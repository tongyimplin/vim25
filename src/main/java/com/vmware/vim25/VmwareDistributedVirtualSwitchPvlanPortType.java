package com.vmware.vim25;

import com.vmware.vim25.VmwareDistributedVirtualSwitchPvlanPortType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VmwareDistributedVirtualSwitchPvlanPortType")
@XmlEnum
public enum VmwareDistributedVirtualSwitchPvlanPortType {
  PROMISCUOUS("promiscuous"),
  ISOLATED("isolated"),
  COMMUNITY("community");
  
  private final String value;
  
  VmwareDistributedVirtualSwitchPvlanPortType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VmwareDistributedVirtualSwitchPvlanPortType fromValue(String paramString) {
    for (VmwareDistributedVirtualSwitchPvlanPortType vmwareDistributedVirtualSwitchPvlanPortType : values()) {
      if (vmwareDistributedVirtualSwitchPvlanPortType.value.equals(paramString))
        return vmwareDistributedVirtualSwitchPvlanPortType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
