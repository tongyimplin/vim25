package com.vmware.vim25;

import com.vmware.vim25.VAppIPAssignmentInfoProtocols;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VAppIPAssignmentInfoProtocols")
@XmlEnum
public enum VAppIPAssignmentInfoProtocols {
  I_PV_4("IPv4"),
  I_PV_6("IPv6");
  
  private final String value;
  
  VAppIPAssignmentInfoProtocols(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VAppIPAssignmentInfoProtocols fromValue(String paramString) {
    for (VAppIPAssignmentInfoProtocols vAppIPAssignmentInfoProtocols : values()) {
      if (vAppIPAssignmentInfoProtocols.value.equals(paramString))
        return vAppIPAssignmentInfoProtocols; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
