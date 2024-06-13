package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchManagerHostContainer;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerHostContainer", propOrder = {"container", "recursive"})
public class DistributedVirtualSwitchManagerHostContainer extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference container;
  
  protected boolean recursive;
  
  public ManagedObjectReference getContainer() {
    return this.container;
  }
  
  public void setContainer(ManagedObjectReference paramManagedObjectReference) {
    this.container = paramManagedObjectReference;
  }
  
  public boolean isRecursive() {
    return this.recursive;
  }
  
  public void setRecursive(boolean paramBoolean) {
    this.recursive = paramBoolean;
  }
}
