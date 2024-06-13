package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StoragePlacementAction;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoragePlacementAction", propOrder = {"vm", "relocateSpec", "destination", "spaceUtilBefore", "spaceDemandBefore", "spaceUtilAfter", "spaceDemandAfter", "ioLatencyBefore"})
public class StoragePlacementAction extends ClusterAction {
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected VirtualMachineRelocateSpec relocateSpec;
  
  @XmlElement(required = true)
  protected ManagedObjectReference destination;
  
  protected Float spaceUtilBefore;
  
  protected Float spaceDemandBefore;
  
  protected Float spaceUtilAfter;
  
  protected Float spaceDemandAfter;
  
  protected Float ioLatencyBefore;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public VirtualMachineRelocateSpec getRelocateSpec() {
    return this.relocateSpec;
  }
  
  public void setRelocateSpec(VirtualMachineRelocateSpec paramVirtualMachineRelocateSpec) {
    this.relocateSpec = paramVirtualMachineRelocateSpec;
  }
  
  public ManagedObjectReference getDestination() {
    return this.destination;
  }
  
  public void setDestination(ManagedObjectReference paramManagedObjectReference) {
    this.destination = paramManagedObjectReference;
  }
  
  public Float getSpaceUtilBefore() {
    return this.spaceUtilBefore;
  }
  
  public void setSpaceUtilBefore(Float paramFloat) {
    this.spaceUtilBefore = paramFloat;
  }
  
  public Float getSpaceDemandBefore() {
    return this.spaceDemandBefore;
  }
  
  public void setSpaceDemandBefore(Float paramFloat) {
    this.spaceDemandBefore = paramFloat;
  }
  
  public Float getSpaceUtilAfter() {
    return this.spaceUtilAfter;
  }
  
  public void setSpaceUtilAfter(Float paramFloat) {
    this.spaceUtilAfter = paramFloat;
  }
  
  public Float getSpaceDemandAfter() {
    return this.spaceDemandAfter;
  }
  
  public void setSpaceDemandAfter(Float paramFloat) {
    this.spaceDemandAfter = paramFloat;
  }
  
  public Float getIoLatencyBefore() {
    return this.ioLatencyBefore;
  }
  
  public void setIoLatencyBefore(Float paramFloat) {
    this.ioLatencyBefore = paramFloat;
  }
}
