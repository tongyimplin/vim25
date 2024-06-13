package com.vmware.vim25;

import com.vmware.vim25.HostHasComponentFailureHostComponentType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostHasComponentFailureHostComponentType")
@XmlEnum
public enum HostHasComponentFailureHostComponentType {
  DATASTORE("Datastore");
  
  private final String value;
  
  HostHasComponentFailureHostComponentType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostHasComponentFailureHostComponentType fromValue(String paramString) {
    for (HostHasComponentFailureHostComponentType hostHasComponentFailureHostComponentType : values()) {
      if (hostHasComponentFailureHostComponentType.value.equals(paramString))
        return hostHasComponentFailureHostComponentType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
