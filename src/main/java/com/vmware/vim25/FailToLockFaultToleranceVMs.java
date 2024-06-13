package com.vmware.vim25;

import com.vmware.vim25.FailToLockFaultToleranceVMs;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailToLockFaultToleranceVMs", propOrder = {"vmName", "vm", "alreadyLockedVm"})
public class FailToLockFaultToleranceVMs extends RuntimeFault {
  @XmlElement(required = true)
  protected String vmName;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected ManagedObjectReference alreadyLockedVm;
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getAlreadyLockedVm() {
    return this.alreadyLockedVm;
  }
  
  public void setAlreadyLockedVm(ManagedObjectReference paramManagedObjectReference) {
    this.alreadyLockedVm = paramManagedObjectReference;
  }
}
