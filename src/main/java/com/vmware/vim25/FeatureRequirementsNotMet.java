package com.vmware.vim25;

import com.vmware.vim25.FeatureRequirementsNotMet;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import com.vmware.vim25.VirtualMachineFeatureRequirement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureRequirementsNotMet", propOrder = {"featureRequirement", "vm", "host"})
public class FeatureRequirementsNotMet extends VirtualHardwareCompatibilityIssue {
  protected List<VirtualMachineFeatureRequirement> featureRequirement;
  
  protected ManagedObjectReference vm;
  
  protected ManagedObjectReference host;
  
  public List<VirtualMachineFeatureRequirement> getFeatureRequirement() {
    if (this.featureRequirement == null)
      this.featureRequirement = new ArrayList<>(); 
    return this.featureRequirement;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
}
