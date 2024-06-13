package com.vmware.vim25;

import com.vmware.vim25.IncompatibleHostForVmReplicationIncompatibleReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "IncompatibleHostForVmReplicationIncompatibleReason")
@XmlEnum
public enum IncompatibleHostForVmReplicationIncompatibleReason {
  RPO("rpo"),
  NET_COMPRESSION("netCompression");
  
  private final String value;
  
  IncompatibleHostForVmReplicationIncompatibleReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static IncompatibleHostForVmReplicationIncompatibleReason fromValue(String paramString) {
    for (IncompatibleHostForVmReplicationIncompatibleReason incompatibleHostForVmReplicationIncompatibleReason : values()) {
      if (incompatibleHostForVmReplicationIncompatibleReason.value.equals(paramString))
        return incompatibleHostForVmReplicationIncompatibleReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
