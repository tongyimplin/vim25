package com.vmware.vim25;

import com.vmware.vim25.LinkDiscoveryProtocolConfigOperationType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "LinkDiscoveryProtocolConfigOperationType")
@XmlEnum
public enum LinkDiscoveryProtocolConfigOperationType {
  NONE("none"),
  LISTEN("listen"),
  ADVERTISE("advertise"),
  BOTH("both");
  
  private final String value;
  
  LinkDiscoveryProtocolConfigOperationType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static LinkDiscoveryProtocolConfigOperationType fromValue(String paramString) {
    for (LinkDiscoveryProtocolConfigOperationType linkDiscoveryProtocolConfigOperationType : values()) {
      if (linkDiscoveryProtocolConfigOperationType.value.equals(paramString))
        return linkDiscoveryProtocolConfigOperationType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
