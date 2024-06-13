package com.vmware.vim25;

import com.vmware.vim25.OvfConsumerOstNodeType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "OvfConsumerOstNodeType")
@XmlEnum
public enum OvfConsumerOstNodeType {
  ENVELOPE("envelope"),
  VIRTUAL_SYSTEM("virtualSystem"),
  VIRTUAL_SYSTEM_COLLECTION("virtualSystemCollection");
  
  private final String value;
  
  OvfConsumerOstNodeType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static OvfConsumerOstNodeType fromValue(String paramString) {
    for (OvfConsumerOstNodeType ovfConsumerOstNodeType : values()) {
      if (ovfConsumerOstNodeType.value.equals(paramString))
        return ovfConsumerOstNodeType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
