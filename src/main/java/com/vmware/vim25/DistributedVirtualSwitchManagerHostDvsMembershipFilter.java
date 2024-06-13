package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchManagerHostDvsFilterSpec;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostDvsMembershipFilter;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerHostDvsMembershipFilter", propOrder = {"distributedVirtualSwitch"})
public class DistributedVirtualSwitchManagerHostDvsMembershipFilter extends DistributedVirtualSwitchManagerHostDvsFilterSpec {
  @XmlElement(required = true)
  protected ManagedObjectReference distributedVirtualSwitch;
  
  public ManagedObjectReference getDistributedVirtualSwitch() {
    return this.distributedVirtualSwitch;
  }
  
  public void setDistributedVirtualSwitch(ManagedObjectReference paramManagedObjectReference) {
    this.distributedVirtualSwitch = paramManagedObjectReference;
  }
}
