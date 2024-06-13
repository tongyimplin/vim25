package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.ResourcePoolCreatedEvent;
import com.vmware.vim25.ResourcePoolDestroyedEvent;
import com.vmware.vim25.ResourcePoolEvent;
import com.vmware.vim25.ResourcePoolEventArgument;
import com.vmware.vim25.ResourcePoolMovedEvent;
import com.vmware.vim25.ResourcePoolReconfiguredEvent;
import com.vmware.vim25.ResourceViolatedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolEvent", propOrder = {"resourcePool"})
@XmlSeeAlso({ResourcePoolReconfiguredEvent.class, ResourceViolatedEvent.class, ResourcePoolDestroyedEvent.class, ResourcePoolCreatedEvent.class, ResourcePoolMovedEvent.class})
public class ResourcePoolEvent extends Event {
  @XmlElement(required = true)
  protected ResourcePoolEventArgument resourcePool;
  
  public ResourcePoolEventArgument getResourcePool() {
    return this.resourcePool;
  }
  
  public void setResourcePool(ResourcePoolEventArgument paramResourcePoolEventArgument) {
    this.resourcePool = paramResourcePoolEventArgument;
  }
}
