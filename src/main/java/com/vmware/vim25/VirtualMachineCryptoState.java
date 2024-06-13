package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineCryptoState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineCryptoState")
@XmlEnum
public enum VirtualMachineCryptoState {
  UNLOCKED("unlocked"),
  LOCKED("locked");
  
  private final String value;
  
  VirtualMachineCryptoState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineCryptoState fromValue(String paramString) {
    for (VirtualMachineCryptoState virtualMachineCryptoState : values()) {
      if (virtualMachineCryptoState.value.equals(paramString))
        return virtualMachineCryptoState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
