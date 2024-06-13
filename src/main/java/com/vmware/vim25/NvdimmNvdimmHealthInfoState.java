package com.vmware.vim25;

import com.vmware.vim25.NvdimmNvdimmHealthInfoState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NvdimmNvdimmHealthInfoState")
@XmlEnum
public enum NvdimmNvdimmHealthInfoState {
  NORMAL("normal"),
  ERROR("error");
  
  private final String value;
  
  NvdimmNvdimmHealthInfoState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NvdimmNvdimmHealthInfoState fromValue(String paramString) {
    for (NvdimmNvdimmHealthInfoState nvdimmNvdimmHealthInfoState : values()) {
      if (nvdimmNvdimmHealthInfoState.value.equals(paramString))
        return nvdimmNvdimmHealthInfoState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
