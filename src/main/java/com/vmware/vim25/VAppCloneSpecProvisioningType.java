package com.vmware.vim25;

import com.vmware.vim25.VAppCloneSpecProvisioningType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VAppCloneSpecProvisioningType")
@XmlEnum
public enum VAppCloneSpecProvisioningType {
  SAME_AS_SOURCE("sameAsSource"),
  THIN("thin"),
  THICK("thick");
  
  private final String value;
  
  VAppCloneSpecProvisioningType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VAppCloneSpecProvisioningType fromValue(String paramString) {
    for (VAppCloneSpecProvisioningType vAppCloneSpecProvisioningType : values()) {
      if (vAppCloneSpecProvisioningType.value.equals(paramString))
        return vAppCloneSpecProvisioningType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
