package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineMetadataManagerVmMetadataOp;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineMetadataManagerVmMetadataOp")
@XmlEnum
public enum VirtualMachineMetadataManagerVmMetadataOp {
  UPDATE("Update"),
  REMOVE("Remove");
  
  private final String value;
  
  VirtualMachineMetadataManagerVmMetadataOp(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineMetadataManagerVmMetadataOp fromValue(String paramString) {
    for (VirtualMachineMetadataManagerVmMetadataOp virtualMachineMetadataManagerVmMetadataOp : values()) {
      if (virtualMachineMetadataManagerVmMetadataOp.value.equals(paramString))
        return virtualMachineMetadataManagerVmMetadataOp; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
