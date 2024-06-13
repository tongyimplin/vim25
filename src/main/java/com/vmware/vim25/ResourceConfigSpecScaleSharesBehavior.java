package com.vmware.vim25;

import com.vmware.vim25.ResourceConfigSpecScaleSharesBehavior;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ResourceConfigSpecScaleSharesBehavior")
@XmlEnum
public enum ResourceConfigSpecScaleSharesBehavior {
  DISABLED("disabled"),
  SCALE_CPU_AND_MEMORY_SHARES("scaleCpuAndMemoryShares");
  
  private final String value;
  
  ResourceConfigSpecScaleSharesBehavior(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ResourceConfigSpecScaleSharesBehavior fromValue(String paramString) {
    for (ResourceConfigSpecScaleSharesBehavior resourceConfigSpecScaleSharesBehavior : values()) {
      if (resourceConfigSpecScaleSharesBehavior.value.equals(paramString))
        return resourceConfigSpecScaleSharesBehavior; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
