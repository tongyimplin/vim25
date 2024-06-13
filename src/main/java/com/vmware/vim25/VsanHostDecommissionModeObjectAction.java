package com.vmware.vim25;

import com.vmware.vim25.VsanHostDecommissionModeObjectAction;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VsanHostDecommissionModeObjectAction")
@XmlEnum
public enum VsanHostDecommissionModeObjectAction {
  NO_ACTION("noAction"),
  ENSURE_OBJECT_ACCESSIBILITY("ensureObjectAccessibility"),
  EVACUATE_ALL_DATA("evacuateAllData");
  
  private final String value;
  
  VsanHostDecommissionModeObjectAction(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VsanHostDecommissionModeObjectAction fromValue(String paramString) {
    for (VsanHostDecommissionModeObjectAction vsanHostDecommissionModeObjectAction : values()) {
      if (vsanHostDecommissionModeObjectAction.value.equals(paramString))
        return vsanHostDecommissionModeObjectAction; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
