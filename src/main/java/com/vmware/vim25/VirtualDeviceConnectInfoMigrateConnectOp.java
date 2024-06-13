package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceConnectInfoMigrateConnectOp;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDeviceConnectInfoMigrateConnectOp")
@XmlEnum
public enum VirtualDeviceConnectInfoMigrateConnectOp {
  CONNECT("connect"),
  DISCONNECT("disconnect"),
  UNSET("unset");
  
  private final String value;
  
  VirtualDeviceConnectInfoMigrateConnectOp(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDeviceConnectInfoMigrateConnectOp fromValue(String paramString) {
    for (VirtualDeviceConnectInfoMigrateConnectOp virtualDeviceConnectInfoMigrateConnectOp : values()) {
      if (virtualDeviceConnectInfoMigrateConnectOp.value.equals(paramString))
        return virtualDeviceConnectInfoMigrateConnectOp; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
