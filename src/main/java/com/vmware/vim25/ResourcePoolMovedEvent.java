package com.vmware.vim25;

import com.vmware.vim25.ResourcePoolEvent;
import com.vmware.vim25.ResourcePoolEventArgument;
import com.vmware.vim25.ResourcePoolMovedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolMovedEvent", propOrder = {"oldParent", "newParent"})
public class ResourcePoolMovedEvent extends ResourcePoolEvent {
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
