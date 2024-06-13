package com.vmware.vim25;

import com.vmware.vim25.DpmBehavior;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DpmBehavior")
@XmlEnum
public enum DpmBehavior {
  MANUAL("manual"),
  AUTOMATED("automated");
  
  private final String value;
  
  DpmBehavior(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DpmBehavior fromValue(String paramString) {
    for (DpmBehavior dpmBehavior : values()) {
      if (dpmBehavior.value.equals(paramString))
        return dpmBehavior; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
