package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RelocateVMRequestType;
import com.vmware.vim25.VirtualMachineMovePriority;
import com.vmware.vim25.VirtualMachineRelocateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelocateVMRequestType", propOrder = {"_this", "spec", "priority"})
public class RelocateVMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VirtualMachineRelocateSpec spec;
  
  protected VirtualMachineMovePriority priority;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VirtualMachineRelocateSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VirtualMachineRelocateSpec paramVirtualMachineRelocateSpec) {
    this.spec = paramVirtualMachineRelocateSpec;
  }
  
  public VirtualMachineMovePriority getPriority() {
    return this.priority;
  }
  
  public void setPriority(VirtualMachineMovePriority paramVirtualMachineMovePriority) {
    this.priority = paramVirtualMachineMovePriority;
  }
}
