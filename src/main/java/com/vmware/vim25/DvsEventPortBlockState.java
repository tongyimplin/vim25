package com.vmware.vim25;

import com.vmware.vim25.DvsEventPortBlockState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DvsEventPortBlockState")
@XmlEnum
public enum DvsEventPortBlockState {
  UNSET("unset"),
  BLOCKED("blocked"),
  UNBLOCKED("unblocked"),
  UNKNOWN("unknown");
  
  private final String value;
  
  DvsEventPortBlockState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DvsEventPortBlockState fromValue(String paramString) {
    for (DvsEventPortBlockState dvsEventPortBlockState : values()) {
      if (dvsEventPortBlockState.value.equals(paramString))
        return dvsEventPortBlockState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
