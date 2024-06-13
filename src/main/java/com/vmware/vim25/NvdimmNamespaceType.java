package com.vmware.vim25;

import com.vmware.vim25.NvdimmNamespaceType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NvdimmNamespaceType")
@XmlEnum
public enum NvdimmNamespaceType {
  BLOCK_NAMESPACE("blockNamespace"),
  PERSISTENT_NAMESPACE("persistentNamespace");
  
  private final String value;
  
  NvdimmNamespaceType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NvdimmNamespaceType fromValue(String paramString) {
    for (NvdimmNamespaceType nvdimmNamespaceType : values()) {
      if (nvdimmNamespaceType.value.equals(paramString))
        return nvdimmNamespaceType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
