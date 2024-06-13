package com.vmware.vim25;

import com.vmware.vim25.ManagedEntityStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ManagedEntityStatus")
@XmlEnum
public enum ManagedEntityStatus {
  GRAY("gray"),
  GREEN("green"),
  YELLOW("yellow"),
  RED("red");
  
  private final String value;
  
  ManagedEntityStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ManagedEntityStatus fromValue(String paramString) {
    for (ManagedEntityStatus managedEntityStatus : values()) {
      if (managedEntityStatus.value.equals(paramString))
        return managedEntityStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
