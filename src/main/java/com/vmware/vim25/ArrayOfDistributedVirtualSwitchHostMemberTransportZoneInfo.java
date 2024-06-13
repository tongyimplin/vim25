package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualSwitchHostMemberTransportZoneInfo;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberTransportZoneInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchHostMemberTransportZoneInfo", propOrder = {"distributedVirtualSwitchHostMemberTransportZoneInfo"})
public class ArrayOfDistributedVirtualSwitchHostMemberTransportZoneInfo {
  @XmlElement(name = "DistributedVirtualSwitchHostMemberTransportZoneInfo")
  protected List<DistributedVirtualSwitchHostMemberTransportZoneInfo> distributedVirtualSwitchHostMemberTransportZoneInfo;
  
  public List<DistributedVirtualSwitchHostMemberTransportZoneInfo> getDistributedVirtualSwitchHostMemberTransportZoneInfo() {
    if (this.distributedVirtualSwitchHostMemberTransportZoneInfo == null)
      this.distributedVirtualSwitchHostMemberTransportZoneInfo = new ArrayList<>(); 
    return this.distributedVirtualSwitchHostMemberTransportZoneInfo;
  }
}
