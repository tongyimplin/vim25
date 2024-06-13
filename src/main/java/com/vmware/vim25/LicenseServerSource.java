package com.vmware.vim25;

import com.vmware.vim25.LicenseServerSource;
import com.vmware.vim25.LicenseSource;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseServerSource", propOrder = {"licenseServer"})
public class LicenseServerSource extends LicenseSource {
  @XmlElement(required = true)
  protected String licenseServer;
  
  public String getLicenseServer() {
    return this.licenseServer;
  }
  
  public void setLicenseServer(String paramString) {
    this.licenseServer = paramString;
  }
}
