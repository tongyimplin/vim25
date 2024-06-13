package com.vmware.vim25;

import com.vmware.vim25.LicenseAvailabilityInfo;
import com.vmware.vim25.QueryLicenseSourceAvailabilityResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryLicenseSourceAvailabilityResponse")
public class QueryLicenseSourceAvailabilityResponse {
  protected List<LicenseAvailabilityInfo> returnval;
  
  public List<LicenseAvailabilityInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
