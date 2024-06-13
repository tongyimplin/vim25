package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualSwitchProductSpec;
import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchProductSpec", propOrder = {"distributedVirtualSwitchProductSpec"})
public class ArrayOfDistributedVirtualSwitchProductSpec {
  @XmlElement(name = "DistributedVirtualSwitchProductSpec")
  protected List<DistributedVirtualSwitchProductSpec> distributedVirtualSwitchProductSpec;
  
  public List<DistributedVirtualSwitchProductSpec> getDistributedVirtualSwitchProductSpec() {
    if (this.distributedVirtualSwitchProductSpec == null)
      this.distributedVirtualSwitchProductSpec = new ArrayList<>(); 
    return this.distributedVirtualSwitchProductSpec;
  }
}
