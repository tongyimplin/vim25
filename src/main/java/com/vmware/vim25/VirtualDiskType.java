package com.vmware.vim25;

import com.vmware.vim25.VirtualDiskType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDiskType")
@XmlEnum
public enum VirtualDiskType {
  PREALLOCATED("preallocated"),
  THIN("thin"),
  SE_SPARSE("seSparse"),
  RDM("rdm"),
  RDMP("rdmp"),
  RAW("raw"),
  DELTA("delta"),
  SPARSE_2_GB("sparse2Gb"),
  THICK_2_GB("thick2Gb"),
  EAGER_ZEROED_THICK("eagerZeroedThick"),
  SPARSE_MONOLITHIC("sparseMonolithic"),
  FLAT_MONOLITHIC("flatMonolithic"),
  THICK("thick");
  
  private final String value;
  
  VirtualDiskType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDiskType fromValue(String paramString) {
    for (VirtualDiskType virtualDiskType : values()) {
      if (virtualDiskType.value.equals(paramString))
        return virtualDiskType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
