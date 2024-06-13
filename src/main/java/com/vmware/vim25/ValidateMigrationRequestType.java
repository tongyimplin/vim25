package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ValidateMigrationRequestType;
import com.vmware.vim25.VirtualMachinePowerState;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateMigrationRequestType", propOrder = {"_this", "vm", "state", "testType", "pool", "host"})
public class ValidateMigrationRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<ManagedObjectReference> vm;
  
  protected VirtualMachinePowerState state;
  
  protected List<String> testType;
  
  protected ManagedObjectReference pool;
  
  protected ManagedObjectReference host;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getVm() {
    if (this.vm == null)
      this.vm = new ArrayList<>(); 
    return this.vm;
  }
  
  public VirtualMachinePowerState getState() {
    return this.state;
  }
  
  public void setState(VirtualMachinePowerState paramVirtualMachinePowerState) {
    this.state = paramVirtualMachinePowerState;
  }
  
  public List<String> getTestType() {
    if (this.testType == null)
      this.testType = new ArrayList<>(); 
    return this.testType;
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
}
