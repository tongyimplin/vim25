package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PerfInterval;
import com.vmware.vim25.UpdatePerfIntervalRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePerfIntervalRequestType", propOrder = {"_this", "interval"})
public class UpdatePerfIntervalRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected PerfInterval interval;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public PerfInterval getInterval() {
    return this.interval;
  }
  
  public void setInterval(PerfInterval paramPerfInterval) {
    this.interval = paramPerfInterval;
  }
}
