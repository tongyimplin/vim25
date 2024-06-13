package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.Permission;
import com.vmware.vim25.ResetEntityPermissionsRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetEntityPermissionsRequestType", propOrder = {"_this", "entity", "permission"})
public class ResetEntityPermissionsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  protected List<Permission> permission;
  
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
  
  public List<Permission> getPermission() {
    if (this.permission == null)
      this.permission = new ArrayList<>(); 
    return this.permission;
  }
}
