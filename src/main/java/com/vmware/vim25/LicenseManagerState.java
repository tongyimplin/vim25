package com.vmware.vim25;

import com.vmware.vim25.LicenseManagerState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "LicenseManagerState")
@XmlEnum
public enum LicenseManagerState {
  INITIALIZING("initializing"),
  NORMAL("normal"),
  MARGINAL("marginal"),
  FAULT("fault");
  
  private final String value;
  
  LicenseManagerState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static LicenseManagerState fromValue(String paramString) {
    for (LicenseManagerState licenseManagerState : values()) {
      if (licenseManagerState.value.equals(paramString))
        return licenseManagerState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
