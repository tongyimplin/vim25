package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineVMCIDeviceProtocol;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineVMCIDeviceProtocol")
@XmlEnum
public enum VirtualMachineVMCIDeviceProtocol {
  HYPERVISOR("hypervisor"),
  DOORBELL("doorbell"),
  QUEUEPAIR("queuepair"),
  DATAGRAM("datagram"),
  STREAM("stream"),
  ANY_PROTOCOL("anyProtocol");
  
  private final String value;
  
  VirtualMachineVMCIDeviceProtocol(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineVMCIDeviceProtocol fromValue(String paramString) {
    for (VirtualMachineVMCIDeviceProtocol virtualMachineVMCIDeviceProtocol : values()) {
      if (virtualMachineVMCIDeviceProtocol.value.equals(paramString))
        return virtualMachineVMCIDeviceProtocol; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
