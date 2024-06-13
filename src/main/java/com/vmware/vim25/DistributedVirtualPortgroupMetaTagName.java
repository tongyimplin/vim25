package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualPortgroupMetaTagName;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DistributedVirtualPortgroupMetaTagName")
@XmlEnum
public enum DistributedVirtualPortgroupMetaTagName {
  DVS_NAME("dvsName"),
  PORTGROUP_NAME("portgroupName"),
  PORT_INDEX("portIndex");
  
  private final String value;
  
  DistributedVirtualPortgroupMetaTagName(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DistributedVirtualPortgroupMetaTagName fromValue(String paramString) {
    for (DistributedVirtualPortgroupMetaTagName distributedVirtualPortgroupMetaTagName : values()) {
      if (distributedVirtualPortgroupMetaTagName.value.equals(paramString))
        return distributedVirtualPortgroupMetaTagName; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
