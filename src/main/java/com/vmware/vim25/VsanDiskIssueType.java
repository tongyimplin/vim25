package com.vmware.vim25;

import com.vmware.vim25.VsanDiskIssueType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VsanDiskIssueType")
@XmlEnum
public enum VsanDiskIssueType {
  NON_EXIST("nonExist"),
  STAMP_MISMATCH("stampMismatch"),
  UNKNOWN("unknown");
  
  private final String value;
  
  VsanDiskIssueType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VsanDiskIssueType fromValue(String paramString) {
    for (VsanDiskIssueType vsanDiskIssueType : values()) {
      if (vsanDiskIssueType.value.equals(paramString))
        return vsanDiskIssueType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
