package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualSwitchHostMemberConfigSpec;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchHostMemberConfigSpec", propOrder = {"distributedVirtualSwitchHostMemberConfigSpec"})
public class ArrayOfDistributedVirtualSwitchHostMemberConfigSpec {
  @XmlElement(name = "DistributedVirtualSwitchHostMemberConfigSpec")
  protected List<DistributedVirtualSwitchHostMemberConfigSpec> distributedVirtualSwitchHostMemberConfigSpec;
  
  public List<DistributedVirtualSwitchHostMemberConfigSpec> getDistributedVirtualSwitchHostMemberConfigSpec() {
    if (this.distributedVirtualSwitchHostMemberConfigSpec == null)
      this.distributedVirtualSwitchHostMemberConfigSpec = new ArrayList<>(); 
    return this.distributedVirtualSwitchHostMemberConfigSpec;
  }
}
