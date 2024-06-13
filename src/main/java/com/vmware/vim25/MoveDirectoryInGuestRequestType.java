package com.vmware.vim25;

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MoveDirectoryInGuestRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveDirectoryInGuestRequestType", propOrder = {"_this", "vm", "auth", "srcDirectoryPath", "dstDirectoryPath"})
public class MoveDirectoryInGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected String srcDirectoryPath;
  
  @XmlElement(required = true)
  protected String dstDirectoryPath;
  
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
  
  public String getSrcDirectoryPath() {
    return this.srcDirectoryPath;
  }
  
  public void setSrcDirectoryPath(String paramString) {
    this.srcDirectoryPath = paramString;
  }
  
  public String getDstDirectoryPath() {
    return this.dstDirectoryPath;
  }
  
  public void setDstDirectoryPath(String paramString) {
    this.dstDirectoryPath = paramString;
  }
}
