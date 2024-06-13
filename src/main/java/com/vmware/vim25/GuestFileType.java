package com.vmware.vim25;

import com.vmware.vim25.GuestFileType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GuestFileType")
@XmlEnum
public enum GuestFileType {
  FILE("file"),
  DIRECTORY("directory"),
  SYMLINK("symlink");
  
  private final String value;
  
  GuestFileType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static GuestFileType fromValue(String paramString) {
    for (GuestFileType guestFileType : values()) {
      if (guestFileType.value.equals(paramString))
        return guestFileType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
