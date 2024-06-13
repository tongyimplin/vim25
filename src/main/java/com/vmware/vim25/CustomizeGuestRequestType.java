package com.vmware.vim25;

import com.vmware.vim25.CustomizationSpec;
import com.vmware.vim25.CustomizeGuestRequestType;
import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OptionValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizeGuestRequestType", propOrder = {"_this", "vm", "auth", "spec", "configParams"})
public class CustomizeGuestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected GuestAuthentication auth;
  
  @XmlElement(required = true)
  protected CustomizationSpec spec;
  
  protected List<OptionValue> configParams;
  
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
  
  public CustomizationSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(CustomizationSpec paramCustomizationSpec) {
    this.spec = paramCustomizationSpec;
  }
  
  public List<OptionValue> getConfigParams() {
    if (this.configParams == null)
      this.configParams = new ArrayList<>(); 
    return this.configParams;
  }
}
