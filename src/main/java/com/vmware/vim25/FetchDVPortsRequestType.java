package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortCriteria;
import com.vmware.vim25.FetchDVPortsRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FetchDVPortsRequestType", propOrder = {"_this", "criteria"})
public class FetchDVPortsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected DistributedVirtualSwitchPortCriteria criteria;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public DistributedVirtualSwitchPortCriteria getCriteria() {
    return this.criteria;
  }
  
  public void setCriteria(DistributedVirtualSwitchPortCriteria paramDistributedVirtualSwitchPortCriteria) {
    this.criteria = paramDistributedVirtualSwitchPortCriteria;
  }
}
