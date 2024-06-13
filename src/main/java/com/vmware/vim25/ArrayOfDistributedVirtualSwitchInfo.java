package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualSwitchInfo;
import com.vmware.vim25.DistributedVirtualSwitchInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchInfo", propOrder = {"distributedVirtualSwitchInfo"})
public class ArrayOfDistributedVirtualSwitchInfo {
  @XmlElement(name = "DistributedVirtualSwitchInfo")
  protected List<DistributedVirtualSwitchInfo> distributedVirtualSwitchInfo;
  
  public List<DistributedVirtualSwitchInfo> getDistributedVirtualSwitchInfo() {
    if (this.distributedVirtualSwitchInfo == null)
      this.distributedVirtualSwitchInfo = new ArrayList<>(); 
    return this.distributedVirtualSwitchInfo;
  }
}
