package com.vmware.vim25;

import com.vmware.vim25.HttpNfcLeaseMode;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HttpNfcLeaseMode")
@XmlEnum
public enum HttpNfcLeaseMode {
  PUSH_OR_GET("pushOrGet"),
  PULL("pull");
  
  private final String value;
  
  HttpNfcLeaseMode(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HttpNfcLeaseMode fromValue(String paramString) {
    for (HttpNfcLeaseMode httpNfcLeaseMode : values()) {
      if (httpNfcLeaseMode.value.equals(paramString))
        return httpNfcLeaseMode; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
