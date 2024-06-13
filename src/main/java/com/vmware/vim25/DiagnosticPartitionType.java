package com.vmware.vim25;

import com.vmware.vim25.DiagnosticPartitionType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DiagnosticPartitionType")
@XmlEnum
public enum DiagnosticPartitionType {
  SINGLE_HOST("singleHost"),
  MULTI_HOST("multiHost");
  
  private final String value;
  
  DiagnosticPartitionType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DiagnosticPartitionType fromValue(String paramString) {
    for (DiagnosticPartitionType diagnosticPartitionType : values()) {
      if (diagnosticPartitionType.value.equals(paramString))
        return diagnosticPartitionType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
