package com.vmware.vim25;

import com.vmware.vim25.ScheduledHardwareUpgradeInfoHardwareUpgradePolicy;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ScheduledHardwareUpgradeInfoHardwareUpgradePolicy")
@XmlEnum
public enum ScheduledHardwareUpgradeInfoHardwareUpgradePolicy {
  NEVER("never"),
  ON_SOFT_POWER_OFF("onSoftPowerOff"),
  ALWAYS("always");
  
  private final String value;
  
  ScheduledHardwareUpgradeInfoHardwareUpgradePolicy(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ScheduledHardwareUpgradeInfoHardwareUpgradePolicy fromValue(String paramString) {
    for (ScheduledHardwareUpgradeInfoHardwareUpgradePolicy scheduledHardwareUpgradeInfoHardwareUpgradePolicy : values()) {
      if (scheduledHardwareUpgradeInfoHardwareUpgradePolicy.value.equals(paramString))
        return scheduledHardwareUpgradeInfoHardwareUpgradePolicy; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
