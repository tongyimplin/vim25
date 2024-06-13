package com.vmware.vim25;

import com.vmware.vim25.NumVirtualCpusIncompatibleReason;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NumVirtualCpusIncompatibleReason")
@XmlEnum
public enum NumVirtualCpusIncompatibleReason {
  RECORD_REPLAY("recordReplay"),
  FAULT_TOLERANCE("faultTolerance");
  
  private final String value;
  
  NumVirtualCpusIncompatibleReason(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NumVirtualCpusIncompatibleReason fromValue(String paramString) {
    for (NumVirtualCpusIncompatibleReason numVirtualCpusIncompatibleReason : values()) {
      if (numVirtualCpusIncompatibleReason.value.equals(paramString))
        return numVirtualCpusIncompatibleReason; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
