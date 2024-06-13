package com.vmware.vim25;

import com.vmware.vim25.ScsiLunType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ScsiLunType")
@XmlEnum
public enum ScsiLunType {
  DISK("disk"),
  TAPE("tape"),
  PRINTER("printer"),
  PROCESSOR("processor"),
  WORM("worm"),
  CDROM("cdrom"),
  SCANNER("scanner"),
  OPTICAL_DEVICE("opticalDevice"),
  MEDIA_CHANGER("mediaChanger"),
  COMMUNICATIONS("communications"),
  STORAGE_ARRAY_CONTROLLER("storageArrayController"),
  ENCLOSURE("enclosure"),
  UNKNOWN("unknown");
  
  private final String value;
  
  ScsiLunType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ScsiLunType fromValue(String paramString) {
    for (ScsiLunType scsiLunType : values()) {
      if (scsiLunType.value.equals(paramString))
        return scsiLunType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
