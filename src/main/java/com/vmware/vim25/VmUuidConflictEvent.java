package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmEventArgument;
import com.vmware.vim25.VmUuidConflictEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmUuidConflictEvent", propOrder = {"conflictedVm", "uuid"})
public class VmUuidConflictEvent extends VmEvent {
  @XmlElement(required = true)
  protected VmEventArgument conflictedVm;
  
  @XmlElement(required = true)
  protected String uuid;
  
  public VmEventArgument getConflictedVm() {
    return this.conflictedVm;
  }
  
  public void setConflictedVm(VmEventArgument paramVmEventArgument) {
    this.conflictedVm = paramVmEventArgument;
  }
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
}
