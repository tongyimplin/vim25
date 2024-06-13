package com.vmware.vim25;

import com.vmware.vim25.DeleteRegistryValueInGuestRequestType;
import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.GuestRegValueNameSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteRegistryValueInGuestRequestType", propOrder = {"_this", "vm", "auth", "valueName"})
public class DeleteRegistryValueInGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected GuestRegValueNameSpec valueName;
  
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
  
  public GuestRegValueNameSpec getValueName() {
    return this.valueName;
  }
  
  public void setValueName(GuestRegValueNameSpec paramGuestRegValueNameSpec) {
    this.valueName = paramGuestRegValueNameSpec;
  }
}
