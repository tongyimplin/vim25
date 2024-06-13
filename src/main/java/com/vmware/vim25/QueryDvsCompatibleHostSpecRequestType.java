package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryDvsCompatibleHostSpecRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDvsCompatibleHostSpecRequestType", propOrder = {"_this", "switchProductSpec"})
public class QueryDvsCompatibleHostSpecRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected DistributedVirtualSwitchProductSpec switchProductSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public DistributedVirtualSwitchProductSpec getSwitchProductSpec() {
    return this.switchProductSpec;
  }
  
  public void setSwitchProductSpec(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.switchProductSpec = paramDistributedVirtualSwitchProductSpec;
  }
}
