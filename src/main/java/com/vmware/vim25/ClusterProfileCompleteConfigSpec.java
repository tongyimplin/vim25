package com.vmware.vim25;

import com.vmware.vim25.ClusterProfileCompleteConfigSpec;
import com.vmware.vim25.ClusterProfileConfigSpec;
import com.vmware.vim25.ComplianceProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterProfileCompleteConfigSpec", propOrder = {"complyProfile"})
public class ClusterProfileCompleteConfigSpec extends ClusterProfileConfigSpec {
  protected ComplianceProfile complyProfile;
  
  public ComplianceProfile getComplyProfile() {
    return this.complyProfile;
  }
  
  public void setComplyProfile(ComplianceProfile paramComplianceProfile) {
    this.complyProfile = paramComplianceProfile;
  }
}
