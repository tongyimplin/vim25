package com.vmware.vim25;

import com.vmware.vim25.ChangeLockdownModeRequestType;
import com.vmware.vim25.HostLockdownMode;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeLockdownModeRequestType", propOrder = {"_this", "mode"})
public class ChangeLockdownModeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostLockdownMode mode;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostLockdownMode getMode() {
    return this.mode;
  }
  
  public void setMode(HostLockdownMode paramHostLockdownMode) {
    this.mode = paramHostLockdownMode;
  }
}
