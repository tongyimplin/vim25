package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveAuthorizationRoleRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveAuthorizationRoleRequestType", propOrder = {"_this", "roleId", "failIfUsed"})
public class RemoveAuthorizationRoleRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int roleId;
  
  protected boolean failIfUsed;
  
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
  
  public boolean isFailIfUsed() {
    return this.failIfUsed;
  }
  
  public void setFailIfUsed(boolean paramBoolean) {
    this.failIfUsed = paramBoolean;
  }
}
