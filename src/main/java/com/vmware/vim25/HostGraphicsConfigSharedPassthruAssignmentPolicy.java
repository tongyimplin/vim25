package com.vmware.vim25;

import com.vmware.vim25.HostGraphicsConfigSharedPassthruAssignmentPolicy;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostGraphicsConfigSharedPassthruAssignmentPolicy")
@XmlEnum
public enum HostGraphicsConfigSharedPassthruAssignmentPolicy {
  PERFORMANCE("performance"),
  CONSOLIDATION("consolidation");
  
  private final String value;
  
  HostGraphicsConfigSharedPassthruAssignmentPolicy(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostGraphicsConfigSharedPassthruAssignmentPolicy fromValue(String paramString) {
    for (HostGraphicsConfigSharedPassthruAssignmentPolicy hostGraphicsConfigSharedPassthruAssignmentPolicy : values()) {
      if (hostGraphicsConfigSharedPassthruAssignmentPolicy.value.equals(paramString))
        return hostGraphicsConfigSharedPassthruAssignmentPolicy; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
