package com.vmware.vim25;

import com.vmware.vim25.NvdimmNamespaceDetailsState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NvdimmNamespaceDetailsState")
@XmlEnum
public enum NvdimmNamespaceDetailsState {
  INVALID("invalid"),
  NOT_IN_USE("notInUse"),
  IN_USE("inUse");
  
  private final String value;
  
  NvdimmNamespaceDetailsState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NvdimmNamespaceDetailsState fromValue(String paramString) {
    for (NvdimmNamespaceDetailsState nvdimmNamespaceDetailsState : values()) {
      if (nvdimmNamespaceDetailsState.value.equals(paramString))
        return nvdimmNamespaceDetailsState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
