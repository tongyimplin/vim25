package com.vmware.vim25;

import com.vmware.vim25.VMwareDvsLacpApiVersion;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VMwareDvsLacpApiVersion")
@XmlEnum
public enum VMwareDvsLacpApiVersion {
  SINGLE_LAG("singleLag"),
  MULTIPLE_LAG("multipleLag");
  
  private final String value;
  
  VMwareDvsLacpApiVersion(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VMwareDvsLacpApiVersion fromValue(String paramString) {
    for (VMwareDvsLacpApiVersion vMwareDvsLacpApiVersion : values()) {
      if (vMwareDvsLacpApiVersion.value.equals(paramString))
        return vMwareDvsLacpApiVersion; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
