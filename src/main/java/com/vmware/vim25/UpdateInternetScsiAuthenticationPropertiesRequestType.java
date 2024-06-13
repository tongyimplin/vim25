package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties;
import com.vmware.vim25.HostInternetScsiHbaTargetSet;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateInternetScsiAuthenticationPropertiesRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInternetScsiAuthenticationPropertiesRequestType", propOrder = {"_this", "iScsiHbaDevice", "authenticationProperties", "targetSet"})
public class UpdateInternetScsiAuthenticationPropertiesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String iScsiHbaDevice;
  
  @XmlElement(required = true)
  protected HostInternetScsiHbaAuthenticationProperties authenticationProperties;
  
  protected HostInternetScsiHbaTargetSet targetSet;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getIScsiHbaDevice() {
    return this.iScsiHbaDevice;
  }
  
  public void setIScsiHbaDevice(String paramString) {
    this.iScsiHbaDevice = paramString;
  }
  
  public HostInternetScsiHbaAuthenticationProperties getAuthenticationProperties() {
    return this.authenticationProperties;
  }
  
  public void setAuthenticationProperties(HostInternetScsiHbaAuthenticationProperties paramHostInternetScsiHbaAuthenticationProperties) {
    this.authenticationProperties = paramHostInternetScsiHbaAuthenticationProperties;
  }
  
  public HostInternetScsiHbaTargetSet getTargetSet() {
    return this.targetSet;
  }
  
  public void setTargetSet(HostInternetScsiHbaTargetSet paramHostInternetScsiHbaTargetSet) {
    this.targetSet = paramHostInternetScsiHbaTargetSet;
  }
}
