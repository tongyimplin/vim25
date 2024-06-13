package com.vmware.vim25;

import com.vmware.vim25.CreateTemporaryDirectoryInGuestRequestType;
import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTemporaryDirectoryInGuestRequestType", propOrder = {"_this", "vm", "auth", "prefix", "suffix", "directoryPath"})
public class CreateTemporaryDirectoryInGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected String prefix;
  
  @XmlElement(required = true)
  protected String suffix;
  
  protected String directoryPath;
  
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
  
  public String getPrefix() {
    return this.prefix;
  }
  
  public void setPrefix(String paramString) {
    this.prefix = paramString;
  }
  
  public String getSuffix() {
    return this.suffix;
  }
  
  public void setSuffix(String paramString) {
    this.suffix = paramString;
  }
  
  public String getDirectoryPath() {
    return this.directoryPath;
  }
  
  public void setDirectoryPath(String paramString) {
    this.directoryPath = paramString;
  }
}
