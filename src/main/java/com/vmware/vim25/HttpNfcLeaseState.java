package com.vmware.vim25;

import com.vmware.vim25.HttpNfcLeaseState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HttpNfcLeaseState")
@XmlEnum
public enum HttpNfcLeaseState {
  INITIALIZING("initializing"),
  READY("ready"),
  DONE("done"),
  ERROR("error");
  
  private final String value;
  
  HttpNfcLeaseState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HttpNfcLeaseState fromValue(String paramString) {
    for (HttpNfcLeaseState httpNfcLeaseState : values()) {
      if (httpNfcLeaseState.value.equals(paramString))
        return httpNfcLeaseState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
