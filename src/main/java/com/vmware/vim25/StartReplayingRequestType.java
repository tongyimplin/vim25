package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StartReplayingRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartReplayingRequestType", propOrder = {"_this", "replaySnapshot"})
public class StartReplayingRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference replaySnapshot;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getReplaySnapshot() {
    return this.replaySnapshot;
  }
  
  public void setReplaySnapshot(ManagedObjectReference paramManagedObjectReference) {
    this.replaySnapshot = paramManagedObjectReference;
  }
}
