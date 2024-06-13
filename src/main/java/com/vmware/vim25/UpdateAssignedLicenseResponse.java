package com.vmware.vim25;

import com.vmware.vim25.LicenseManagerLicenseInfo;
import com.vmware.vim25.UpdateAssignedLicenseResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "UpdateAssignedLicenseResponse")
public class UpdateAssignedLicenseResponse {
  @XmlElement(required = true)
  protected LicenseManagerLicenseInfo returnval;
  
  public LicenseManagerLicenseInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(LicenseManagerLicenseInfo paramLicenseManagerLicenseInfo) {
    this.returnval = paramLicenseManagerLicenseInfo;
  }
}
