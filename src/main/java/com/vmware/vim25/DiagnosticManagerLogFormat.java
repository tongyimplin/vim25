package com.vmware.vim25;

import com.vmware.vim25.DiagnosticManagerLogFormat;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DiagnosticManagerLogFormat")
@XmlEnum
public enum DiagnosticManagerLogFormat {
  PLAIN("plain");
  
  private final String value;
  
  DiagnosticManagerLogFormat(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DiagnosticManagerLogFormat fromValue(String paramString) {
    for (DiagnosticManagerLogFormat diagnosticManagerLogFormat : values()) {
      if (diagnosticManagerLogFormat.value.equals(paramString))
        return diagnosticManagerLogFormat; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
