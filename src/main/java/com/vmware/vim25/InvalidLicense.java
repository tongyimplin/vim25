package com.vmware.vim25;

import com.vmware.vim25.InvalidLicense;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidLicense", propOrder = {"licenseContent"})
public class InvalidLicense extends VimFault {
  @XmlElement(required = true)
  protected String licenseContent;
  
  public String getLicenseContent() {
    return this.licenseContent;
  }
  
  public void setLicenseContent(String paramString) {
    this.licenseContent = paramString;
  }
}
