package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineToolsVersionStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineToolsVersionStatus")
@XmlEnum
public enum VirtualMachineToolsVersionStatus {
  GUEST_TOOLS_NOT_INSTALLED("guestToolsNotInstalled"),
  GUEST_TOOLS_NEED_UPGRADE("guestToolsNeedUpgrade"),
  GUEST_TOOLS_CURRENT("guestToolsCurrent"),
  GUEST_TOOLS_UNMANAGED("guestToolsUnmanaged"),
  GUEST_TOOLS_TOO_OLD("guestToolsTooOld"),
  GUEST_TOOLS_SUPPORTED_OLD("guestToolsSupportedOld"),
  GUEST_TOOLS_SUPPORTED_NEW("guestToolsSupportedNew"),
  GUEST_TOOLS_TOO_NEW("guestToolsTooNew"),
  GUEST_TOOLS_BLACKLISTED("guestToolsBlacklisted");
  
  private final String value;
  
  VirtualMachineToolsVersionStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineToolsVersionStatus fromValue(String paramString) {
    for (VirtualMachineToolsVersionStatus virtualMachineToolsVersionStatus : values()) {
      if (virtualMachineToolsVersionStatus.value.equals(paramString))
        return virtualMachineToolsVersionStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
