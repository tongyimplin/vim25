package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RevertToSnapshotRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevertToSnapshotRequestType", propOrder = {"_this", "host", "suppressPowerOn"})
public class RevertToSnapshotRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference host;
  
  protected Boolean suppressPowerOn;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public Boolean isSuppressPowerOn() {
    return this.suppressPowerOn;
  }
  
  public void setSuppressPowerOn(Boolean paramBoolean) {
    this.suppressPowerOn = paramBoolean;
  }
}
