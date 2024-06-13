package com.vmware.vim25;

import com.vmware.vim25.AutoStartDefaults;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoStartDefaults", propOrder = {"enabled", "startDelay", "stopDelay", "waitForHeartbeat", "stopAction"})
public class AutoStartDefaults extends DynamicData {
  protected Boolean enabled;
  
  protected Integer startDelay;
  
  protected Integer stopDelay;
  
  protected Boolean waitForHeartbeat;
  
  protected String stopAction;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public Integer getStartDelay() {
    return this.startDelay;
  }
  
  public void setStartDelay(Integer paramInteger) {
    this.startDelay = paramInteger;
  }
  
  public Integer getStopDelay() {
    return this.stopDelay;
  }
  
  public void setStopDelay(Integer paramInteger) {
    this.stopDelay = paramInteger;
  }
  
  public Boolean isWaitForHeartbeat() {
    return this.waitForHeartbeat;
  }
  
  public void setWaitForHeartbeat(Boolean paramBoolean) {
    this.waitForHeartbeat = paramBoolean;
  }
  
  public String getStopAction() {
    return this.stopAction;
  }
  
  public void setStopAction(String paramString) {
    this.stopAction = paramString;
  }
}
