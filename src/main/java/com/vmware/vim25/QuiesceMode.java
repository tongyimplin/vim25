package com.vmware.vim25;

import com.vmware.vim25.QuiesceMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "QuiesceMode")
@XmlEnum
public enum QuiesceMode {
  APPLICATION("application"),
  FILESYSTEM("filesystem"),
  NONE("none");
  
  private final String value;
  
  QuiesceMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static QuiesceMode fromValue(String paramString) {
    for (QuiesceMode quiesceMode : values()) {
      if (quiesceMode.value.equals(paramString))
        return quiesceMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
