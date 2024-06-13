package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VAppEntityConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VAppEntityConfigInfo", propOrder = {"key", "tag", "startOrder", "startDelay", "waitingForGuest", "startAction", "stopDelay", "stopAction", "destroyWithParent"})
public class VAppEntityConfigInfo extends DynamicData {
  protected ManagedObjectReference key;
  
  protected String tag;
  
  protected Integer startOrder;
  
  protected Integer startDelay;
  
  protected Boolean waitingForGuest;
  
  protected String startAction;
  
  protected Integer stopDelay;
  
  protected String stopAction;
  
  protected Boolean destroyWithParent;
  
  public ManagedObjectReference getKey() {
    return this.key;
  }
  
  public void setKey(ManagedObjectReference paramManagedObjectReference) {
    this.key = paramManagedObjectReference;
  }
  
  public String getTag() {
    return this.tag;
  }
  
  public void setTag(String paramString) {
    this.tag = paramString;
  }
  
  public Integer getStartOrder() {
    return this.startOrder;
  }
  
  public void setStartOrder(Integer paramInteger) {
    this.startOrder = paramInteger;
  }
  
  public Integer getStartDelay() {
    return this.startDelay;
  }
  
  public void setStartDelay(Integer paramInteger) {
    this.startDelay = paramInteger;
  }
  
  public Boolean isWaitingForGuest() {
    return this.waitingForGuest;
  }
  
  public void setWaitingForGuest(Boolean paramBoolean) {
    this.waitingForGuest = paramBoolean;
  }
  
  public String getStartAction() {
    return this.startAction;
  }
  
  public void setStartAction(String paramString) {
    this.startAction = paramString;
  }
  
  public Integer getStopDelay() {
    return this.stopDelay;
  }
  
  public void setStopDelay(Integer paramInteger) {
    this.stopDelay = paramInteger;
  }
  
  public String getStopAction() {
    return this.stopAction;
  }
  
  public void setStopAction(String paramString) {
    this.stopAction = paramString;
  }
  
  public Boolean isDestroyWithParent() {
    return this.destroyWithParent;
  }
  
  public void setDestroyWithParent(Boolean paramBoolean) {
    this.destroyWithParent = paramBoolean;
  }
}
