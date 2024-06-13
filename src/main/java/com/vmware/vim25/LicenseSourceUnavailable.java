package com.vmware.vim25;

import com.vmware.vim25.LicenseSource;
import com.vmware.vim25.LicenseSourceUnavailable;
import com.vmware.vim25.NotEnoughLicenses;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseSourceUnavailable", propOrder = {"licenseSource"})
public class LicenseSourceUnavailable extends NotEnoughLicenses {
  @XmlElement(required = true)
  protected LicenseSource licenseSource;
  
  public LicenseSource getLicenseSource() {
    return this.licenseSource;
  }
  
  public void setLicenseSource(LicenseSource paramLicenseSource) {
    this.licenseSource = paramLicenseSource;
  }
}
