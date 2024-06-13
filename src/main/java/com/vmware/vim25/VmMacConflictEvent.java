package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmEventArgument;
import com.vmware.vim25.VmMacConflictEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmMacConflictEvent", propOrder = {"conflictedVm", "mac"})
public class VmMacConflictEvent extends VmEvent {
  @XmlElement(required = true)
  protected VmEventArgument conflictedVm;
  
  @XmlElement(required = true)
  protected String mac;
  
  public VmEventArgument getConflictedVm() {
    return this.conflictedVm;
  }
  
  public void setConflictedVm(VmEventArgument paramVmEventArgument) {
    this.conflictedVm = paramVmEventArgument;
  }
  
  public String getMac() {
    return this.mac;
  }
  
  public void setMac(String paramString) {
    this.mac = paramString;
  }
}
