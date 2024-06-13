package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineUsbInfoFamily;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualMachineUsbInfoFamily")
@XmlEnum
public enum VirtualMachineUsbInfoFamily {
  AUDIO("audio"),
  HID("hid"),
  HID_BOOTABLE("hid_bootable"),
  PHYSICAL("physical"),
  COMMUNICATION("communication"),
  IMAGING("imaging"),
  PRINTER("printer"),
  STORAGE("storage"),
  HUB("hub"),
  SMART_CARD("smart_card"),
  SECURITY("security"),
  VIDEO("video"),
  WIRELESS("wireless"),
  BLUETOOTH("bluetooth"),
  WUSB("wusb"),
  PDA("pda"),
  VENDOR_SPECIFIC("vendor_specific"),
  OTHER("other"),
  UNKNOWN_FAMILY("unknownFamily");
  
  private final String value;
  
  VirtualMachineUsbInfoFamily(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualMachineUsbInfoFamily fromValue(String paramString) {
    for (VirtualMachineUsbInfoFamily virtualMachineUsbInfoFamily : values()) {
      if (virtualMachineUsbInfoFamily.value.equals(paramString))
        return virtualMachineUsbInfoFamily; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
