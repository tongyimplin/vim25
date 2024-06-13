package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostDvsFilterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec", propOrder = {"distributedVirtualSwitchManagerHostDvsFilterSpec"})
public class ArrayOfDistributedVirtualSwitchManagerHostDvsFilterSpec {
  @XmlElement(name = "DistributedVirtualSwitchManagerHostDvsFilterSpec")
  protected List<DistributedVirtualSwitchManagerHostDvsFilterSpec> distributedVirtualSwitchManagerHostDvsFilterSpec;
  
  public List<DistributedVirtualSwitchManagerHostDvsFilterSpec> getDistributedVirtualSwitchManagerHostDvsFilterSpec() {
    if (this.distributedVirtualSwitchManagerHostDvsFilterSpec == null)
      this.distributedVirtualSwitchManagerHostDvsFilterSpec = new ArrayList<>(); 
    return this.distributedVirtualSwitchManagerHostDvsFilterSpec;
  }
}
