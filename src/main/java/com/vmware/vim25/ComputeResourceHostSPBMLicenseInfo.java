package com.vmware.vim25;

import com.vmware.vim25.ComputeResourceHostSPBMLicenseInfo;
import com.vmware.vim25.ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceHostSPBMLicenseInfo", propOrder = {"host", "licenseState"})
public class ComputeResourceHostSPBMLicenseInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState licenseState;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState getLicenseState() {
    return this.licenseState;
  }
  
  public void setLicenseState(ComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState paramComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState) {
    this.licenseState = paramComputeResourceHostSPBMLicenseInfoHostSPBMLicenseState;
  }
}
