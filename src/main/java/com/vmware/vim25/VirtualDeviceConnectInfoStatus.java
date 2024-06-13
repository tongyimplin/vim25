package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceConnectInfoStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDeviceConnectInfoStatus")
@XmlEnum
public enum VirtualDeviceConnectInfoStatus {
  OK("ok"),
  RECOVERABLE_ERROR("recoverableError"),
  UNRECOVERABLE_ERROR("unrecoverableError"),
  UNTRIED("untried");
  
  private final String value;
  
  VirtualDeviceConnectInfoStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDeviceConnectInfoStatus fromValue(String paramString) {
    for (VirtualDeviceConnectInfoStatus virtualDeviceConnectInfoStatus : values()) {
      if (virtualDeviceConnectInfoStatus.value.equals(paramString))
        return virtualDeviceConnectInfoStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
