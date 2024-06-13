package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineRelocateTransformation;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineRelocateTransformation")
@XmlEnum
public enum VirtualMachineRelocateTransformation {
  FLAT("flat"),
  SPARSE("sparse");
  
  private final String value;
  
  VirtualMachineRelocateTransformation(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineRelocateTransformation fromValue(String paramString) {
    for (VirtualMachineRelocateTransformation virtualMachineRelocateTransformation : values()) {
      if (virtualMachineRelocateTransformation.value.equals(paramString))
        return virtualMachineRelocateTransformation; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
