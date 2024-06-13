package com.vmware.vim25;

import com.vmware.vim25.HasMonitoredEntityRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HasMonitoredEntityRequestType", propOrder = {"_this", "providerId", "entity"})
public class HasMonitoredEntityRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String providerId;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getProviderId() {
    return this.providerId;
  }
  
  public void setProviderId(String paramString) {
    this.providerId = paramString;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
}
