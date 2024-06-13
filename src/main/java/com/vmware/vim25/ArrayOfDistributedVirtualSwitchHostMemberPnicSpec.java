package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualSwitchHostMemberPnicSpec;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchHostMemberPnicSpec", propOrder = {"distributedVirtualSwitchHostMemberPnicSpec"})
public class ArrayOfDistributedVirtualSwitchHostMemberPnicSpec {
  @XmlElement(name = "DistributedVirtualSwitchHostMemberPnicSpec")
  protected List<DistributedVirtualSwitchHostMemberPnicSpec> distributedVirtualSwitchHostMemberPnicSpec;
  
  public List<DistributedVirtualSwitchHostMemberPnicSpec> getDistributedVirtualSwitchHostMemberPnicSpec() {
    if (this.distributedVirtualSwitchHostMemberPnicSpec == null)
      this.distributedVirtualSwitchHostMemberPnicSpec = new ArrayList<>(); 
    return this.distributedVirtualSwitchHostMemberPnicSpec;
  }
}
