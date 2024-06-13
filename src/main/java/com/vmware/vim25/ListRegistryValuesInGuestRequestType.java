package com.vmware.vim25;

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.GuestRegKeyNameSpec;
import com.vmware.vim25.ListRegistryValuesInGuestRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListRegistryValuesInGuestRequestType", propOrder = {"_this", "vm", "auth", "keyName", "expandStrings", "matchPattern"})
public class ListRegistryValuesInGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected GuestRegKeyNameSpec keyName;
  
  protected boolean expandStrings;
  
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
  
  public boolean isExpandStrings() {
    return this.expandStrings;
  }
  
  public void setExpandStrings(boolean paramBoolean) {
    this.expandStrings = paramBoolean;
  }
  
  public String getMatchPattern() {
    return this.matchPattern;
  }
  
  public void setMatchPattern(String paramString) {
    this.matchPattern = paramString;
  }
}
