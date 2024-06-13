package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualPortgroupBackingType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DistributedVirtualPortgroupBackingType")
@XmlEnum
public enum DistributedVirtualPortgroupBackingType {
  STANDARD("standard"),
  NSX("nsx");
  
  private final String value;
  
  DistributedVirtualPortgroupBackingType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DistributedVirtualPortgroupBackingType fromValue(String paramString) {
    for (DistributedVirtualPortgroupBackingType distributedVirtualPortgroupBackingType : values()) {
      if (distributedVirtualPortgroupBackingType.value.equals(paramString))
        return distributedVirtualPortgroupBackingType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
