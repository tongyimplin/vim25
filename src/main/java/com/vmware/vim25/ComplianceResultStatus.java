package com.vmware.vim25;

import com.vmware.vim25.ComplianceResultStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ComplianceResultStatus")
@XmlEnum
public enum ComplianceResultStatus {
  COMPLIANT("compliant"),
  NON_COMPLIANT("nonCompliant"),
  UNKNOWN("unknown"),
  RUNNING("running");
  
  private final String value;
  
  ComplianceResultStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ComplianceResultStatus fromValue(String paramString) {
    for (ComplianceResultStatus complianceResultStatus : values()) {
      if (complianceResultStatus.value.equals(paramString))
        return complianceResultStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
