package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceHostConfigurationValidation;
import com.vmware.vim25.ClusterComputeResourceValidationResultBase;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceHostConfigurationValidation", propOrder = {"host", "isDvsSettingValid", "isVmknicSettingValid", "isNtpSettingValid", "isLockdownModeValid"})
public class ClusterComputeResourceHostConfigurationValidation extends ClusterComputeResourceValidationResultBase {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected Boolean isDvsSettingValid;
  
  protected Boolean isVmknicSettingValid;
  
  protected Boolean isNtpSettingValid;
  
  protected Boolean isLockdownModeValid;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public Boolean isIsDvsSettingValid() {
    return this.isDvsSettingValid;
  }
  
  public void setIsDvsSettingValid(Boolean paramBoolean) {
    this.isDvsSettingValid = paramBoolean;
  }
  
  public Boolean isIsVmknicSettingValid() {
    return this.isVmknicSettingValid;
  }
  
  public void setIsVmknicSettingValid(Boolean paramBoolean) {
    this.isVmknicSettingValid = paramBoolean;
  }
  
  public Boolean isIsNtpSettingValid() {
    return this.isNtpSettingValid;
  }
  
  public void setIsNtpSettingValid(Boolean paramBoolean) {
    this.isNtpSettingValid = paramBoolean;
  }
  
  public Boolean isIsLockdownModeValid() {
    return this.isLockdownModeValid;
  }
  
  public void setIsLockdownModeValid(Boolean paramBoolean) {
    this.isLockdownModeValid = paramBoolean;
  }
}
