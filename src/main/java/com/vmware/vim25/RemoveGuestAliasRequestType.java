package com.vmware.vim25;

import com.vmware.vim25.GuestAuthSubject;
import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveGuestAliasRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveGuestAliasRequestType", propOrder = {"_this", "vm", "auth", "username", "base64Cert", "subject"})
public class RemoveGuestAliasRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected String username;
  
  @XmlElement(required = true)
  protected String base64Cert;
  
  @XmlElement(required = true)
  protected GuestAuthSubject subject;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public GuestAuthentication getAuth() {
    return this.auth;
  }
  
  public void setAuth(GuestAuthentication paramGuestAuthentication) {
    this.auth = paramGuestAuthentication;
  }
  
  public String getUsername() {
    return this.username;
  }
  
  public void setUsername(String paramString) {
    this.username = paramString;
  }
  
  public String getBase64Cert() {
    return this.base64Cert;
  }
  
  public void setBase64Cert(String paramString) {
    this.base64Cert = paramString;
  }
  
  public GuestAuthSubject getSubject() {
    return this.subject;
  }
  
  public void setSubject(GuestAuthSubject paramGuestAuthSubject) {
    this.subject = paramGuestAuthSubject;
  }
}
