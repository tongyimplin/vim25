package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineGuestOsFamily;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineGuestOsFamily")
@XmlEnum
public enum VirtualMachineGuestOsFamily {
  WINDOWS_GUEST("windowsGuest"),
  LINUX_GUEST("linuxGuest"),
  NETWARE_GUEST("netwareGuest"),
  SOLARIS_GUEST("solarisGuest"),
  DARWIN_GUEST_FAMILY("darwinGuestFamily"),
  OTHER_GUEST_FAMILY("otherGuestFamily");
  
  private final String value;
  
  VirtualMachineGuestOsFamily(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineGuestOsFamily fromValue(String paramString) {
    for (VirtualMachineGuestOsFamily virtualMachineGuestOsFamily : values()) {
      if (virtualMachineGuestOsFamily.value.equals(paramString))
        return virtualMachineGuestOsFamily; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
