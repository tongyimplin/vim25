package com.vmware.vim25;

import com.vmware.vim25.HostMountMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostMountMode")
@XmlEnum
public enum HostMountMode {
  READ_WRITE("readWrite"),
  READ_ONLY("readOnly");
  
  private final String value;
  
  HostMountMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostMountMode fromValue(String paramString) {
    for (HostMountMode hostMountMode : values()) {
      if (hostMountMode.value.equals(paramString))
        return hostMountMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
