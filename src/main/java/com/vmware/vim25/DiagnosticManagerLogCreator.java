package com.vmware.vim25;

import com.vmware.vim25.DiagnosticManagerLogCreator;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DiagnosticManagerLogCreator")
@XmlEnum
public enum DiagnosticManagerLogCreator {
  VPXD("vpxd"),
  VPXA("vpxa"),
  HOSTD("hostd"),
  SERVERD("serverd"),
  INSTALL("install"),
  VPX_CLIENT("vpxClient"),
  RECORD_LOG("recordLog");
  
  private final String value;
  
  DiagnosticManagerLogCreator(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DiagnosticManagerLogCreator fromValue(String paramString) {
    for (DiagnosticManagerLogCreator diagnosticManagerLogCreator : values()) {
      if (diagnosticManagerLogCreator.value.equals(paramString))
        return diagnosticManagerLogCreator; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
