package com.vmware.vim25;

import com.vmware.vim25.LoginRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginRequestType", propOrder = {"_this", "userName", "password", "locale"})
public class LoginRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String userName;
  
  @XmlElement(required = true)
  protected String password;
  
  protected String locale;
  
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
  
  public String getLocale() {
    return this.locale;
  }
  
  public void setLocale(String paramString) {
    this.locale = paramString;
  }
}
