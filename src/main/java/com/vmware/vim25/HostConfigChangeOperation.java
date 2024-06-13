package com.vmware.vim25;

import com.vmware.vim25.HostConfigChangeOperation;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostConfigChangeOperation")
@XmlEnum
public enum HostConfigChangeOperation {
  ADD("add"),
  REMOVE("remove"),
  EDIT("edit"),
  IGNORE("ignore");
  
  private final String value;
  
  HostConfigChangeOperation(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostConfigChangeOperation fromValue(String paramString) {
    for (HostConfigChangeOperation hostConfigChangeOperation : values()) {
      if (hostConfigChangeOperation.value.equals(paramString))
        return hostConfigChangeOperation; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
