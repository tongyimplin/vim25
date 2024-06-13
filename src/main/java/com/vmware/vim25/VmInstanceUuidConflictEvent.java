package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmEventArgument;
import com.vmware.vim25.VmInstanceUuidConflictEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmInstanceUuidConflictEvent", propOrder = {"conflictedVm", "instanceUuid"})
public class VmInstanceUuidConflictEvent extends VmEvent {
  @XmlElement(required = true)
  protected VmEventArgument conflictedVm;
  
  @XmlElement(required = true)
  protected String instanceUuid;
  
  public VmEventArgument getConflictedVm() {
    return this.conflictedVm;
  }
  
  public void setConflictedVm(VmEventArgument paramVmEventArgument) {
    this.conflictedVm = paramVmEventArgument;
  }
  
  public String getInstanceUuid() {
    return this.instanceUuid;
  }
  
  public void setInstanceUuid(String paramString) {
    this.instanceUuid = paramString;
  }
}
