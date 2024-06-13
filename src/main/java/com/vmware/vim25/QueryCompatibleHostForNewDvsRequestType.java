package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryCompatibleHostForNewDvsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCompatibleHostForNewDvsRequestType", propOrder = {"_this", "container", "recursive", "switchProductSpec"})
public class QueryCompatibleHostForNewDvsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference container;
  
  protected boolean recursive;
  
  protected DistributedVirtualSwitchProductSpec switchProductSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
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
  
  public DistributedVirtualSwitchProductSpec getSwitchProductSpec() {
    return this.switchProductSpec;
  }
  
  public void setSwitchProductSpec(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.switchProductSpec = paramDistributedVirtualSwitchProductSpec;
  }
}
