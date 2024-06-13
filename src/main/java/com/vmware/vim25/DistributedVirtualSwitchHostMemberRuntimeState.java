package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMemberRuntimeState;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberRuntimeState", propOrder = {"currentMaxProxySwitchPorts"})
public class DistributedVirtualSwitchHostMemberRuntimeState extends DynamicData {
  protected int currentMaxProxySwitchPorts;
  
  public int getCurrentMaxProxySwitchPorts() {
    return this.currentMaxProxySwitchPorts;
  }
  
  public void setCurrentMaxProxySwitchPorts(int paramInt) {
    this.currentMaxProxySwitchPorts = paramInt;
  }
}
