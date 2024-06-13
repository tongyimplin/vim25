package com.vmware.vim25;

import com.vmware.vim25.HostProtocolEndpointProtocolEndpointType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostProtocolEndpointProtocolEndpointType")
@XmlEnum
public enum HostProtocolEndpointProtocolEndpointType {
  SCSI("scsi"),
  NFS("nfs"),
  NFS_4_X("nfs4x");
  
  private final String value;
  
  HostProtocolEndpointProtocolEndpointType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostProtocolEndpointProtocolEndpointType fromValue(String paramString) {
    for (HostProtocolEndpointProtocolEndpointType hostProtocolEndpointProtocolEndpointType : values()) {
      if (hostProtocolEndpointProtocolEndpointType.value.equals(paramString))
        return hostProtocolEndpointProtocolEndpointType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
