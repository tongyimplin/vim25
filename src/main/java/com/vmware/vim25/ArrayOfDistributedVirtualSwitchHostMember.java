package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualSwitchHostMember;
import com.vmware.vim25.DistributedVirtualSwitchHostMember;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchHostMember", propOrder = {"distributedVirtualSwitchHostMember"})
public class ArrayOfDistributedVirtualSwitchHostMember {
  @XmlElement(name = "DistributedVirtualSwitchHostMember")
  protected List<DistributedVirtualSwitchHostMember> distributedVirtualSwitchHostMember;
  
  public List<DistributedVirtualSwitchHostMember> getDistributedVirtualSwitchHostMember() {
    if (this.distributedVirtualSwitchHostMember == null)
      this.distributedVirtualSwitchHostMember = new ArrayList<>(); 
    return this.distributedVirtualSwitchHostMember;
  }
}
