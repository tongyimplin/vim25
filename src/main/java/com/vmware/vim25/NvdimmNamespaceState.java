package com.vmware.vim25;

import com.vmware.vim25.NvdimmNamespaceState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NvdimmNamespaceState")
@XmlEnum
public enum NvdimmNamespaceState {
  INVALID("invalid"),
  NOT_IN_USE("notInUse"),
  IN_USE("inUse");
  
  private final String value;
  
  NvdimmNamespaceState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NvdimmNamespaceState fromValue(String paramString) {
    for (NvdimmNamespaceState nvdimmNamespaceState : values()) {
      if (nvdimmNamespaceState.value.equals(paramString))
        return nvdimmNamespaceState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
