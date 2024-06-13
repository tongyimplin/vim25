package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StorageMigrationAction;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageMigrationAction", propOrder = {"vm", "relocateSpec", "source", "destination", "sizeTransferred", "spaceUtilSrcBefore", "spaceUtilDstBefore", "spaceUtilSrcAfter", "spaceUtilDstAfter", "ioLatencySrcBefore", "ioLatencyDstBefore"})
public class StorageMigrationAction extends ClusterAction {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected VirtualMachineRelocateSpec relocateSpec;
  
  @XmlElement(required = true)
  protected ManagedObjectReference source;
  
  @XmlElement(required = true)
  protected ManagedObjectReference destination;
  
  protected long sizeTransferred;
  
  protected Float spaceUtilSrcBefore;
  
  protected Float spaceUtilDstBefore;
  
  protected Float spaceUtilSrcAfter;
  
  protected Float spaceUtilDstAfter;
  
  protected Float ioLatencySrcBefore;
  
  protected Float ioLatencyDstBefore;
  
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
  
  public ManagedObjectReference getSource() {
    return this.source;
  }
  
  public void setSource(ManagedObjectReference paramManagedObjectReference) {
    this.source = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDestination() {
    return this.destination;
  }
  
  public void setDestination(ManagedObjectReference paramManagedObjectReference) {
    this.destination = paramManagedObjectReference;
  }
  
  public long getSizeTransferred() {
    return this.sizeTransferred;
  }
  
  public void setSizeTransferred(long paramLong) {
    this.sizeTransferred = paramLong;
  }
  
  public Float getSpaceUtilSrcBefore() {
    return this.spaceUtilSrcBefore;
  }
  
  public void setSpaceUtilSrcBefore(Float paramFloat) {
    this.spaceUtilSrcBefore = paramFloat;
  }
  
  public Float getSpaceUtilDstBefore() {
    return this.spaceUtilDstBefore;
  }
  
  public void setSpaceUtilDstBefore(Float paramFloat) {
    this.spaceUtilDstBefore = paramFloat;
  }
  
  public Float getSpaceUtilSrcAfter() {
    return this.spaceUtilSrcAfter;
  }
  
  public void setSpaceUtilSrcAfter(Float paramFloat) {
    this.spaceUtilSrcAfter = paramFloat;
  }
  
  public Float getSpaceUtilDstAfter() {
    return this.spaceUtilDstAfter;
  }
  
  public void setSpaceUtilDstAfter(Float paramFloat) {
    this.spaceUtilDstAfter = paramFloat;
  }
  
  public Float getIoLatencySrcBefore() {
    return this.ioLatencySrcBefore;
  }
  
  public void setIoLatencySrcBefore(Float paramFloat) {
    this.ioLatencySrcBefore = paramFloat;
  }
  
  public Float getIoLatencyDstBefore() {
    return this.ioLatencyDstBefore;
  }
  
  public void setIoLatencyDstBefore(Float paramFloat) {
    this.ioLatencyDstBefore = paramFloat;
  }
}
