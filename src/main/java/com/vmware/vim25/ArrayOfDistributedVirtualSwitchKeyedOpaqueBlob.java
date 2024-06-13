package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob;
import com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob", propOrder = {"distributedVirtualSwitchKeyedOpaqueBlob"})
public class ArrayOfDistributedVirtualSwitchKeyedOpaqueBlob {
  @XmlElement(name = "DistributedVirtualSwitchKeyedOpaqueBlob")
  protected List<DistributedVirtualSwitchKeyedOpaqueBlob> distributedVirtualSwitchKeyedOpaqueBlob;
  
  public List<DistributedVirtualSwitchKeyedOpaqueBlob> getDistributedVirtualSwitchKeyedOpaqueBlob() {
    if (this.distributedVirtualSwitchKeyedOpaqueBlob == null)
      this.distributedVirtualSwitchKeyedOpaqueBlob = new ArrayList<>(); 
    return this.distributedVirtualSwitchKeyedOpaqueBlob;
  }
}
