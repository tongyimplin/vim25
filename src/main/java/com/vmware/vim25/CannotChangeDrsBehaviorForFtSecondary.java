package com.vmware.vim25;

import com.vmware.vim25.CannotChangeDrsBehaviorForFtSecondary;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmFaultToleranceIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotChangeDrsBehaviorForFtSecondary", propOrder = {"vm", "vmName"})
public class CannotChangeDrsBehaviorForFtSecondary extends VmFaultToleranceIssue {
  @XmlElement(required = true)
  protected ManagedObjectReference vm;
  
  @XmlElement(required = true)
  protected String vmName;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
}
