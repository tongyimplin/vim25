package com.vmware.vim25;

import com.vmware.vim25.VirtualAppVAppState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualAppVAppState")
@XmlEnum
public enum VirtualAppVAppState {
  STARTED("started"),
  STOPPED("stopped"),
  STARTING("starting"),
  STOPPING("stopping");
  
  private final String value;
  
  VirtualAppVAppState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualAppVAppState fromValue(String paramString) {
    for (VirtualAppVAppState virtualAppVAppState : values()) {
      if (virtualAppVAppState.value.equals(paramString))
        return virtualAppVAppState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
