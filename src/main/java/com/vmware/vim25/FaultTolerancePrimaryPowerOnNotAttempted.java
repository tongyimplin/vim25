package com.vmware.vim25;

import com.vmware.vim25.FaultTolerancePrimaryPowerOnNotAttempted;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmFaultToleranceIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultTolerancePrimaryPowerOnNotAttempted", propOrder = {"secondaryVm", "primaryVm"})
public class FaultTolerancePrimaryPowerOnNotAttempted extends VmFaultToleranceIssue {
  @XmlElement(required = true)
  protected ManagedObjectReference secondaryVm;
  
  @XmlElement(required = true)
  protected ManagedObjectReference primaryVm;
  
  public ManagedObjectReference getSecondaryVm() {
    return this.secondaryVm;
  }
  
  public void setSecondaryVm(ManagedObjectReference paramManagedObjectReference) {
    this.secondaryVm = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getPrimaryVm() {
    return this.primaryVm;
  }
  
  public void setPrimaryVm(ManagedObjectReference paramManagedObjectReference) {
    this.primaryVm = paramManagedObjectReference;
  }
}
