package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StorageDrsPodSelectionSpec;
import com.vmware.vim25.StoragePlacementSpec;
import com.vmware.vim25.VirtualMachineCloneSpec;
import com.vmware.vim25.VirtualMachineConfigSpec;
import com.vmware.vim25.VirtualMachineMovePriority;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoragePlacementSpec", propOrder = {"type", "priority", "vm", "podSelectionSpec", "cloneSpec", "cloneName", "configSpec", "relocateSpec", "resourcePool", "host", "folder", "disallowPrerequisiteMoves", "resourceLeaseDurationSec"})
public class StoragePlacementSpec extends DynamicData {
  @XmlElement(required = true)
  protected String type;
  
  protected VirtualMachineMovePriority priority;
  
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected StorageDrsPodSelectionSpec podSelectionSpec;
  
  protected VirtualMachineCloneSpec cloneSpec;
  
  protected String cloneName;
  
  protected VirtualMachineConfigSpec configSpec;
  
  protected VirtualMachineRelocateSpec relocateSpec;
  
  protected ManagedObjectReference resourcePool;
  
  protected ManagedObjectReference host;
  
  protected ManagedObjectReference folder;
  
  protected Boolean disallowPrerequisiteMoves;
  
  protected Integer resourceLeaseDurationSec;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
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
  
  public StorageDrsPodSelectionSpec getPodSelectionSpec() {
    return this.podSelectionSpec;
  }
  
  public void setPodSelectionSpec(StorageDrsPodSelectionSpec paramStorageDrsPodSelectionSpec) {
    this.podSelectionSpec = paramStorageDrsPodSelectionSpec;
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
  
  public ManagedObjectReference getResourcePool() {
    return this.resourcePool;
  }
  
  public void setResourcePool(ManagedObjectReference paramManagedObjectReference) {
    this.resourcePool = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getFolder() {
    return this.folder;
  }
  
  public void setFolder(ManagedObjectReference paramManagedObjectReference) {
    this.folder = paramManagedObjectReference;
  }
  
  public Boolean isDisallowPrerequisiteMoves() {
    return this.disallowPrerequisiteMoves;
  }
  
  public void setDisallowPrerequisiteMoves(Boolean paramBoolean) {
    this.disallowPrerequisiteMoves = paramBoolean;
  }
  
  public Integer getResourceLeaseDurationSec() {
    return this.resourceLeaseDurationSec;
  }
  
  public void setResourceLeaseDurationSec(Integer paramInteger) {
    this.resourceLeaseDurationSec = paramInteger;
  }
}
