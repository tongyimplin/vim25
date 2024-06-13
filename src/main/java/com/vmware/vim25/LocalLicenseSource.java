package com.vmware.vim25;

import com.vmware.vim25.LicenseSource;
import com.vmware.vim25.LocalLicenseSource;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalLicenseSource", propOrder = {"licenseKeys"})
public class LocalLicenseSource extends LicenseSource {
  @XmlElement(required = true)
  protected String licenseKeys;
  
  public String getLicenseKeys() {
    return this.licenseKeys;
  }
  
  public void setLicenseKeys(String paramString) {
    this.licenseKeys = paramString;
  }
}
