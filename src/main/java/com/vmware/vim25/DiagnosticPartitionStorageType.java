package com.vmware.vim25;

import com.vmware.vim25.DiagnosticPartitionStorageType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DiagnosticPartitionStorageType")
@XmlEnum
public enum DiagnosticPartitionStorageType {
  DIRECT_ATTACHED("directAttached"),
  NETWORK_ATTACHED("networkAttached");
  
  private final String value;
  
  DiagnosticPartitionStorageType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DiagnosticPartitionStorageType fromValue(String paramString) {
    for (DiagnosticPartitionStorageType diagnosticPartitionStorageType : values()) {
      if (diagnosticPartitionStorageType.value.equals(paramString))
        return diagnosticPartitionStorageType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
