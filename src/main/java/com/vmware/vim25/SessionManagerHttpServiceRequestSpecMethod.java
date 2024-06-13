package com.vmware.vim25;

import com.vmware.vim25.SessionManagerHttpServiceRequestSpecMethod;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "SessionManagerHttpServiceRequestSpecMethod")
@XmlEnum
public enum SessionManagerHttpServiceRequestSpecMethod {
  HTTP_OPTIONS("httpOptions"),
  HTTP_GET("httpGet"),
  HTTP_HEAD("httpHead"),
  HTTP_POST("httpPost"),
  HTTP_PUT("httpPut"),
  HTTP_DELETE("httpDelete"),
  HTTP_TRACE("httpTrace"),
  HTTP_CONNECT("httpConnect");
  
  private final String value;
  
  SessionManagerHttpServiceRequestSpecMethod(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static SessionManagerHttpServiceRequestSpecMethod fromValue(String paramString) {
    for (SessionManagerHttpServiceRequestSpecMethod sessionManagerHttpServiceRequestSpecMethod : values()) {
      if (sessionManagerHttpServiceRequestSpecMethod.value.equals(paramString))
        return sessionManagerHttpServiceRequestSpecMethod; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
