package com.vmware.vim25;

import com.vmware.vim25.ChangePasswordRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordRequestType", propOrder = {"_this", "user", "oldPassword", "newPassword"})
public class ChangePasswordRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String user;
  
  @XmlElement(required = true)
  protected String oldPassword;
  
  @XmlElement(required = true)
  protected String newPassword;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getUser() {
    return this.user;
  }
  
  public void setUser(String paramString) {
    this.user = paramString;
  }
  
  public String getOldPassword() {
    return this.oldPassword;
  }
  
  public void setOldPassword(String paramString) {
    this.oldPassword = paramString;
  }
  
  public String getNewPassword() {
    return this.newPassword;
  }
  
  public void setNewPassword(String paramString) {
    this.newPassword = paramString;
  }
}
