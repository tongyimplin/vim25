package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineDefaultPowerOpInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDefaultPowerOpInfo", propOrder = {"powerOffType", "suspendType", "resetType", "defaultPowerOffType", "defaultSuspendType", "defaultResetType", "standbyAction"})
public class VirtualMachineDefaultPowerOpInfo extends DynamicData {
  protected String powerOffType;
  
  protected String suspendType;
  
  protected String resetType;
  
  protected String defaultPowerOffType;
  
  protected String defaultSuspendType;
  
  protected String defaultResetType;
  
  protected String standbyAction;
  
  public String getPowerOffType() {
    return this.powerOffType;
  }
  
  public void setPowerOffType(String paramString) {
    this.powerOffType = paramString;
  }
  
  public String getSuspendType() {
    return this.suspendType;
  }
  
  public void setSuspendType(String paramString) {
    this.suspendType = paramString;
  }
  
  public String getResetType() {
    return this.resetType;
  }
  
  public void setResetType(String paramString) {
    this.resetType = paramString;
  }
  
  public String getDefaultPowerOffType() {
    return this.defaultPowerOffType;
  }
  
  public void setDefaultPowerOffType(String paramString) {
    this.defaultPowerOffType = paramString;
  }
  
  public String getDefaultSuspendType() {
    return this.defaultSuspendType;
  }
  
  public void setDefaultSuspendType(String paramString) {
    this.defaultSuspendType = paramString;
  }
  
  public String getDefaultResetType() {
    return this.defaultResetType;
  }
  
  public void setDefaultResetType(String paramString) {
    this.defaultResetType = paramString;
  }
  
  public String getStandbyAction() {
    return this.standbyAction;
  }
  
  public void setStandbyAction(String paramString) {
    this.standbyAction = paramString;
  }
}
