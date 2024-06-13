package com.vmware.vim25;

import com.vmware.vim25.KmipClusterInfoKmsManagementType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "KmipClusterInfoKmsManagementType")
@XmlEnum
public enum KmipClusterInfoKmsManagementType {
  UNKNOWN("unknown"),
  V_CENTER("vCenter"),
  TRUST_AUTHORITY("trustAuthority");
  
  private final String value;
  
  KmipClusterInfoKmsManagementType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static KmipClusterInfoKmsManagementType fromValue(String paramString) {
    for (KmipClusterInfoKmsManagementType kmipClusterInfoKmsManagementType : values()) {
      if (kmipClusterInfoKmsManagementType.value.equals(paramString))
        return kmipClusterInfoKmsManagementType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
