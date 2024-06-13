package com.vmware.vim25;

import com.vmware.vim25.ComputeResourceHostSPBMLicenseInfo;
import com.vmware.vim25.FailToEnableSPBM;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NotEnoughLicenses;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailToEnableSPBM", propOrder = {"cs", "csName", "hostLicenseStates"})
public class FailToEnableSPBM extends NotEnoughLicenses {
  @XmlElement(required = true)
  protected ManagedObjectReference cs;
  
  @XmlElement(required = true)
  protected String csName;
  
  @XmlElement(required = true)
  protected List<ComputeResourceHostSPBMLicenseInfo> hostLicenseStates;
  
  public ManagedObjectReference getCs() {
    return this.cs;
  }
  
  public void setCs(ManagedObjectReference paramManagedObjectReference) {
    this.cs = paramManagedObjectReference;
  }
  
  public String getCsName() {
    return this.csName;
  }
  
  public void setCsName(String paramString) {
    this.csName = paramString;
  }
  
  public List<ComputeResourceHostSPBMLicenseInfo> getHostLicenseStates() {
    if (this.hostLicenseStates == null)
      this.hostLicenseStates = new ArrayList<>(); 
    return this.hostLicenseStates;
  }
}
