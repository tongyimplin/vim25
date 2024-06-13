package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PowerDownHostToStandByRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerDownHostToStandByRequestType", propOrder = {"_this", "timeoutSec", "evacuatePoweredOffVms"})
public class PowerDownHostToStandByRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int timeoutSec;
  
  protected Boolean evacuatePoweredOffVms;
  
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
  
  public Boolean isEvacuatePoweredOffVms() {
    return this.evacuatePoweredOffVms;
  }
  
  public void setEvacuatePoweredOffVms(Boolean paramBoolean) {
    this.evacuatePoweredOffVms = paramBoolean;
  }
}
