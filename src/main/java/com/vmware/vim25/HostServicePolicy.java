package com.vmware.vim25;

import com.vmware.vim25.HostServicePolicy;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostServicePolicy")
@XmlEnum
public enum HostServicePolicy {
  ON("on"),
  AUTOMATIC("automatic"),
  OFF("off");
  
  private final String value;
  
  HostServicePolicy(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostServicePolicy fromValue(String paramString) {
    for (HostServicePolicy hostServicePolicy : values()) {
      if (hostServicePolicy.value.equals(paramString))
        return hostServicePolicy; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
