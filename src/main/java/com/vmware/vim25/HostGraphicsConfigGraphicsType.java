package com.vmware.vim25;

import com.vmware.vim25.HostGraphicsConfigGraphicsType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostGraphicsConfigGraphicsType")
@XmlEnum
public enum HostGraphicsConfigGraphicsType {
  SHARED("shared"),
  SHARED_DIRECT("sharedDirect");
  
  private final String value;
  
  HostGraphicsConfigGraphicsType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostGraphicsConfigGraphicsType fromValue(String paramString) {
    for (HostGraphicsConfigGraphicsType hostGraphicsConfigGraphicsType : values()) {
      if (hostGraphicsConfigGraphicsType.value.equals(paramString))
        return hostGraphicsConfigGraphicsType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
