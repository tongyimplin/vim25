package com.vmware.vim25;

import com.vmware.vim25.ConfigSpecOperation;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ConfigSpecOperation")
@XmlEnum
public enum ConfigSpecOperation {
  ADD("add"),
  EDIT("edit"),
  REMOVE("remove");
  
  private final String value;
  
  ConfigSpecOperation(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ConfigSpecOperation fromValue(String paramString) {
    for (ConfigSpecOperation configSpecOperation : values()) {
      if (configSpecOperation.value.equals(paramString))
        return configSpecOperation; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
