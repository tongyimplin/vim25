package com.vmware.vim25;

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.GuestRegKeyNameSpec;
import com.vmware.vim25.ListRegistryKeysInGuestRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListRegistryKeysInGuestRequestType", propOrder = {"_this", "vm", "auth", "keyName", "recursive", "matchPattern"})
public class ListRegistryKeysInGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected GuestRegKeyNameSpec keyName;
  
  protected boolean recursive;
  
  protected String matchPattern;
  
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
  
  public GuestRegKeyNameSpec getKeyName() {
    return this.keyName;
  }
  
  public void setKeyName(GuestRegKeyNameSpec paramGuestRegKeyNameSpec) {
    this.keyName = paramGuestRegKeyNameSpec;
  }
  
  public boolean isRecursive() {
    return this.recursive;
  }
  
  public void setRecursive(boolean paramBoolean) {
    this.recursive = paramBoolean;
  }
  
  public String getMatchPattern() {
    return this.matchPattern;
  }
  
  public void setMatchPattern(String paramString) {
    this.matchPattern = paramString;
  }
}
