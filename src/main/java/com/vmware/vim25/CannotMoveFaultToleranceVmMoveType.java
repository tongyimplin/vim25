package com.vmware.vim25;

import com.vmware.vim25.CannotMoveFaultToleranceVmMoveType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CannotMoveFaultToleranceVmMoveType")
@XmlEnum
public enum CannotMoveFaultToleranceVmMoveType {
  RESOURCE_POOL("resourcePool"),
  CLUSTER("cluster");
  
  private final String value;
  
  CannotMoveFaultToleranceVmMoveType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static CannotMoveFaultToleranceVmMoveType fromValue(String paramString) {
    for (CannotMoveFaultToleranceVmMoveType cannotMoveFaultToleranceVmMoveType : values()) {
      if (cannotMoveFaultToleranceVmMoveType.value.equals(paramString))
        return cannotMoveFaultToleranceVmMoveType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
