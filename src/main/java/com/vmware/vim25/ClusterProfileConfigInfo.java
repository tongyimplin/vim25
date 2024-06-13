package com.vmware.vim25;

import com.vmware.vim25.ClusterProfileConfigInfo;
import com.vmware.vim25.ComplianceProfile;
import com.vmware.vim25.ProfileConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterProfileConfigInfo", propOrder = {"complyProfile"})
public class ClusterProfileConfigInfo extends ProfileConfigInfo {
  protected ComplianceProfile complyProfile;
  
  public ComplianceProfile getComplyProfile() {
    return this.complyProfile;
  }
  
  public void setComplyProfile(ComplianceProfile paramComplianceProfile) {
    this.complyProfile = paramComplianceProfile;
  }
}
