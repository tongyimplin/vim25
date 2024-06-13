package com.vmware.vim25;

import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PlacementSpec;
import com.vmware.vim25.VirtualMachineCloneSpec;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineMovePriority;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementSpec", propOrder = {"priority", "vm", "configSpec", "relocateSpec", "hosts", "datastores", "storagePods", "disallowPrerequisiteMoves", "rules", "key", "placementType", "cloneSpec", "cloneName"})
public class PlacementSpec extends DynamicData {
  protected VirtualMachineMovePriority priority;
  
  protected ManagedObjectReference vm;
  
  protected VirtualMachineConfigSpec configSpec;
  
  protected VirtualMachineRelocateSpec relocateSpec;
  
  protected List<ManagedObjectReference> hosts;
  
  protected List<ManagedObjectReference> datastores;
  
  protected List<ManagedObjectReference> storagePods;
  
  protected Boolean disallowPrerequisiteMoves;
  
  protected List<ClusterRuleInfo> rules;
  
  protected String key;
  
  protected String placementType;
  
  protected VirtualMachineCloneSpec cloneSpec;
  
  protected String cloneName;
  
  public VirtualMachineMovePriority getPriority() {
    return this.priority;
  }
  
  public void setPriority(VirtualMachineMovePriority paramVirtualMachineMovePriority) {
    this.priority = paramVirtualMachineMovePriority;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public VirtualMachineConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(VirtualMachineConfigSpec paramVirtualMachineConfigSpec) {
    this.configSpec = paramVirtualMachineConfigSpec;
  }
  
  public VirtualMachineRelocateSpec getRelocateSpec() {
    return this.relocateSpec;
  }
  
  public void setRelocateSpec(VirtualMachineRelocateSpec paramVirtualMachineRelocateSpec) {
    this.relocateSpec = paramVirtualMachineRelocateSpec;
  }
  
  public List<ManagedObjectReference> getHosts() {
    if (this.hosts == null)
      this.hosts = new ArrayList<>(); 
    return this.hosts;
  }
  
  public List<ManagedObjectReference> getDatastores() {
    if (this.datastores == null)
      this.datastores = new ArrayList<>(); 
    return this.datastores;
  }
  
  public List<ManagedObjectReference> getStoragePods() {
    if (this.storagePods == null)
      this.storagePods = new ArrayList<>(); 
    return this.storagePods;
  }
  
  public Boolean isDisallowPrerequisiteMoves() {
    return this.disallowPrerequisiteMoves;
  }
  
  public void setDisallowPrerequisiteMoves(Boolean paramBoolean) {
    this.disallowPrerequisiteMoves = paramBoolean;
  }
  
  public List<ClusterRuleInfo> getRules() {
    if (this.rules == null)
      this.rules = new ArrayList<>(); 
    return this.rules;
  }
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getPlacementType() {
    return this.placementType;
  }
  
  public void setPlacementType(String paramString) {
    this.placementType = paramString;
  }
  
  public VirtualMachineCloneSpec getCloneSpec() {
    return this.cloneSpec;
  }
  
  public void setCloneSpec(VirtualMachineCloneSpec paramVirtualMachineCloneSpec) {
    this.cloneSpec = paramVirtualMachineCloneSpec;
  }
  
  public String getCloneName() {
    return this.cloneName;
  }
  
  public void setCloneName(String paramString) {
    this.cloneName = paramString;
  }
}
