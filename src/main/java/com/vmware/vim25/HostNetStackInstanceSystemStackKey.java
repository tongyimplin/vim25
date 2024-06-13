package com.vmware.vim25;

import com.vmware.vim25.HostNetStackInstanceSystemStackKey;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostNetStackInstanceSystemStackKey")
@XmlEnum
public enum HostNetStackInstanceSystemStackKey {
  DEFAULT_TCPIP_STACK("defaultTcpipStack"),
  VMOTION("vmotion"),
  V_SPHERE_PROVISIONING("vSphereProvisioning");
  
  private final String value;
  
  HostNetStackInstanceSystemStackKey(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostNetStackInstanceSystemStackKey fromValue(String paramString) {
    for (HostNetStackInstanceSystemStackKey hostNetStackInstanceSystemStackKey : values()) {
      if (hostNetStackInstanceSystemStackKey.value.equals(paramString))
        return hostNetStackInstanceSystemStackKey; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
