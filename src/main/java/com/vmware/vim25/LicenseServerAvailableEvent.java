package com.vmware.vim25;

import com.vmware.vim25.LicenseEvent;
import com.vmware.vim25.LicenseServerAvailableEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseServerAvailableEvent", propOrder = {"licenseServer"})
public class LicenseServerAvailableEvent extends LicenseEvent {
  @XmlElement(required = true)
  protected String licenseServer;
  
  public String getLicenseServer() {
    return this.licenseServer;
  }
  
  public void setLicenseServer(String paramString) {
    this.licenseServer = paramString;
  }
}
