package com.vmware.vim25;

import com.vmware.vim25.CustomizationFailedReasonCode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CustomizationFailedReasonCode")
@XmlEnum
public enum CustomizationFailedReasonCode {
  USER_DEFINED_SCRIPT_DISABLED("userDefinedScriptDisabled");
  
  private final String value;
  
  CustomizationFailedReasonCode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static CustomizationFailedReasonCode fromValue(String paramString) {
    for (CustomizationFailedReasonCode customizationFailedReasonCode : values()) {
      if (customizationFailedReasonCode.value.equals(paramString))
        return customizationFailedReasonCode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
