package com.vmware.vim25;

import com.vmware.vim25.LicenseExpired;
import com.vmware.vim25.NotEnoughLicenses;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseExpired", propOrder = {"licenseKey"})
public class LicenseExpired extends NotEnoughLicenses {
  @XmlElement(required = true)
  protected String licenseKey;
  
  public String getLicenseKey() {
    return this.licenseKey;
  }
  
  public void setLicenseKey(String paramString) {
    this.licenseKey = paramString;
  }
}
