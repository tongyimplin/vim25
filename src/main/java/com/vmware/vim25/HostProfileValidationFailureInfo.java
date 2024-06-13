package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostApplyProfile;
import com.vmware.vim25.HostProfileValidationFailureInfo;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ProfileUpdateFailedUpdateFailure;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileValidationFailureInfo", propOrder = {"name", "annotation", "updateType", "host", "applyProfile", "failures", "faults"})
public class HostProfileValidationFailureInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String annotation;
  
  @XmlElement(required = true)
  protected String updateType;
  
  protected ManagedObjectReference host;
  
  protected HostApplyProfile applyProfile;
  
  protected List<ProfileUpdateFailedUpdateFailure> failures;
  
  protected List<LocalizedMethodFault> faults;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getAnnotation() {
    return this.annotation;
  }
  
  public void setAnnotation(String paramString) {
    this.annotation = paramString;
  }
  
  public String getUpdateType() {
    return this.updateType;
  }
  
  public void setUpdateType(String paramString) {
    this.updateType = paramString;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public HostApplyProfile getApplyProfile() {
    return this.applyProfile;
  }
  
  public void setApplyProfile(HostApplyProfile paramHostApplyProfile) {
    this.applyProfile = paramHostApplyProfile;
  }
  
  public List<ProfileUpdateFailedUpdateFailure> getFailures() {
    if (this.failures == null)
      this.failures = new ArrayList<>(); 
    return this.failures;
  }
  
  public List<LocalizedMethodFault> getFaults() {
    if (this.faults == null)
      this.faults = new ArrayList<>(); 
    return this.faults;
  }
}
