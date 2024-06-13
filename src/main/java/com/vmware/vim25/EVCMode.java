package com.vmware.vim25;

import com.vmware.vim25.EVCMode;
import com.vmware.vim25.ElementDescription;
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
@XmlType(name = "EVCMode", propOrder = {"guaranteedCPUFeatures", "featureCapability", "featureMask", "featureRequirement", "vendor", "track", "vendorTier"})
public class EVCMode extends ElementDescription {
  protected List<HostCpuIdInfo> guaranteedCPUFeatures;
  
  protected List<HostFeatureCapability> featureCapability;
  
  protected List<HostFeatureMask> featureMask;
  
  protected List<VirtualMachineFeatureRequirement> featureRequirement;
  
  @XmlElement(required = true)
  protected String vendor;
  
  protected List<String> track;
  
  protected int vendorTier;
  
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
  
  public String getVendor() {
    return this.vendor;
  }
  
  public void setVendor(String paramString) {
    this.vendor = paramString;
  }
  
  public List<String> getTrack() {
    if (this.track == null)
      this.track = new ArrayList<>(); 
    return this.track;
  }
  
  public int getVendorTier() {
    return this.vendorTier;
  }
  
  public void setVendorTier(int paramInt) {
    this.vendorTier = paramInt;
  }
}
