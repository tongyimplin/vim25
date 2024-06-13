package com.vmware.vim25;

import com.vmware.vim25.FaultToleranceCannotEditMem;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceCannotEditMem", propOrder = {"vmName", "vm"})
public class FaultToleranceCannotEditMem extends VmConfigFault {
  @XmlElement(required = true)
  protected String vmName;
  
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
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
}
