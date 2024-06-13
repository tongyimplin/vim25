package com.vmware.vim25;

import com.vmware.vim25.ComplianceLocator;
import com.vmware.vim25.ComplianceProfile;
import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.HostProfileConfigInfo;
import com.vmware.vim25.ProfileConfigInfo;
import com.vmware.vim25.ProfileDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileConfigInfo", propOrder = {"applyProfile", "defaultComplyProfile", "defaultComplyLocator", "customComplyProfile", "disabledExpressionList", "description"})
public class HostProfileConfigInfo extends ProfileConfigInfo {
  protected HostApplyProfile applyProfile;
  
  protected ComplianceProfile defaultComplyProfile;
  
  protected List<ComplianceLocator> defaultComplyLocator;
  
  protected ComplianceProfile customComplyProfile;
  
  protected List<String> disabledExpressionList;
  
  protected ProfileDescription description;
  
  public HostApplyProfile getApplyProfile() {
    return this.applyProfile;
  }
  
  public void setApplyProfile(HostApplyProfile paramHostApplyProfile) {
    this.applyProfile = paramHostApplyProfile;
  }
  
  public ComplianceProfile getDefaultComplyProfile() {
    return this.defaultComplyProfile;
  }
  
  public void setDefaultComplyProfile(ComplianceProfile paramComplianceProfile) {
    this.defaultComplyProfile = paramComplianceProfile;
  }
  
  public List<ComplianceLocator> getDefaultComplyLocator() {
    if (this.defaultComplyLocator == null)
      this.defaultComplyLocator = new ArrayList<>(); 
    return this.defaultComplyLocator;
  }
  
  public ComplianceProfile getCustomComplyProfile() {
    return this.customComplyProfile;
  }
  
  public void setCustomComplyProfile(ComplianceProfile paramComplianceProfile) {
    this.customComplyProfile = paramComplianceProfile;
  }
  
  public List<String> getDisabledExpressionList() {
    if (this.disabledExpressionList == null)
      this.disabledExpressionList = new ArrayList<>(); 
    return this.disabledExpressionList;
  }
  
  public ProfileDescription getDescription() {
    return this.description;
  }
  
  public void setDescription(ProfileDescription paramProfileDescription) {
    this.description = paramProfileDescription;
  }
}
