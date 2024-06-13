package com.vmware.vim25;

import com.vmware.vim25.GuestOsDescriptorSupportLevel;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GuestOsDescriptorSupportLevel")
@XmlEnum
public enum GuestOsDescriptorSupportLevel {
  EXPERIMENTAL("experimental"),
  LEGACY("legacy"),
  TERMINATED("terminated"),
  SUPPORTED("supported"),
  UNSUPPORTED("unsupported"),
  DEPRECATED("deprecated"),
  TECH_PREVIEW("techPreview");
  
  private final String value;
  
  GuestOsDescriptorSupportLevel(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static GuestOsDescriptorSupportLevel fromValue(String paramString) {
    for (GuestOsDescriptorSupportLevel guestOsDescriptorSupportLevel : values()) {
      if (guestOsDescriptorSupportLevel.value.equals(paramString))
        return guestOsDescriptorSupportLevel; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
