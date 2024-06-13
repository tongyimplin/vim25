package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineBootOptionsNetworkBootProtocolType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineBootOptionsNetworkBootProtocolType")
@XmlEnum
public enum VirtualMachineBootOptionsNetworkBootProtocolType {
  IPV_4("ipv4"),
  IPV_6("ipv6");
  
  private final String value;
  
  VirtualMachineBootOptionsNetworkBootProtocolType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineBootOptionsNetworkBootProtocolType fromValue(String paramString) {
    for (VirtualMachineBootOptionsNetworkBootProtocolType virtualMachineBootOptionsNetworkBootProtocolType : values()) {
      if (virtualMachineBootOptionsNetworkBootProtocolType.value.equals(paramString))
        return virtualMachineBootOptionsNetworkBootProtocolType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
