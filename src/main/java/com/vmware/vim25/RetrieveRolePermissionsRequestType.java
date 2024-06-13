package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RetrieveRolePermissionsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveRolePermissionsRequestType", propOrder = {"_this", "roleId"})
public class RetrieveRolePermissionsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int roleId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public int getRoleId() {
    return this.roleId;
  }
  
  public void setRoleId(int paramInt) {
    this.roleId = paramInt;
  }
}
