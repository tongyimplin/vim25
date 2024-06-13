package com.vmware.vim25;

import com.vmware.vim25.ScheduledHardwareUpgradeInfoHardwareUpgradeStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ScheduledHardwareUpgradeInfoHardwareUpgradeStatus")
@XmlEnum
public enum ScheduledHardwareUpgradeInfoHardwareUpgradeStatus {
  NONE("none"),
  PENDING("pending"),
  SUCCESS("success"),
  FAILED("failed");
  
  private final String value;
  
  ScheduledHardwareUpgradeInfoHardwareUpgradeStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ScheduledHardwareUpgradeInfoHardwareUpgradeStatus fromValue(String paramString) {
    for (ScheduledHardwareUpgradeInfoHardwareUpgradeStatus scheduledHardwareUpgradeInfoHardwareUpgradeStatus : values()) {
      if (scheduledHardwareUpgradeInfoHardwareUpgradeStatus.value.equals(paramString))
        return scheduledHardwareUpgradeInfoHardwareUpgradeStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
