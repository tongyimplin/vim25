package com.vmware.vim25;

import com.vmware.vim25.ResourcePoolEventArgument;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmResourcePoolMovedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmResourcePoolMovedEvent", propOrder = {"oldParent", "newParent"})
public class VmResourcePoolMovedEvent extends VmEvent {
  @XmlElement(required = true)
  protected ResourcePoolEventArgument oldParent;
  
  @XmlElement(required = true)
  protected ResourcePoolEventArgument newParent;
  
  public ResourcePoolEventArgument getOldParent() {
    return this.oldParent;
  }
  
  public void setOldParent(ResourcePoolEventArgument paramResourcePoolEventArgument) {
    this.oldParent = paramResourcePoolEventArgument;
  }
  
  public ResourcePoolEventArgument getNewParent() {
    return this.newParent;
  }
  
  public void setNewParent(ResourcePoolEventArgument paramResourcePoolEventArgument) {
    this.newParent = paramResourcePoolEventArgument;
  }
}
