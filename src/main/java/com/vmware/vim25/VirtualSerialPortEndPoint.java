package com.vmware.vim25;

import com.vmware.vim25.VirtualSerialPortEndPoint;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualSerialPortEndPoint")
@XmlEnum
public enum VirtualSerialPortEndPoint {
  CLIENT("client"),
  SERVER("server");
  
  private final String value;
  
  VirtualSerialPortEndPoint(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualSerialPortEndPoint fromValue(String paramString) {
    for (VirtualSerialPortEndPoint virtualSerialPortEndPoint : values()) {
      if (virtualSerialPortEndPoint.value.equals(paramString))
        return virtualSerialPortEndPoint; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
