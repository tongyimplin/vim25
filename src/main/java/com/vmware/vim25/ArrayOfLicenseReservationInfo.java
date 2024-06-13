package com.vmware.vim25;

import com.vmware.vim25.ArrayOfLicenseReservationInfo;
import com.vmware.vim25.LicenseReservationInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseReservationInfo", propOrder = {"licenseReservationInfo"})
public class ArrayOfLicenseReservationInfo {
  @XmlElement(name = "LicenseReservationInfo")
  protected List<LicenseReservationInfo> licenseReservationInfo;
  
  public List<LicenseReservationInfo> getLicenseReservationInfo() {
    if (this.licenseReservationInfo == null)
      this.licenseReservationInfo = new ArrayList<>(); 
    return this.licenseReservationInfo;
  }
}
