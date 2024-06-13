package com.vmware.vim25;

import com.vmware.vim25.CustomizationNetBIOSMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CustomizationNetBIOSMode")
@XmlEnum
public enum CustomizationNetBIOSMode {
  ENABLE_NET_BIOS_VIA_DHCP("enableNetBIOSViaDhcp"),
  ENABLE_NET_BIOS("enableNetBIOS"),
  DISABLE_NET_BIOS("disableNetBIOS");
  
  private final String value;
  
  CustomizationNetBIOSMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static CustomizationNetBIOSMode fromValue(String paramString) {
    for (CustomizationNetBIOSMode customizationNetBIOSMode : values()) {
      if (customizationNetBIOSMode.value.equals(paramString))
        return customizationNetBIOSMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
