package com.vmware.vim25;

import com.vmware.vim25.WillLoseHAProtectionResolution;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WillLoseHAProtectionResolution")
@XmlEnum
public enum WillLoseHAProtectionResolution {
  SVMOTION("svmotion"),
  RELOCATE("relocate");
  
  private final String value;
  
  WillLoseHAProtectionResolution(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static WillLoseHAProtectionResolution fromValue(String paramString) {
    for (WillLoseHAProtectionResolution willLoseHAProtectionResolution : values()) {
      if (willLoseHAProtectionResolution.value.equals(paramString))
        return willLoseHAProtectionResolution; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
