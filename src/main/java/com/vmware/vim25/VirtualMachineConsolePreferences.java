package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineConsolePreferences;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineConsolePreferences", propOrder = {"powerOnWhenOpened", "enterFullScreenOnPowerOn", "closeOnPowerOffOrSuspend"})
public class VirtualMachineConsolePreferences extends DynamicData {
  protected Boolean powerOnWhenOpened;
  
  protected Boolean enterFullScreenOnPowerOn;
  
  protected Boolean closeOnPowerOffOrSuspend;
  
  public Boolean isPowerOnWhenOpened() {
    return this.powerOnWhenOpened;
  }
  
  public void setPowerOnWhenOpened(Boolean paramBoolean) {
    this.powerOnWhenOpened = paramBoolean;
  }
  
  public Boolean isEnterFullScreenOnPowerOn() {
    return this.enterFullScreenOnPowerOn;
  }
  
  public void setEnterFullScreenOnPowerOn(Boolean paramBoolean) {
    this.enterFullScreenOnPowerOn = paramBoolean;
  }
  
  public Boolean isCloseOnPowerOffOrSuspend() {
    return this.closeOnPowerOffOrSuspend;
  }
  
  public void setCloseOnPowerOffOrSuspend(Boolean paramBoolean) {
    this.closeOnPowerOffOrSuspend = paramBoolean;
  }
}
