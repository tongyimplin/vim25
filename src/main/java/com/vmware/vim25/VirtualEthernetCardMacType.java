package com.vmware.vim25;

import com.vmware.vim25.VirtualEthernetCardMacType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualEthernetCardMacType")
@XmlEnum
public enum VirtualEthernetCardMacType {
  MANUAL("manual"),
  GENERATED("generated"),
  ASSIGNED("assigned");
  
  private final String value;
  
  VirtualEthernetCardMacType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualEthernetCardMacType fromValue(String paramString) {
    for (VirtualEthernetCardMacType virtualEthernetCardMacType : values()) {
      if (virtualEthernetCardMacType.value.equals(paramString))
        return virtualEthernetCardMacType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
