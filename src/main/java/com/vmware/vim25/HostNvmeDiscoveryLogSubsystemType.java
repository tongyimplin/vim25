package com.vmware.vim25;

import com.vmware.vim25.HostNvmeDiscoveryLogSubsystemType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostNvmeDiscoveryLogSubsystemType")
@XmlEnum
public enum HostNvmeDiscoveryLogSubsystemType {
  DISCOVERY("discovery"),
  NVM("nvm");
  
  private final String value;
  
  HostNvmeDiscoveryLogSubsystemType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostNvmeDiscoveryLogSubsystemType fromValue(String paramString) {
    for (HostNvmeDiscoveryLogSubsystemType hostNvmeDiscoveryLogSubsystemType : values()) {
      if (hostNvmeDiscoveryLogSubsystemType.value.equals(paramString))
        return hostNvmeDiscoveryLogSubsystemType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
