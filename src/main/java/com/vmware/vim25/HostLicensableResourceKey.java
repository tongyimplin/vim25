package com.vmware.vim25;

import com.vmware.vim25.HostLicensableResourceKey;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostLicensableResourceKey")
@XmlEnum
public enum HostLicensableResourceKey {
  NUM_CPU_PACKAGES("numCpuPackages"),
  NUM_CPU_CORES("numCpuCores"),
  MEMORY_SIZE("memorySize"),
  MEMORY_FOR_VMS("memoryForVms"),
  NUM_VMS_STARTED("numVmsStarted"),
  NUM_VMS_STARTING("numVmsStarting");
  
  private final String value;
  
  HostLicensableResourceKey(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostLicensableResourceKey fromValue(String paramString) {
    for (HostLicensableResourceKey hostLicensableResourceKey : values()) {
      if (hostLicensableResourceKey.value.equals(paramString))
        return hostLicensableResourceKey; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
