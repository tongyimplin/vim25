package com.vmware.vim25;

import com.vmware.vim25.OvfCreateImportSpecParamsDiskProvisioningType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "OvfCreateImportSpecParamsDiskProvisioningType")
@XmlEnum
public enum OvfCreateImportSpecParamsDiskProvisioningType {
  MONOLITHIC_SPARSE("monolithicSparse"),
  MONOLITHIC_FLAT("monolithicFlat"),
  TWO_GB_MAX_EXTENT_SPARSE("twoGbMaxExtentSparse"),
  TWO_GB_MAX_EXTENT_FLAT("twoGbMaxExtentFlat"),
  THIN("thin"),
  THICK("thick"),
  SE_SPARSE("seSparse"),
  EAGER_ZEROED_THICK("eagerZeroedThick"),
  SPARSE("sparse"),
  FLAT("flat");
  
  private final String value;
  
  OvfCreateImportSpecParamsDiskProvisioningType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static OvfCreateImportSpecParamsDiskProvisioningType fromValue(String paramString) {
    for (OvfCreateImportSpecParamsDiskProvisioningType ovfCreateImportSpecParamsDiskProvisioningType : values()) {
      if (ovfCreateImportSpecParamsDiskProvisioningType.value.equals(paramString))
        return ovfCreateImportSpecParamsDiskProvisioningType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
