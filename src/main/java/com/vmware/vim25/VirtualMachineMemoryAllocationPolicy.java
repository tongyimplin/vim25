package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineMemoryAllocationPolicy;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineMemoryAllocationPolicy")
@XmlEnum
public enum VirtualMachineMemoryAllocationPolicy {
  SWAP_NONE("swapNone"),
  SWAP_SOME("swapSome"),
  SWAP_MOST("swapMost");
  
  private final String value;
  
  VirtualMachineMemoryAllocationPolicy(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineMemoryAllocationPolicy fromValue(String paramString) {
    for (VirtualMachineMemoryAllocationPolicy virtualMachineMemoryAllocationPolicy : values()) {
      if (virtualMachineMemoryAllocationPolicy.value.equals(paramString))
        return virtualMachineMemoryAllocationPolicy; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
