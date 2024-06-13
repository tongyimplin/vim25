package com.vmware.vim25;

import com.vmware.vim25.ContinueRetrievePropertiesExRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContinueRetrievePropertiesExRequestType", propOrder = {"_this", "token"})
public class ContinueRetrievePropertiesExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String token;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getToken() {
    return this.token;
  }
  
  public void setToken(String paramString) {
    this.token = paramString;
  }
}
