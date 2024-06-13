package com.vmware.vim25;

import com.vmware.vim25.GetDefaultKmsClusterRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDefaultKmsClusterRequestType", propOrder = {"_this", "entity", "defaultsToParent"})
public class GetDefaultKmsClusterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference entity;
  
  protected Boolean defaultsToParent;
  
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
  
  public Boolean isDefaultsToParent() {
    return this.defaultsToParent;
  }
  
  public void setDefaultsToParent(Boolean paramBoolean) {
    this.defaultsToParent = paramBoolean;
  }
}
