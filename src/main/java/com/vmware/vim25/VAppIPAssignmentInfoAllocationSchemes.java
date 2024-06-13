package com.vmware.vim25;

import com.vmware.vim25.VAppIPAssignmentInfoAllocationSchemes;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VAppIPAssignmentInfoAllocationSchemes")
@XmlEnum
public enum VAppIPAssignmentInfoAllocationSchemes {
  DHCP("dhcp"),
  OVFENV("ovfenv");
  
  private final String value;
  
  VAppIPAssignmentInfoAllocationSchemes(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VAppIPAssignmentInfoAllocationSchemes fromValue(String paramString) {
    for (VAppIPAssignmentInfoAllocationSchemes vAppIPAssignmentInfoAllocationSchemes : values()) {
      if (vAppIPAssignmentInfoAllocationSchemes.value.equals(paramString))
        return vAppIPAssignmentInfoAllocationSchemes; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
