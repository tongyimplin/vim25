package com.vmware.vim25;

import com.vmware.vim25.HostPatchManagerReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostPatchManagerReason")
@XmlEnum
public enum HostPatchManagerReason {
  OBSOLETED("obsoleted"),
  MISSING_PATCH("missingPatch"),
  MISSING_LIB("missingLib"),
  HAS_DEPENDENT_PATCH("hasDependentPatch"),
  CONFLICT_PATCH("conflictPatch"),
  CONFLICT_LIB("conflictLib");
  
  private final String value;
  
  HostPatchManagerReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostPatchManagerReason fromValue(String paramString) {
    for (HostPatchManagerReason hostPatchManagerReason : values()) {
      if (hostPatchManagerReason.value.equals(paramString))
        return hostPatchManagerReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
