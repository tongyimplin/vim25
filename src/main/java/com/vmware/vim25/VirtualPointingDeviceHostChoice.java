package com.vmware.vim25;

import com.vmware.vim25.VirtualPointingDeviceHostChoice;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualPointingDeviceHostChoice")
@XmlEnum
public enum VirtualPointingDeviceHostChoice {
  AUTODETECT("autodetect"),
  INTELLIMOUSE_EXPLORER("intellimouseExplorer"),
  INTELLIMOUSE_PS_2("intellimousePs2"),
  LOGITECH_MOUSEMAN("logitechMouseman"),
  MICROSOFT_SERIAL("microsoft_serial"),
  MOUSE_SYSTEMS("mouseSystems"),
  MOUSEMAN_SERIAL("mousemanSerial"),
  PS_2("ps2");
  
  private final String value;
  
  VirtualPointingDeviceHostChoice(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static VirtualPointingDeviceHostChoice fromValue(String paramString) {
    for (VirtualPointingDeviceHostChoice virtualPointingDeviceHostChoice : values()) {
      if (virtualPointingDeviceHostChoice.value.equals(paramString))
        return virtualPointingDeviceHostChoice; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
