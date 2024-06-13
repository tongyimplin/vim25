package com.vmware.vim25;

import com.vmware.vim25.UpgradePolicy;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "UpgradePolicy")
@XmlEnum
public enum UpgradePolicy {
  MANUAL("manual"),
  UPGRADE_AT_POWER_CYCLE("upgradeAtPowerCycle");
  
  private final String value;
  
  UpgradePolicy(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static UpgradePolicy fromValue(String paramString) {
    for (UpgradePolicy upgradePolicy : values()) {
      if (upgradePolicy.value.equals(paramString))
        return upgradePolicy; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
