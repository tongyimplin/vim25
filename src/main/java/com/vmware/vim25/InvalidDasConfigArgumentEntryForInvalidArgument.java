package com.vmware.vim25;

import com.vmware.vim25.InvalidDasConfigArgumentEntryForInvalidArgument;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "InvalidDasConfigArgumentEntryForInvalidArgument")
@XmlEnum
public enum InvalidDasConfigArgumentEntryForInvalidArgument {
  ADMISSION_CONTROL("admissionControl"),
  USER_HEARTBEAT_DS("userHeartbeatDs"),
  VM_CONFIG("vmConfig");
  
  private final String value;
  
  InvalidDasConfigArgumentEntryForInvalidArgument(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static InvalidDasConfigArgumentEntryForInvalidArgument fromValue(String paramString) {
    for (InvalidDasConfigArgumentEntryForInvalidArgument invalidDasConfigArgumentEntryForInvalidArgument : values()) {
      if (invalidDasConfigArgumentEntryForInvalidArgument.value.equals(paramString))
        return invalidDasConfigArgumentEntryForInvalidArgument; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
