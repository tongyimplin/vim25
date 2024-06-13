package com.vmware.vim25;

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.MakeDirectoryInGuestRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MakeDirectoryInGuestRequestType", propOrder = {"_this", "vm", "auth", "directoryPath", "createParentDirectories"})
public class MakeDirectoryInGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected String directoryPath;
  
  protected boolean createParentDirectories;
  
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
  
  public String getDirectoryPath() {
    return this.directoryPath;
  }
  
  public void setDirectoryPath(String paramString) {
    this.directoryPath = paramString;
  }
  
  public boolean isCreateParentDirectories() {
    return this.createParentDirectories;
  }
  
  public void setCreateParentDirectories(boolean paramBoolean) {
    this.createParentDirectories = paramBoolean;
  }
}
