package com.vmware.vim25;

import com.vmware.vim25.VsanHostDiskResultState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VsanHostDiskResultState")
@XmlEnum
public enum VsanHostDiskResultState {
  IN_USE("inUse"),
  ELIGIBLE("eligible"),
  INELIGIBLE("ineligible");
  
  private final String value;
  
  VsanHostDiskResultState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VsanHostDiskResultState fromValue(String paramString) {
    for (VsanHostDiskResultState vsanHostDiskResultState : values()) {
      if (vsanHostDiskResultState.value.equals(paramString))
        return vsanHostDiskResultState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
