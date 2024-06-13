package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchNetworkResourceControlVersion;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DistributedVirtualSwitchNetworkResourceControlVersion")
@XmlEnum
public enum DistributedVirtualSwitchNetworkResourceControlVersion {
  VERSION_2("version2"),
  VERSION_3("version3");
  
  private final String value;
  
  DistributedVirtualSwitchNetworkResourceControlVersion(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DistributedVirtualSwitchNetworkResourceControlVersion fromValue(String paramString) {
    for (DistributedVirtualSwitchNetworkResourceControlVersion distributedVirtualSwitchNetworkResourceControlVersion : values()) {
      if (distributedVirtualSwitchNetworkResourceControlVersion.value.equals(paramString))
        return distributedVirtualSwitchNetworkResourceControlVersion; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
