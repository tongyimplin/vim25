package com.vmware.vim25;

import com.vmware.vim25.AcquireCredentialsInGuestRequestType;
import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquireCredentialsInGuestRequestType", propOrder = {"_this", "vm", "requestedAuth", "sessionID"})
public class AcquireCredentialsInGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication requestedAuth;
  
  protected Long sessionID;
  
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
  
  public GuestAuthentication getRequestedAuth() {
    return this.requestedAuth;
  }
  
  public void setRequestedAuth(GuestAuthentication paramGuestAuthentication) {
    this.requestedAuth = paramGuestAuthentication;
  }
  
  public Long getSessionID() {
    return this.sessionID;
  }
  
  public void setSessionID(Long paramLong) {
    this.sessionID = paramLong;
  }
}
