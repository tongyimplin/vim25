package com.vmware.vim25;

import com.vmware.vim25.AutoStartPowerInfo;
import com.vmware.vim25.AutoStartWaitHeartbeatSetting;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoStartPowerInfo", propOrder = {"key", "startOrder", "startDelay", "waitForHeartbeat", "startAction", "stopDelay", "stopAction"})
public class AutoStartPowerInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference key;
  
  protected int startOrder;
  
  protected int startDelay;
  
  @XmlElement(required = true)
  protected AutoStartWaitHeartbeatSetting waitForHeartbeat;
  
  @XmlElement(required = true)
  protected String startAction;
  
  protected int stopDelay;
  
  @XmlElement(required = true)
  protected String stopAction;
  
  public ManagedObjectReference getKey() {
    return this.key;
  }
  
  public void setKey(ManagedObjectReference paramManagedObjectReference) {
    this.key = paramManagedObjectReference;
  }
  
  public int getStartOrder() {
    return this.startOrder;
  }
  
  public void setStartOrder(int paramInt) {
    this.startOrder = paramInt;
  }
  
  public int getStartDelay() {
    return this.startDelay;
  }
  
  public void setStartDelay(int paramInt) {
    this.startDelay = paramInt;
  }
  
  public AutoStartWaitHeartbeatSetting getWaitForHeartbeat() {
    return this.waitForHeartbeat;
  }
  
  public void setWaitForHeartbeat(AutoStartWaitHeartbeatSetting paramAutoStartWaitHeartbeatSetting) {
    this.waitForHeartbeat = paramAutoStartWaitHeartbeatSetting;
  }
  
  public String getStartAction() {
    return this.startAction;
  }
  
  public void setStartAction(String paramString) {
    this.startAction = paramString;
  }
  
  public int getStopDelay() {
    return this.stopDelay;
  }
  
  public void setStopDelay(int paramInt) {
    this.stopDelay = paramInt;
  }
  
  public String getStopAction() {
    return this.stopAction;
  }
  
  public void setStopAction(String paramString) {
    this.stopAction = paramString;
  }
}
