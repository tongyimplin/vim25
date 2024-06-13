package com.vmware.vim25;

import com.vmware.vim25.HostImageAcceptanceLevel;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostImageAcceptanceLevel")
@XmlEnum
public enum HostImageAcceptanceLevel {
  VMWARE_CERTIFIED("vmware_certified"),
  VMWARE_ACCEPTED("vmware_accepted"),
  PARTNER("partner"),
  COMMUNITY("community");
  
  private final String value;
  
  HostImageAcceptanceLevel(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostImageAcceptanceLevel fromValue(String paramString) {
    for (HostImageAcceptanceLevel hostImageAcceptanceLevel : values()) {
      if (hostImageAcceptanceLevel.value.equals(paramString))
        return hostImageAcceptanceLevel; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
