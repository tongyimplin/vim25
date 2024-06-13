package com.vmware.vim25;

import com.vmware.vim25.LicenseServerUnavailable;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseServerUnavailable", propOrder = {"licenseServer"})
public class LicenseServerUnavailable extends VimFault {
  @XmlElement(required = true)
  protected String licenseServer;
  
  public String getLicenseServer() {
    return this.licenseServer;
  }
  
  public void setLicenseServer(String paramString) {
    this.licenseServer = paramString;
  }
}
