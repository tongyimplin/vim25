package com.vmware.vim25;

import com.vmware.vim25.VMwareDvsMulticastFilteringMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VMwareDvsMulticastFilteringMode")
@XmlEnum
public enum VMwareDvsMulticastFilteringMode {
  LEGACY_FILTERING("legacyFiltering"),
  SNOOPING("snooping");
  
  private final String value;
  
  VMwareDvsMulticastFilteringMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VMwareDvsMulticastFilteringMode fromValue(String paramString) {
    for (VMwareDvsMulticastFilteringMode vMwareDvsMulticastFilteringMode : values()) {
      if (vMwareDvsMulticastFilteringMode.value.equals(paramString))
        return vMwareDvsMulticastFilteringMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
