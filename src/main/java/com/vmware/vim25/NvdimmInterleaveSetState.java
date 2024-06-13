package com.vmware.vim25;

import com.vmware.vim25.NvdimmInterleaveSetState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NvdimmInterleaveSetState")
@XmlEnum
public enum NvdimmInterleaveSetState {
  INVALID("invalid"),
  ACTIVE("active");
  
  private final String value;
  
  NvdimmInterleaveSetState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NvdimmInterleaveSetState fromValue(String paramString) {
    for (NvdimmInterleaveSetState nvdimmInterleaveSetState : values()) {
      if (nvdimmInterleaveSetState.value.equals(paramString))
        return nvdimmInterleaveSetState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
