package com.vmware.vim25;

import com.vmware.vim25.VirtualEthernetCardLegacyNetworkDeviceName;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualEthernetCardLegacyNetworkDeviceName")
@XmlEnum
public enum VirtualEthernetCardLegacyNetworkDeviceName {
  BRIDGED("bridged"),
  NAT("nat"),
  HOSTONLY("hostonly");
  
  private final String value;
  
  VirtualEthernetCardLegacyNetworkDeviceName(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualEthernetCardLegacyNetworkDeviceName fromValue(String paramString) {
    for (VirtualEthernetCardLegacyNetworkDeviceName virtualEthernetCardLegacyNetworkDeviceName : values()) {
      if (virtualEthernetCardLegacyNetworkDeviceName.value.equals(paramString))
        return virtualEthernetCardLegacyNetworkDeviceName; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
