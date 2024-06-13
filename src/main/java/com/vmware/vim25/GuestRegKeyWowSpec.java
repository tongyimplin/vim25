package com.vmware.vim25;

import com.vmware.vim25.GuestRegKeyWowSpec;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GuestRegKeyWowSpec")
@XmlEnum
public enum GuestRegKeyWowSpec {
  WOW_NATIVE("WOWNative"),
  WOW_32("WOW32"),
  WOW_64("WOW64");
  
  private final String value;
  
  GuestRegKeyWowSpec(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static GuestRegKeyWowSpec fromValue(String paramString) {
    for (GuestRegKeyWowSpec guestRegKeyWowSpec : values()) {
      if (guestRegKeyWowSpec.value.equals(paramString))
        return guestRegKeyWowSpec; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
