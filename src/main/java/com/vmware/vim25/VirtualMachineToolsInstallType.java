package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineToolsInstallType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineToolsInstallType")
@XmlEnum
public enum VirtualMachineToolsInstallType {
  GUEST_TOOLS_TYPE_UNKNOWN("guestToolsTypeUnknown"),
  GUEST_TOOLS_TYPE_MSI("guestToolsTypeMSI"),
  GUEST_TOOLS_TYPE_TAR("guestToolsTypeTar"),
  GUEST_TOOLS_TYPE_OSP("guestToolsTypeOSP"),
  GUEST_TOOLS_TYPE_OPEN_VM_TOOLS("guestToolsTypeOpenVMTools");
  
  private final String value;
  
  VirtualMachineToolsInstallType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineToolsInstallType fromValue(String paramString) {
    for (VirtualMachineToolsInstallType virtualMachineToolsInstallType : values()) {
      if (virtualMachineToolsInstallType.value.equals(paramString))
        return virtualMachineToolsInstallType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
