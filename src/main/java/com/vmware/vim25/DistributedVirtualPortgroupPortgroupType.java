package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualPortgroupPortgroupType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DistributedVirtualPortgroupPortgroupType")
@XmlEnum
public enum DistributedVirtualPortgroupPortgroupType {
  EARLY_BINDING("earlyBinding"),
  LATE_BINDING("lateBinding"),
  EPHEMERAL("ephemeral");
  
  private final String value;
  
  DistributedVirtualPortgroupPortgroupType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DistributedVirtualPortgroupPortgroupType fromValue(String paramString) {
    for (DistributedVirtualPortgroupPortgroupType distributedVirtualPortgroupPortgroupType : values()) {
      if (distributedVirtualPortgroupPortgroupType.value.equals(paramString))
        return distributedVirtualPortgroupPortgroupType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
