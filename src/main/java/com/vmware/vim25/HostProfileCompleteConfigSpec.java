package com.vmware.vim25;

import com.vmware.vim25.ComplianceProfile;
import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.HostProfileCompleteConfigSpec;
import com.vmware.vim25.HostProfileConfigInfo;
import com.vmware.vim25.HostProfileConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileCompleteConfigSpec", propOrder = {"applyProfile", "customComplyProfile", "disabledExpressionListChanged", "disabledExpressionList", "validatorHost", "validating", "hostConfig"})
public class HostProfileCompleteConfigSpec extends HostProfileConfigSpec {
  protected HostApplyProfile applyProfile;
  
  protected ComplianceProfile customComplyProfile;
  
  protected boolean disabledExpressionListChanged;
  
  protected List<String> disabledExpressionList;
  
  protected ManagedObjectReference validatorHost;
  
  protected Boolean validating;
  
  protected HostProfileConfigInfo hostConfig;
  
  public HostApplyProfile getApplyProfile() {
    return this.applyProfile;
  }
  
  public void setApplyProfile(HostApplyProfile paramHostApplyProfile) {
    this.applyProfile = paramHostApplyProfile;
  }
  
  public ComplianceProfile getCustomComplyProfile() {
    return this.customComplyProfile;
  }
  
  public void setCustomComplyProfile(ComplianceProfile paramComplianceProfile) {
    this.customComplyProfile = paramComplianceProfile;
  }
  
  public boolean isDisabledExpressionListChanged() {
    return this.disabledExpressionListChanged;
  }
  
  public void setDisabledExpressionListChanged(boolean paramBoolean) {
    this.disabledExpressionListChanged = paramBoolean;
  }
  
  public List<String> getDisabledExpressionList() {
    if (this.disabledExpressionList == null)
      this.disabledExpressionList = new ArrayList<>(); 
    return this.disabledExpressionList;
  }
  
  public ManagedObjectReference getValidatorHost() {
    return this.validatorHost;
  }
  
  public void setValidatorHost(ManagedObjectReference paramManagedObjectReference) {
    this.validatorHost = paramManagedObjectReference;
  }
  
  public Boolean isValidating() {
    return this.validating;
  }
  
  public void setValidating(Boolean paramBoolean) {
    this.validating = paramBoolean;
  }
  
  public HostProfileConfigInfo getHostConfig() {
    return this.hostConfig;
  }
  
  public void setHostConfig(HostProfileConfigInfo paramHostProfileConfigInfo) {
    this.hostConfig = paramHostProfileConfigInfo;
  }
}
