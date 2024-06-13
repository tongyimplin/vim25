package com.vmware.vim25;

import com.vmware.vim25.VmShutdownOnIsolationEventOperation;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VmShutdownOnIsolationEventOperation")
@XmlEnum
public enum VmShutdownOnIsolationEventOperation {
  SHUTDOWN("shutdown"),
  POWERED_OFF("poweredOff");
  
  private final String value;
  
  VmShutdownOnIsolationEventOperation(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VmShutdownOnIsolationEventOperation fromValue(String paramString) {
    for (VmShutdownOnIsolationEventOperation vmShutdownOnIsolationEventOperation : values()) {
      if (vmShutdownOnIsolationEventOperation.value.equals(paramString))
        return vmShutdownOnIsolationEventOperation; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
