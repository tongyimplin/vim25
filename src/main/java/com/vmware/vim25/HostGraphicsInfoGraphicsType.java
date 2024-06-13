package com.vmware.vim25;

import com.vmware.vim25.HostGraphicsInfoGraphicsType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostGraphicsInfoGraphicsType")
@XmlEnum
public enum HostGraphicsInfoGraphicsType {
  BASIC("basic"),
  SHARED("shared"),
  DIRECT("direct"),
  SHARED_DIRECT("sharedDirect");
  
  private final String value;
  
  HostGraphicsInfoGraphicsType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostGraphicsInfoGraphicsType fromValue(String paramString) {
    for (HostGraphicsInfoGraphicsType hostGraphicsInfoGraphicsType : values()) {
      if (hostGraphicsInfoGraphicsType.value.equals(paramString))
        return hostGraphicsInfoGraphicsType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
