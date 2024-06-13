package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MigrateVMRequestType;
import com.vmware.vim25.VirtualMachineMovePriority;
import com.vmware.vim25.VirtualMachinePowerState;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrateVMRequestType", propOrder = {"_this", "pool", "host", "priority", "state"})
public class MigrateVMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference pool;
  
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected VirtualMachineMovePriority priority;
  
  protected VirtualMachinePowerState state;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPool() {
    return this.pool;
  }
  
  public void setPool(ManagedObjectReference paramManagedObjectReference) {
    this.pool = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public VirtualMachineMovePriority getPriority() {
    return this.priority;
  }
  
  public void setPriority(VirtualMachineMovePriority paramVirtualMachineMovePriority) {
    this.priority = paramVirtualMachineMovePriority;
  }
  
  public VirtualMachinePowerState getState() {
    return this.state;
  }
  
  public void setState(VirtualMachinePowerState paramVirtualMachinePowerState) {
    this.state = paramVirtualMachinePowerState;
  }
}
