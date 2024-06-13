package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigVMRequestType;
import com.vmware.vim25.VirtualMachineConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigVMRequestType", propOrder = {"_this", "spec"})
public class ReconfigVMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VirtualMachineConfigSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VirtualMachineConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VirtualMachineConfigSpec paramVirtualMachineConfigSpec) {
    this.spec = paramVirtualMachineConfigSpec;
  }
}
