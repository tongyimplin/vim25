package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineMetadataManagerVmMetadataOwnerOwner;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineMetadataManagerVmMetadataOwnerOwner")
@XmlEnum
public enum VirtualMachineMetadataManagerVmMetadataOwnerOwner {
  COM_VMWARE_VSPHERE_HA("ComVmwareVsphereHA");
  
  private final String value;
  
  VirtualMachineMetadataManagerVmMetadataOwnerOwner(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineMetadataManagerVmMetadataOwnerOwner fromValue(String paramString) {
    for (VirtualMachineMetadataManagerVmMetadataOwnerOwner virtualMachineMetadataManagerVmMetadataOwnerOwner : values()) {
      if (virtualMachineMetadataManagerVmMetadataOwnerOwner.value.equals(paramString))
        return virtualMachineMetadataManagerVmMetadataOwnerOwner; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
