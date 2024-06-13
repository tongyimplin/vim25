package com.vmware.vim25;

import com.vmware.vim25.AutoStartWaitHeartbeatSetting;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AutoStartWaitHeartbeatSetting")
@XmlEnum
public enum AutoStartWaitHeartbeatSetting {
  YES("yes"),
  NO("no"),
  SYSTEM_DEFAULT("systemDefault");
  
  private final String value;
  
  AutoStartWaitHeartbeatSetting(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static AutoStartWaitHeartbeatSetting fromValue(String paramString) {
    for (AutoStartWaitHeartbeatSetting autoStartWaitHeartbeatSetting : values()) {
      if (autoStartWaitHeartbeatSetting.value.equals(paramString))
        return autoStartWaitHeartbeatSetting; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
