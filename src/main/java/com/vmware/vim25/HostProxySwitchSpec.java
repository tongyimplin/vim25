package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProxySwitchSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProxySwitchSpec", propOrder = {"backing"})
public class HostProxySwitchSpec extends DynamicData {
  protected DistributedVirtualSwitchHostMemberBacking backing;
  
  public DistributedVirtualSwitchHostMemberBacking getBacking() {
    return this.backing;
  }
  
  public void setBacking(DistributedVirtualSwitchHostMemberBacking paramDistributedVirtualSwitchHostMemberBacking) {
    this.backing = paramDistributedVirtualSwitchHostMemberBacking;
  }
}
