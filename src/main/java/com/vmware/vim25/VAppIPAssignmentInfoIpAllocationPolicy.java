package com.vmware.vim25;

import com.vmware.vim25.VAppIPAssignmentInfoIpAllocationPolicy;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VAppIPAssignmentInfoIpAllocationPolicy")
@XmlEnum
public enum VAppIPAssignmentInfoIpAllocationPolicy {
  DHCP_POLICY("dhcpPolicy"),
  TRANSIENT_POLICY("transientPolicy"),
  FIXED_POLICY("fixedPolicy"),
  FIXED_ALLOCATED_POLICY("fixedAllocatedPolicy");
  
  private final String value;
  
  VAppIPAssignmentInfoIpAllocationPolicy(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VAppIPAssignmentInfoIpAllocationPolicy fromValue(String paramString) {
    for (VAppIPAssignmentInfoIpAllocationPolicy vAppIPAssignmentInfoIpAllocationPolicy : values()) {
      if (vAppIPAssignmentInfoIpAllocationPolicy.value.equals(paramString))
        return vAppIPAssignmentInfoIpAllocationPolicy; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
