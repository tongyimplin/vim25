package com.vmware.vim25;

import com.vmware.vim25.ComputeResourceEventArgument;
import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceEventArgument", propOrder = {"computeResource"})
public class ComputeResourceEventArgument extends EntityEventArgument {
  @XmlElement(required = true)
  protected ManagedObjectReference computeResource;
  
  public ManagedObjectReference getComputeResource() {
    return this.computeResource;
  }
  
  public void setComputeResource(ManagedObjectReference paramManagedObjectReference) {
    this.computeResource = paramManagedObjectReference;
  }
}
