package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PowerUpHostFromStandByRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerUpHostFromStandByRequestType", propOrder = {"_this", "timeoutSec"})
public class PowerUpHostFromStandByRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int timeoutSec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public int getTimeoutSec() {
    return this.timeoutSec;
  }
  
  public void setTimeoutSec(int paramInt) {
    this.timeoutSec = paramInt;
  }
}
