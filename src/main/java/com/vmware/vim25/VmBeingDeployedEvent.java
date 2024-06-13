package com.vmware.vim25;

import com.vmware.vim25.VmBeingDeployedEvent;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmBeingDeployedEvent", propOrder = {"srcTemplate"})
public class VmBeingDeployedEvent extends VmEvent {
  @XmlElement(required = true)
  protected VmEventArgument srcTemplate;
  
  public VmEventArgument getSrcTemplate() {
    return this.srcTemplate;
  }
  
  public void setSrcTemplate(VmEventArgument paramVmEventArgument) {
    this.srcTemplate = paramVmEventArgument;
  }
}
