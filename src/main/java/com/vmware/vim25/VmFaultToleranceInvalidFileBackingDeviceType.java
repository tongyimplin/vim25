package com.vmware.vim25;

import com.vmware.vim25.VmFaultToleranceInvalidFileBackingDeviceType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VmFaultToleranceInvalidFileBackingDeviceType")
@XmlEnum
public enum VmFaultToleranceInvalidFileBackingDeviceType {
  VIRTUAL_FLOPPY("virtualFloppy"),
  VIRTUAL_CDROM("virtualCdrom"),
  VIRTUAL_SERIAL_PORT("virtualSerialPort"),
  VIRTUAL_PARALLEL_PORT("virtualParallelPort"),
  VIRTUAL_DISK("virtualDisk");
  
  private final String value;
  
  VmFaultToleranceInvalidFileBackingDeviceType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VmFaultToleranceInvalidFileBackingDeviceType fromValue(String paramString) {
    for (VmFaultToleranceInvalidFileBackingDeviceType vmFaultToleranceInvalidFileBackingDeviceType : values()) {
      if (vmFaultToleranceInvalidFileBackingDeviceType.value.equals(paramString))
        return vmFaultToleranceInvalidFileBackingDeviceType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
