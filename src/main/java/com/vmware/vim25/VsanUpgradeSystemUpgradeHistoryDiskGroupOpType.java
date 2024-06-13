package com.vmware.vim25;

import com.vmware.vim25.VsanUpgradeSystemUpgradeHistoryDiskGroupOpType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VsanUpgradeSystemUpgradeHistoryDiskGroupOpType")
@XmlEnum
public enum VsanUpgradeSystemUpgradeHistoryDiskGroupOpType {
  ADD("add"),
  REMOVE("remove");
  
  private final String value;
  
  VsanUpgradeSystemUpgradeHistoryDiskGroupOpType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VsanUpgradeSystemUpgradeHistoryDiskGroupOpType fromValue(String paramString) {
    for (VsanUpgradeSystemUpgradeHistoryDiskGroupOpType vsanUpgradeSystemUpgradeHistoryDiskGroupOpType : values()) {
      if (vsanUpgradeSystemUpgradeHistoryDiskGroupOpType.value.equals(paramString))
        return vsanUpgradeSystemUpgradeHistoryDiskGroupOpType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
