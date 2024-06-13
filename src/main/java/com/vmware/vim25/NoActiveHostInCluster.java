package com.vmware.vim25;

import com.vmware.vim25.InvalidState;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NoActiveHostInCluster;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoActiveHostInCluster", propOrder = {"computeResource"})
public class NoActiveHostInCluster extends InvalidState {
  @XmlElement(required = true)
  protected ManagedObjectReference computeResource;
  
  public ManagedObjectReference getComputeResource() {
    return this.computeResource;
  }
  
  public void setComputeResource(ManagedObjectReference paramManagedObjectReference) {
    this.computeResource = paramManagedObjectReference;
  }
}
