package com.vmware.vim25;

import com.vmware.vim25.DrsBehavior;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DrsBehavior")
@XmlEnum
public enum DrsBehavior {
  MANUAL("manual"),
  PARTIALLY_AUTOMATED("partiallyAutomated"),
  FULLY_AUTOMATED("fullyAutomated");
  
  private final String value;
  
  DrsBehavior(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DrsBehavior fromValue(String paramString) {
    for (DrsBehavior drsBehavior : values()) {
      if (drsBehavior.value.equals(paramString))
        return drsBehavior; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
