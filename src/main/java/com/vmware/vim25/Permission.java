package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.Permission;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Permission", propOrder = {"entity", "principal", "group", "roleId", "propagate"})
public class Permission extends DynamicData {
  protected ManagedObjectReference entity;
  
  @XmlElement(required = true)
  protected String principal;
  
  protected boolean group;
  
  protected int roleId;
  
  protected boolean propagate;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public String getPrincipal() {
    return this.principal;
  }
  
  public void setPrincipal(String paramString) {
    this.principal = paramString;
  }
  
  public boolean isGroup() {
    return this.group;
  }
  
  public void setGroup(boolean paramBoolean) {
    this.group = paramBoolean;
  }
  
  public int getRoleId() {
    return this.roleId;
  }
  
  public void setRoleId(int paramInt) {
    this.roleId = paramInt;
  }
  
  public boolean isPropagate() {
    return this.propagate;
  }
  
  public void setPropagate(boolean paramBoolean) {
    this.propagate = paramBoolean;
  }
}
