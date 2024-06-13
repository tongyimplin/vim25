package com.vmware.vim25;

import com.vmware.vim25.VirtualVmxnet3VrdmaOptionDeviceProtocols;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualVmxnet3VrdmaOptionDeviceProtocols")
@XmlEnum
public enum VirtualVmxnet3VrdmaOptionDeviceProtocols {
  ROCEV_1("rocev1"),
  ROCEV_2("rocev2");
  
  private final String value;
  
  VirtualVmxnet3VrdmaOptionDeviceProtocols(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualVmxnet3VrdmaOptionDeviceProtocols fromValue(String paramString) {
    for (VirtualVmxnet3VrdmaOptionDeviceProtocols virtualVmxnet3VrdmaOptionDeviceProtocols : values()) {
      if (virtualVmxnet3VrdmaOptionDeviceProtocols.value.equals(paramString))
        return virtualVmxnet3VrdmaOptionDeviceProtocols; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
