package com.vmware.vim25;

import com.vmware.vim25.HostCapabilityUnmapMethodSupported;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostCapabilityUnmapMethodSupported")
@XmlEnum
public enum HostCapabilityUnmapMethodSupported {
  PRIORITY("priority"),
  FIXED("fixed"),
  DYNAMIC("dynamic");
  
  private final String value;
  
  HostCapabilityUnmapMethodSupported(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostCapabilityUnmapMethodSupported fromValue(String paramString) {
    for (HostCapabilityUnmapMethodSupported hostCapabilityUnmapMethodSupported : values()) {
      if (hostCapabilityUnmapMethodSupported.value.equals(paramString))
        return hostCapabilityUnmapMethodSupported; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
