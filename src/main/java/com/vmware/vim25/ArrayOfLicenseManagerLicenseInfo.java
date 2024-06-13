package com.vmware.vim25;

import com.vmware.vim25.ArrayOfLicenseManagerLicenseInfo;
import com.vmware.vim25.LicenseManagerLicenseInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseManagerLicenseInfo", propOrder = {"licenseManagerLicenseInfo"})
public class ArrayOfLicenseManagerLicenseInfo {
  @XmlElement(name = "LicenseManagerLicenseInfo")
  protected List<LicenseManagerLicenseInfo> licenseManagerLicenseInfo;
  
  public List<LicenseManagerLicenseInfo> getLicenseManagerLicenseInfo() {
    if (this.licenseManagerLicenseInfo == null)
      this.licenseManagerLicenseInfo = new ArrayList<>(); 
    return this.licenseManagerLicenseInfo;
  }
}
