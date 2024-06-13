package com.vmware.vim25;

import com.vmware.vim25.CustomizationSysprepRebootOption;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CustomizationSysprepRebootOption")
@XmlEnum
public enum CustomizationSysprepRebootOption {
  REBOOT("reboot"),
  NOREBOOT("noreboot"),
  SHUTDOWN("shutdown");
  
  private final String value;
  
  CustomizationSysprepRebootOption(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static CustomizationSysprepRebootOption fromValue(String paramString) {
    for (CustomizationSysprepRebootOption customizationSysprepRebootOption : values()) {
      if (customizationSysprepRebootOption.value.equals(paramString))
        return customizationSysprepRebootOption; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
