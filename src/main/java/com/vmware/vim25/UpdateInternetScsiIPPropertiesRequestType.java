package com.vmware.vim25;

import com.vmware.vim25.HostInternetScsiHbaIPProperties;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateInternetScsiIPPropertiesRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInternetScsiIPPropertiesRequestType", propOrder = {"_this", "iScsiHbaDevice", "ipProperties"})
public class UpdateInternetScsiIPPropertiesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String iScsiHbaDevice;
  
  @XmlElement(required = true)
  protected HostInternetScsiHbaIPProperties ipProperties;
  
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
  
  public HostInternetScsiHbaIPProperties getIpProperties() {
    return this.ipProperties;
  }
  
  public void setIpProperties(HostInternetScsiHbaIPProperties paramHostInternetScsiHbaIPProperties) {
    this.ipProperties = paramHostInternetScsiHbaIPProperties;
  }
}
