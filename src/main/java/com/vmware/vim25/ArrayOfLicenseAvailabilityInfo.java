package com.vmware.vim25;

import com.vmware.vim25.ArrayOfLicenseAvailabilityInfo;
import com.vmware.vim25.LicenseAvailabilityInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseAvailabilityInfo", propOrder = {"licenseAvailabilityInfo"})
public class ArrayOfLicenseAvailabilityInfo {
  @XmlElement(name = "LicenseAvailabilityInfo")
  protected List<LicenseAvailabilityInfo> licenseAvailabilityInfo;
  
  public List<LicenseAvailabilityInfo> getLicenseAvailabilityInfo() {
    if (this.licenseAvailabilityInfo == null)
      this.licenseAvailabilityInfo = new ArrayList<>(); 
    return this.licenseAvailabilityInfo;
  }
}
