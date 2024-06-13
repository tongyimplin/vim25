package com.vmware.vim25;

import com.vmware.vim25.GuestOsDescriptorFirmwareType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GuestOsDescriptorFirmwareType")
@XmlEnum
public enum GuestOsDescriptorFirmwareType {
  BIOS("bios"),
  EFI("efi");
  
  private final String value;
  
  GuestOsDescriptorFirmwareType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static GuestOsDescriptorFirmwareType fromValue(String paramString) {
    for (GuestOsDescriptorFirmwareType guestOsDescriptorFirmwareType : values()) {
      if (guestOsDescriptorFirmwareType.value.equals(paramString))
        return guestOsDescriptorFirmwareType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
