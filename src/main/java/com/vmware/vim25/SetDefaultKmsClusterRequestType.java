package com.vmware.vim25;

import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SetDefaultKmsClusterRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetDefaultKmsClusterRequestType", propOrder = {"_this", "entity", "clusterId"})
public class SetDefaultKmsClusterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference entity;
  
  protected KeyProviderId clusterId;
  
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
  
  public KeyProviderId getClusterId() {
    return this.clusterId;
  }
  
  public void setClusterId(KeyProviderId paramKeyProviderId) {
    this.clusterId = paramKeyProviderId;
  }
}
