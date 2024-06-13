package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineRelocateDiskMoveOptions;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineRelocateDiskMoveOptions")
@XmlEnum
public enum VirtualMachineRelocateDiskMoveOptions {
  MOVE_ALL_DISK_BACKINGS_AND_ALLOW_SHARING("moveAllDiskBackingsAndAllowSharing"),
  MOVE_ALL_DISK_BACKINGS_AND_DISALLOW_SHARING("moveAllDiskBackingsAndDisallowSharing"),
  MOVE_CHILD_MOST_DISK_BACKING("moveChildMostDiskBacking"),
  CREATE_NEW_CHILD_DISK_BACKING("createNewChildDiskBacking"),
  MOVE_ALL_DISK_BACKINGS_AND_CONSOLIDATE("moveAllDiskBackingsAndConsolidate");
  
  private final String value;
  
  VirtualMachineRelocateDiskMoveOptions(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineRelocateDiskMoveOptions fromValue(String paramString) {
    for (VirtualMachineRelocateDiskMoveOptions virtualMachineRelocateDiskMoveOptions : values()) {
      if (virtualMachineRelocateDiskMoveOptions.value.equals(paramString))
        return virtualMachineRelocateDiskMoveOptions; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
