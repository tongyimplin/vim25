package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ScheduledHardwareUpgradeInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledHardwareUpgradeInfo", propOrder = {"upgradePolicy", "versionKey", "scheduledHardwareUpgradeStatus", "fault"})
public class ScheduledHardwareUpgradeInfo extends DynamicData {
  protected String upgradePolicy;
  
  protected String versionKey;
  
  protected String scheduledHardwareUpgradeStatus;
  
  protected LocalizedMethodFault fault;
  
  public String getUpgradePolicy() {
    return this.upgradePolicy;
  }
  
  public void setUpgradePolicy(String paramString) {
    this.upgradePolicy = paramString;
  }
  
  public String getVersionKey() {
    return this.versionKey;
  }
  
  public void setVersionKey(String paramString) {
    this.versionKey = paramString;
  }
  
  public String getScheduledHardwareUpgradeStatus() {
    return this.scheduledHardwareUpgradeStatus;
  }
  
  public void setScheduledHardwareUpgradeStatus(String paramString) {
    this.scheduledHardwareUpgradeStatus = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
