package com.vmware.vim25;

import com.vmware.vim25.LicenseUsageInfo;
import com.vmware.vim25.QueryLicenseUsageResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryLicenseUsageResponse")
public class QueryLicenseUsageResponse {
  @XmlElement(required = true)
  protected LicenseUsageInfo returnval;
  
  public LicenseUsageInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(LicenseUsageInfo paramLicenseUsageInfo) {
    this.returnval = paramLicenseUsageInfo;
  }
}
