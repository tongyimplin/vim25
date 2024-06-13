package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaDiscoveryProperties;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateInternetScsiDiscoveryPropertiesRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInternetScsiDiscoveryPropertiesRequestType", propOrder = {"_this", "iScsiHbaDevice", "discoveryProperties"})
public class UpdateInternetScsiDiscoveryPropertiesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String iScsiHbaDevice;
  
  @XmlElement(required = true)
  protected HostInternetScsiHbaDiscoveryProperties discoveryProperties;
  
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
  
  public HostInternetScsiHbaDiscoveryProperties getDiscoveryProperties() {
    return this.discoveryProperties;
  }
  
  public void setDiscoveryProperties(HostInternetScsiHbaDiscoveryProperties paramHostInternetScsiHbaDiscoveryProperties) {
    this.discoveryProperties = paramHostInternetScsiHbaDiscoveryProperties;
  }
}
