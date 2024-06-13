package com.vmware.vim25;

import com.vmware.vim25.HostProtocolEndpointPEType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostProtocolEndpointPEType")
@XmlEnum
public enum HostProtocolEndpointPEType {
  BLOCK("block"),
  NAS("nas");
  
  private final String value;
  
  HostProtocolEndpointPEType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostProtocolEndpointPEType fromValue(String paramString) {
    for (HostProtocolEndpointPEType hostProtocolEndpointPEType : values()) {
      if (hostProtocolEndpointPEType.value.equals(paramString))
        return hostProtocolEndpointPEType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
