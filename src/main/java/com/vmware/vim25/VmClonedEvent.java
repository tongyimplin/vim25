package com.vmware.vim25;

import com.vmware.vim25.VmCloneEvent;
import com.vmware.vim25.VmClonedEvent;
import com.vmware.vim25.VmEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmClonedEvent", propOrder = {"sourceVm"})
public class VmClonedEvent extends VmCloneEvent {
  @XmlElement(required = true)
  protected VmEventArgument sourceVm;
  
  public VmEventArgument getSourceVm() {
    return this.sourceVm;
  }
  
  public void setSourceVm(VmEventArgument paramVmEventArgument) {
    this.sourceVm = paramVmEventArgument;
  }
}
