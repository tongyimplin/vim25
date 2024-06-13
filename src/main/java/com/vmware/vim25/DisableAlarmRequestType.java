package com.vmware.vim25;

import com.vmware.vim25.DisableAlarmRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisableAlarmRequestType", propOrder = {"_this", "alarm", "entity"})
public class DisableAlarmRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference alarm;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAlarm() {
    return this.alarm;
  }
  
  public void setAlarm(ManagedObjectReference paramManagedObjectReference) {
    this.alarm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
}
