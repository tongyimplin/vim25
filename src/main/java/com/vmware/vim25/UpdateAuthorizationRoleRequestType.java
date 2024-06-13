package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateAuthorizationRoleRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAuthorizationRoleRequestType", propOrder = {"_this", "roleId", "newName", "privIds"})
public class UpdateAuthorizationRoleRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int roleId;
  
  @XmlElement(required = true)
  protected String newName;
  
  protected List<String> privIds;
  
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
  
  public String getNewName() {
    return this.newName;
  }
  
  public void setNewName(String paramString) {
    this.newName = paramString;
  }
  
  public List<String> getPrivIds() {
    if (this.privIds == null)
      this.privIds = new ArrayList<>(); 
    return this.privIds;
  }
}
