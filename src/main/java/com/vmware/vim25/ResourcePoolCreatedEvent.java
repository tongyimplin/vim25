package com.vmware.vim25;

import com.vmware.vim25.ResourcePoolCreatedEvent;
import com.vmware.vim25.ResourcePoolEvent;
import com.vmware.vim25.ResourcePoolEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolCreatedEvent", propOrder = {"parent"})
public class ResourcePoolCreatedEvent extends ResourcePoolEvent {
  @XmlElement(required = true)
  protected ResourcePoolEventArgument parent;
  
  public ResourcePoolEventArgument getParent() {
    return this.parent;
  }
  
  public void setParent(ResourcePoolEventArgument paramResourcePoolEventArgument) {
    this.parent = paramResourcePoolEventArgument;
  }
}
