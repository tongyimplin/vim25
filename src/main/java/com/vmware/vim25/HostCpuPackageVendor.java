package com.vmware.vim25;

import com.vmware.vim25.HostCpuPackageVendor;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "HostCpuPackageVendor")
@XmlEnum
public enum HostCpuPackageVendor {
  UNKNOWN("unknown"),
  INTEL("intel"),
  AMD("amd"),
  HYGON("hygon");
  
  private final String value;
  
  HostCpuPackageVendor(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static HostCpuPackageVendor fromValue(String paramString) {
    for (HostCpuPackageVendor hostCpuPackageVendor : values()) {
      if (hostCpuPackageVendor.value.equals(paramString))
        return hostCpuPackageVendor; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
