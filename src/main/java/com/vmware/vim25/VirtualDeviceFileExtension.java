package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceFileExtension;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualDeviceFileExtension")
@XmlEnum
public enum VirtualDeviceFileExtension {
  ISO("iso"),
  FLP("flp"),
  VMDK("vmdk"),
  DSK("dsk"),
  RDM("rdm");
  
  private final String value;
  
  VirtualDeviceFileExtension(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualDeviceFileExtension fromValue(String paramString) {
    for (VirtualDeviceFileExtension virtualDeviceFileExtension : values()) {
      if (virtualDeviceFileExtension.value.equals(paramString))
        return virtualDeviceFileExtension; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
