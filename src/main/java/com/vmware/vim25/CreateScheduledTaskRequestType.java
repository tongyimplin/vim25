package com.vmware.vim25;

import com.vmware.vim25.CreateScheduledTaskRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ScheduledTaskSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateScheduledTaskRequestType", propOrder = {"_this", "entity", "spec"})
public class CreateScheduledTaskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  protected ScheduledTaskSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public ScheduledTaskSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(ScheduledTaskSpec paramScheduledTaskSpec) {
    this.spec = paramScheduledTaskSpec;
  }
}
