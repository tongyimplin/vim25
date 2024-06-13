package com.vmware.vim25;

import com.vmware.vim25.PortGroupConnecteeType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PortGroupConnecteeType")
@XmlEnum
public enum PortGroupConnecteeType {
  VIRTUAL_MACHINE("virtualMachine"),
  SYSTEM_MANAGEMENT("systemManagement"),
  HOST("host"),
  UNKNOWN("unknown");
  
  private final String value;
  
  PortGroupConnecteeType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PortGroupConnecteeType fromValue(String paramString) {
    for (PortGroupConnecteeType portGroupConnecteeType : values()) {
      if (portGroupConnecteeType.value.equals(paramString))
        return portGroupConnecteeType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
