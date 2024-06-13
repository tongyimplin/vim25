package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryMemoryOverheadExRequestType;
import com.vmware.vim25.VirtualMachineConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryMemoryOverheadExRequestType", propOrder = {"_this", "vmConfigInfo"})
public class QueryMemoryOverheadExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VirtualMachineConfigInfo vmConfigInfo;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VirtualMachineConfigInfo getVmConfigInfo() {
    return this.vmConfigInfo;
  }
  
  public void setVmConfigInfo(VirtualMachineConfigInfo paramVirtualMachineConfigInfo) {
    this.vmConfigInfo = paramVirtualMachineConfigInfo;
  }
}
