package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortConnecteeConnecteeType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DistributedVirtualSwitchPortConnecteeConnecteeType")
@XmlEnum
public enum DistributedVirtualSwitchPortConnecteeConnecteeType {
  PNIC("pnic"),
  VM_VNIC("vmVnic"),
  HOST_CONSOLE_VNIC("hostConsoleVnic"),
  HOST_VMK_VNIC("hostVmkVnic");
  
  private final String value;
  
  DistributedVirtualSwitchPortConnecteeConnecteeType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DistributedVirtualSwitchPortConnecteeConnecteeType fromValue(String paramString) {
    for (DistributedVirtualSwitchPortConnecteeConnecteeType distributedVirtualSwitchPortConnecteeConnecteeType : values()) {
      if (distributedVirtualSwitchPortConnecteeConnecteeType.value.equals(paramString))
        return distributedVirtualSwitchPortConnecteeConnecteeType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
