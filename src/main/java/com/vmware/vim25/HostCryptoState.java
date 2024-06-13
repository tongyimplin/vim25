package com.vmware.vim25;

import com.vmware.vim25.HostCryptoState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostCryptoState")
@XmlEnum
public enum HostCryptoState {
  INCAPABLE("incapable"),
  PREPARED("prepared"),
  SAFE("safe"),
  PENDING_INCAPABLE("pendingIncapable");
  
  private final String value;
  
  HostCryptoState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostCryptoState fromValue(String paramString) {
    for (HostCryptoState hostCryptoState : values()) {
      if (hostCryptoState.value.equals(paramString))
        return hostCryptoState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
