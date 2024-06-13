package com.vmware.vim25;

import com.vmware.vim25.ExitMaintenanceModeRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExitMaintenanceModeRequestType", propOrder = {"_this", "timeout"})
public class ExitMaintenanceModeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int timeout;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public int getTimeout() {
    return this.timeout;
  }
  
  public void setTimeout(int paramInt) {
    this.timeout = paramInt;
  }
}
