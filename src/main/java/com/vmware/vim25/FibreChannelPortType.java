package com.vmware.vim25;

import com.vmware.vim25.FibreChannelPortType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FibreChannelPortType")
@XmlEnum
public enum FibreChannelPortType {
  FABRIC("fabric"),
  LOOP("loop"),
  POINT_TO_POINT("pointToPoint"),
  UNKNOWN("unknown");
  
  private final String value;
  
  FibreChannelPortType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static FibreChannelPortType fromValue(String paramString) {
    for (FibreChannelPortType fibreChannelPortType : values()) {
      if (fibreChannelPortType.value.equals(paramString))
        return fibreChannelPortType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
