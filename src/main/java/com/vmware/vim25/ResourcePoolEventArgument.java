package com.vmware.vim25;

import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ResourcePoolEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolEventArgument", propOrder = {"resourcePool"})
public class ResourcePoolEventArgument extends EntityEventArgument {
  @XmlElement(required = true)
  protected ManagedObjectReference resourcePool;
  
  public ManagedObjectReference getResourcePool() {
    return this.resourcePool;
  }
  
  public void setResourcePool(ManagedObjectReference paramManagedObjectReference) {
    this.resourcePool = paramManagedObjectReference;
  }
}
