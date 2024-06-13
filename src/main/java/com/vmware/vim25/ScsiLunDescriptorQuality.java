package com.vmware.vim25;

import com.vmware.vim25.ScsiLunDescriptorQuality;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ScsiLunDescriptorQuality")
@XmlEnum
public enum ScsiLunDescriptorQuality {
  HIGH_QUALITY("highQuality"),
  MEDIUM_QUALITY("mediumQuality"),
  LOW_QUALITY("lowQuality"),
  UNKNOWN_QUALITY("unknownQuality");
  
  private final String value;
  
  ScsiLunDescriptorQuality(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ScsiLunDescriptorQuality fromValue(String paramString) {
    for (ScsiLunDescriptorQuality scsiLunDescriptorQuality : values()) {
      if (scsiLunDescriptorQuality.value.equals(paramString))
        return scsiLunDescriptorQuality; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
