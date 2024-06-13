package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualSwitchHostProductSpec;
import com.vmware.vim25.DistributedVirtualSwitchHostProductSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchHostProductSpec", propOrder = {"distributedVirtualSwitchHostProductSpec"})
public class ArrayOfDistributedVirtualSwitchHostProductSpec {
  @XmlElement(name = "DistributedVirtualSwitchHostProductSpec")
  protected List<DistributedVirtualSwitchHostProductSpec> distributedVirtualSwitchHostProductSpec;
  
  public List<DistributedVirtualSwitchHostProductSpec> getDistributedVirtualSwitchHostProductSpec() {
    if (this.distributedVirtualSwitchHostProductSpec == null)
      this.distributedVirtualSwitchHostProductSpec = new ArrayList<>(); 
    return this.distributedVirtualSwitchHostProductSpec;
  }
}
