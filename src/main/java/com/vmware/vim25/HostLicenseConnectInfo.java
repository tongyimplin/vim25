package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLicensableResourceInfo;
import com.vmware.vim25.HostLicenseConnectInfo;
import com.vmware.vim25.LicenseManagerEvaluationInfo;
import com.vmware.vim25.LicenseManagerLicenseInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLicenseConnectInfo", propOrder = {"license", "evaluation", "resource"})
public class HostLicenseConnectInfo extends DynamicData {
  @XmlElement(required = true)
  protected LicenseManagerLicenseInfo license;
  
  @XmlElement(required = true)
  protected LicenseManagerEvaluationInfo evaluation;
  
  protected HostLicensableResourceInfo resource;
  
  public LicenseManagerLicenseInfo getLicense() {
    return this.license;
  }
  
  public void setLicense(LicenseManagerLicenseInfo paramLicenseManagerLicenseInfo) {
    this.license = paramLicenseManagerLicenseInfo;
  }
  
  public LicenseManagerEvaluationInfo getEvaluation() {
    return this.evaluation;
  }
  
  public void setEvaluation(LicenseManagerEvaluationInfo paramLicenseManagerEvaluationInfo) {
    this.evaluation = paramLicenseManagerEvaluationInfo;
  }
  
  public HostLicensableResourceInfo getResource() {
    return this.resource;
  }
  
  public void setResource(HostLicensableResourceInfo paramHostLicensableResourceInfo) {
    this.resource = paramHostLicensableResourceInfo;
  }
}
