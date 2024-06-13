package com.vmware.vim25;

import com.vmware.vim25.NotSupportedDeviceForFTDeviceType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NotSupportedDeviceForFTDeviceType")
@XmlEnum
public enum NotSupportedDeviceForFTDeviceType {
  VIRTUAL_VMXNET_3("virtualVmxnet3"),
  PARA_VIRTUAL_SCSI_CONTROLLER("paraVirtualSCSIController");
  
  private final String value;
  
  NotSupportedDeviceForFTDeviceType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static NotSupportedDeviceForFTDeviceType fromValue(String paramString) {
    for (NotSupportedDeviceForFTDeviceType notSupportedDeviceForFTDeviceType : values()) {
      if (notSupportedDeviceForFTDeviceType.value.equals(paramString))
        return notSupportedDeviceForFTDeviceType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
