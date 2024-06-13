package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchManagerHostArrayFilter;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostContainerFilter;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostDvsFilterSpec;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostDvsMembershipFilter;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerHostDvsFilterSpec", propOrder = {"inclusive"})
@XmlSeeAlso({DistributedVirtualSwitchManagerHostArrayFilter.class, DistributedVirtualSwitchManagerHostContainerFilter.class, DistributedVirtualSwitchManagerHostDvsMembershipFilter.class})
public class DistributedVirtualSwitchManagerHostDvsFilterSpec extends DynamicData {
  protected boolean inclusive;
  
  public boolean isInclusive() {
    return this.inclusive;
  }
  
  public void setInclusive(boolean paramBoolean) {
    this.inclusive = paramBoolean;
  }
}
