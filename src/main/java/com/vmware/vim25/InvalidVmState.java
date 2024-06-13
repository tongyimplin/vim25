package com.vmware.vim25;

import com.vmware.vim25.InvalidState;
import com.vmware.vim25.InvalidVmState;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidVmState", propOrder = {"vm"})
public class InvalidVmState extends InvalidState {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
}
