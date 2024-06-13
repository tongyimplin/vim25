package com.vmware.vim25;

import com.vmware.vim25.CustomFieldValue;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedEntityStatus;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineConfigSummary;
import com.vmware.vim25.VirtualMachineGuestSummary;
import com.vmware.vim25.VirtualMachineQuickStats;
import com.vmware.vim25.VirtualMachineRuntimeInfo;
import com.vmware.vim25.VirtualMachineStorageSummary;
import com.vmware.vim25.VirtualMachineSummary;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSummary", propOrder = {"vm", "runtime", "guest", "config", "storage", "quickStats", "overallStatus", "customValue"})
public class VirtualMachineSummary extends DynamicData {
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected VirtualMachineRuntimeInfo runtime;
  
  protected VirtualMachineGuestSummary guest;
  
  @XmlElement(required = true)
  protected VirtualMachineConfigSummary config;
  
  protected VirtualMachineStorageSummary storage;
  
  @XmlElement(required = true)
  protected VirtualMachineQuickStats quickStats;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus overallStatus;
  
  protected List<CustomFieldValue> customValue;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public VirtualMachineRuntimeInfo getRuntime() {
    return this.runtime;
  }
  
  public void setRuntime(VirtualMachineRuntimeInfo paramVirtualMachineRuntimeInfo) {
    this.runtime = paramVirtualMachineRuntimeInfo;
  }
  
  public VirtualMachineGuestSummary getGuest() {
    return this.guest;
  }
  
  public void setGuest(VirtualMachineGuestSummary paramVirtualMachineGuestSummary) {
    this.guest = paramVirtualMachineGuestSummary;
  }
  
  public VirtualMachineConfigSummary getConfig() {
    return this.config;
  }
  
  public void setConfig(VirtualMachineConfigSummary paramVirtualMachineConfigSummary) {
    this.config = paramVirtualMachineConfigSummary;
  }
  
  public VirtualMachineStorageSummary getStorage() {
    return this.storage;
  }
  
  public void setStorage(VirtualMachineStorageSummary paramVirtualMachineStorageSummary) {
    this.storage = paramVirtualMachineStorageSummary;
  }
  
  public VirtualMachineQuickStats getQuickStats() {
    return this.quickStats;
  }
  
  public void setQuickStats(VirtualMachineQuickStats paramVirtualMachineQuickStats) {
    this.quickStats = paramVirtualMachineQuickStats;
  }
  
  public ManagedEntityStatus getOverallStatus() {
    return this.overallStatus;
  }
  
  public void setOverallStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.overallStatus = paramManagedEntityStatus;
  }
  
  public List<CustomFieldValue> getCustomValue() {
    if (this.customValue == null)
      this.customValue = new ArrayList<>(); 
    return this.customValue;
  }
}
