package com.vmware.vim25;

import com.vmware.vim25.BaseConfigInfoDiskFileBackingInfoProvisioningType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "BaseConfigInfoDiskFileBackingInfoProvisioningType")
@XmlEnum
public enum BaseConfigInfoDiskFileBackingInfoProvisioningType {
  THIN("thin"),
  EAGER_ZEROED_THICK("eagerZeroedThick"),
  LAZY_ZEROED_THICK("lazyZeroedThick");
  
  private final String value;
  
  BaseConfigInfoDiskFileBackingInfoProvisioningType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static BaseConfigInfoDiskFileBackingInfoProvisioningType fromValue(String paramString) {
    for (BaseConfigInfoDiskFileBackingInfoProvisioningType baseConfigInfoDiskFileBackingInfoProvisioningType : values()) {
      if (baseConfigInfoDiskFileBackingInfoProvisioningType.value.equals(paramString))
        return baseConfigInfoDiskFileBackingInfoProvisioningType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
