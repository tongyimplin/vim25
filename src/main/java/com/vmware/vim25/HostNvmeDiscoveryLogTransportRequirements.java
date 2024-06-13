package com.vmware.vim25;

import com.vmware.vim25.HostNvmeDiscoveryLogTransportRequirements;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostNvmeDiscoveryLogTransportRequirements")
@XmlEnum
public enum HostNvmeDiscoveryLogTransportRequirements {
  SECURE_CHANNEL_REQUIRED("secureChannelRequired"),
  SECURE_CHANNEL_NOT_REQUIRED("secureChannelNotRequired"),
  REQUIREMENTS_NOT_SPECIFIED("requirementsNotSpecified");
  
  private final String value;
  
  HostNvmeDiscoveryLogTransportRequirements(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostNvmeDiscoveryLogTransportRequirements fromValue(String paramString) {
    for (HostNvmeDiscoveryLogTransportRequirements hostNvmeDiscoveryLogTransportRequirements : values()) {
      if (hostNvmeDiscoveryLogTransportRequirements.value.equals(paramString))
        return hostNvmeDiscoveryLogTransportRequirements; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
