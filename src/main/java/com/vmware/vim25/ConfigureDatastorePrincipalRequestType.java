package com.vmware.vim25;

import com.vmware.vim25.ConfigureDatastorePrincipalRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigureDatastorePrincipalRequestType", propOrder = {"_this", "userName", "password"})
public class ConfigureDatastorePrincipalRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String userName;
  
  protected String password;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String paramString) {
    this.password = paramString;
  }
}
