package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PlacementAction;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementAction", propOrder = {"vm", "targetHost", "relocateSpec"})
public class PlacementAction extends ClusterAction {
  protected ManagedObjectReference vm;
  
  protected ManagedObjectReference targetHost;
  
  protected VirtualMachineRelocateSpec relocateSpec;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getTargetHost() {
    return this.targetHost;
  }
  
  public void setTargetHost(ManagedObjectReference paramManagedObjectReference) {
    this.targetHost = paramManagedObjectReference;
  }
  
  public VirtualMachineRelocateSpec getRelocateSpec() {
    return this.relocateSpec;
  }
  
  public void setRelocateSpec(VirtualMachineRelocateSpec paramVirtualMachineRelocateSpec) {
    this.relocateSpec = paramVirtualMachineRelocateSpec;
  }
}
