package com.vmware.vim25;

import com.vmware.vim25.HostSgxInfoFlcModes;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostSgxInfoFlcModes")
@XmlEnum
public enum HostSgxInfoFlcModes {
  OFF("off"),
  LOCKED("locked"),
  UNLOCKED("unlocked");
  
  private final String value;
  
  HostSgxInfoFlcModes(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostSgxInfoFlcModes fromValue(String paramString) {
    for (HostSgxInfoFlcModes hostSgxInfoFlcModes : values()) {
      if (hostSgxInfoFlcModes.value.equals(paramString))
        return hostSgxInfoFlcModes; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
