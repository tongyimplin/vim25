package com.vmware.vim25;

import com.vmware.vim25.ConfigureLicenseSourceRequestType;
import com.vmware.vim25.LicenseSource;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigureLicenseSourceRequestType", propOrder = {"_this", "host", "licenseSource"})
public class ConfigureLicenseSourceRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected LicenseSource licenseSource;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public LicenseSource getLicenseSource() {
    return this.licenseSource;
  }
  
  public void setLicenseSource(LicenseSource paramLicenseSource) {
    this.licenseSource = paramLicenseSource;
  }
}
