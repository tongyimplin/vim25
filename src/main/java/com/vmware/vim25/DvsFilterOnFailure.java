package com.vmware.vim25;

import com.vmware.vim25.DvsFilterOnFailure;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DvsFilterOnFailure")
@XmlEnum
public enum DvsFilterOnFailure {
  FAIL_OPEN("failOpen"),
  FAIL_CLOSED("failClosed");
  
  private final String value;
  
  DvsFilterOnFailure(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DvsFilterOnFailure fromValue(String paramString) {
    for (DvsFilterOnFailure dvsFilterOnFailure : values()) {
      if (dvsFilterOnFailure.value.equals(paramString))
        return dvsFilterOnFailure; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
