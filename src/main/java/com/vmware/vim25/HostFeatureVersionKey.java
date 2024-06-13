package com.vmware.vim25;

import com.vmware.vim25.HostFeatureVersionKey;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostFeatureVersionKey")
@XmlEnum
public enum HostFeatureVersionKey {
  FAULT_TOLERANCE("faultTolerance");
  
  private final String value;
  
  HostFeatureVersionKey(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostFeatureVersionKey fromValue(String paramString) {
    for (HostFeatureVersionKey hostFeatureVersionKey : values()) {
      if (hostFeatureVersionKey.value.equals(paramString))
        return hostFeatureVersionKey; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
