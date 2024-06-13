package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineConfigSpecNpivWwnOp;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineConfigSpecNpivWwnOp")
@XmlEnum
public enum VirtualMachineConfigSpecNpivWwnOp {
  GENERATE("generate"),
  SET("set"),
  REMOVE("remove"),
  EXTEND("extend");
  
  private final String value;
  
  VirtualMachineConfigSpecNpivWwnOp(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineConfigSpecNpivWwnOp fromValue(String paramString) {
    for (VirtualMachineConfigSpecNpivWwnOp virtualMachineConfigSpecNpivWwnOp : values()) {
      if (virtualMachineConfigSpecNpivWwnOp.value.equals(paramString))
        return virtualMachineConfigSpecNpivWwnOp; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
