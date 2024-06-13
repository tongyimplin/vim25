package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineConfigInfoSwapPlacementType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineConfigInfoSwapPlacementType")
@XmlEnum
public enum VirtualMachineConfigInfoSwapPlacementType {
  INHERIT("inherit"),
  VM_DIRECTORY("vmDirectory"),
  HOST_LOCAL("hostLocal");
  
  private final String value;
  
  VirtualMachineConfigInfoSwapPlacementType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineConfigInfoSwapPlacementType fromValue(String paramString) {
    for (VirtualMachineConfigInfoSwapPlacementType virtualMachineConfigInfoSwapPlacementType : values()) {
      if (virtualMachineConfigInfoSwapPlacementType.value.equals(paramString))
        return virtualMachineConfigInfoSwapPlacementType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
