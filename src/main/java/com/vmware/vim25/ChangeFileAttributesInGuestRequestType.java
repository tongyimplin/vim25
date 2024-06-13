package com.vmware.vim25;

import com.vmware.vim25.ChangeFileAttributesInGuestRequestType;
import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.GuestFileAttributes;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeFileAttributesInGuestRequestType", propOrder = {"_this", "vm", "auth", "guestFilePath", "fileAttributes"})
public class ChangeFileAttributesInGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected String guestFilePath;
  
  @XmlElement(required = true)
  protected GuestFileAttributes fileAttributes;
  
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
  
  public String getGuestFilePath() {
    return this.guestFilePath;
  }
  
  public void setGuestFilePath(String paramString) {
    this.guestFilePath = paramString;
  }
  
  public GuestFileAttributes getFileAttributes() {
    return this.fileAttributes;
  }
  
  public void setFileAttributes(GuestFileAttributes paramGuestFileAttributes) {
    this.fileAttributes = paramGuestFileAttributes;
  }
}
