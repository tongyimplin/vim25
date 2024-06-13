package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineTicketType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineTicketType")
@XmlEnum
public enum VirtualMachineTicketType {
  MKS("mks"),
  DEVICE("device"),
  GUEST_CONTROL("guestControl"),
  WEBMKS("webmks"),
  GUEST_INTEGRITY("guestIntegrity"),
  WEB_REMOTE_DEVICE("webRemoteDevice");
  
  private final String value;
  
  VirtualMachineTicketType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineTicketType fromValue(String paramString) {
    for (VirtualMachineTicketType virtualMachineTicketType : values()) {
      if (virtualMachineTicketType.value.equals(paramString))
        return virtualMachineTicketType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
