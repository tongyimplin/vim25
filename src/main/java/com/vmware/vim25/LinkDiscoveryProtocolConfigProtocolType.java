package com.vmware.vim25;

import com.vmware.vim25.LinkDiscoveryProtocolConfigProtocolType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "LinkDiscoveryProtocolConfigProtocolType")
@XmlEnum
public enum LinkDiscoveryProtocolConfigProtocolType {
  CDP("cdp"),
  LLDP("lldp");
  
  private final String value;
  
  LinkDiscoveryProtocolConfigProtocolType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static LinkDiscoveryProtocolConfigProtocolType fromValue(String paramString) {
    for (LinkDiscoveryProtocolConfigProtocolType linkDiscoveryProtocolConfigProtocolType : values()) {
      if (linkDiscoveryProtocolConfigProtocolType.value.equals(paramString))
        return linkDiscoveryProtocolConfigProtocolType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
