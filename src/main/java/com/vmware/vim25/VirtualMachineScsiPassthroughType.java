package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineScsiPassthroughType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineScsiPassthroughType")
@XmlEnum
public enum VirtualMachineScsiPassthroughType {
  DISK("disk"),
  TAPE("tape"),
  PRINTER("printer"),
  PROCESSOR("processor"),
  WORM("worm"),
  CDROM("cdrom"),
  SCANNER("scanner"),
  OPTICAL("optical"),
  MEDIA("media"),
  COM("com"),
  RAID("raid"),
  UNKNOWN("unknown");
  
  private final String value;
  
  VirtualMachineScsiPassthroughType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineScsiPassthroughType fromValue(String paramString) {
    for (VirtualMachineScsiPassthroughType virtualMachineScsiPassthroughType : values()) {
      if (virtualMachineScsiPassthroughType.value.equals(paramString))
        return virtualMachineScsiPassthroughType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
