package com.vmware.vim25;

import com.vmware.vim25.LoginExtensionBySubjectNameRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginExtensionBySubjectNameRequestType", propOrder = {"_this", "extensionKey", "locale"})
public class LoginExtensionBySubjectNameRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String extensionKey;
  
  protected String locale;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getExtensionKey() {
    return this.extensionKey;
  }
  
  public void setExtensionKey(String paramString) {
    this.extensionKey = paramString;
  }
  
  public String getLocale() {
    return this.locale;
  }
  
  public void setLocale(String paramString) {
    this.locale = paramString;
  }
}
