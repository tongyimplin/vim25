package com.vmware.vim25;

import com.vmware.vim25.ClusterEVCManagerEVCState;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.EVCMode;
import com.vmware.vim25.HostCpuIdInfo;
import com.vmware.vim25.HostFeatureCapability;
import com.vmware.vim25.HostFeatureMask;
import com.vmware.vim25.VirtualMachineFeatureRequirement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterEVCManagerEVCState", propOrder = {"supportedEVCMode", "currentEVCModeKey", "guaranteedCPUFeatures", "featureCapability", "featureMask", "featureRequirement"})
public class ClusterEVCManagerEVCState extends DynamicData {
  @XmlElement(required = true)
  protected List<EVCMode> supportedEVCMode;
  
  protected String currentEVCModeKey;
  
  protected List<HostCpuIdInfo> guaranteedCPUFeatures;
  
  protected List<HostFeatureCapability> featureCapability;
  
  protected List<HostFeatureMask> featureMask;
  
  protected List<VirtualMachineFeatureRequirement> featureRequirement;
  
  public List<EVCMode> getSupportedEVCMode() {
    if (this.supportedEVCMode == null)
      this.supportedEVCMode = new ArrayList<>(); 
    return this.supportedEVCMode;
  }
  
  public String getCurrentEVCModeKey() {
    return this.currentEVCModeKey;
  }
  
  public void setCurrentEVCModeKey(String paramString) {
    this.currentEVCModeKey = paramString;
  }
  
  public List<HostCpuIdInfo> getGuaranteedCPUFeatures() {
    if (this.guaranteedCPUFeatures == null)
      this.guaranteedCPUFeatures = new ArrayList<>(); 
    return this.guaranteedCPUFeatures;
  }
  
  public List<HostFeatureCapability> getFeatureCapability() {
    if (this.featureCapability == null)
      this.featureCapability = new ArrayList<>(); 
    return this.featureCapability;
  }
  
  public List<HostFeatureMask> getFeatureMask() {
    if (this.featureMask == null)
      this.featureMask = new ArrayList<>(); 
    return this.featureMask;
  }
  
  public List<VirtualMachineFeatureRequirement> getFeatureRequirement() {
    if (this.featureRequirement == null)
      this.featureRequirement = new ArrayList<>(); 
    return this.featureRequirement;
  }
}
