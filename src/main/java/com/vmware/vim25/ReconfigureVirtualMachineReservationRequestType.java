package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureVirtualMachineReservationRequestType;
import com.vmware.vim25.VirtualMachineMemoryReservationSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureVirtualMachineReservationRequestType", propOrder = {"_this", "spec"})
public class ReconfigureVirtualMachineReservationRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VirtualMachineMemoryReservationSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VirtualMachineMemoryReservationSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VirtualMachineMemoryReservationSpec paramVirtualMachineMemoryReservationSpec) {
    this.spec = paramVirtualMachineMemoryReservationSpec;
  }
}
