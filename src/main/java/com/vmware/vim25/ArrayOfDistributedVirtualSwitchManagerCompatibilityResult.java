package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualSwitchManagerCompatibilityResult;
import com.vmware.vim25.DistributedVirtualSwitchManagerCompatibilityResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualSwitchManagerCompatibilityResult", propOrder = {"distributedVirtualSwitchManagerCompatibilityResult"})
public class ArrayOfDistributedVirtualSwitchManagerCompatibilityResult {
  @XmlElement(name = "DistributedVirtualSwitchManagerCompatibilityResult")
  protected List<DistributedVirtualSwitchManagerCompatibilityResult> distributedVirtualSwitchManagerCompatibilityResult;
  
  public List<DistributedVirtualSwitchManagerCompatibilityResult> getDistributedVirtualSwitchManagerCompatibilityResult() {
    if (this.distributedVirtualSwitchManagerCompatibilityResult == null)
      this.distributedVirtualSwitchManagerCompatibilityResult = new ArrayList<>(); 
    return this.distributedVirtualSwitchManagerCompatibilityResult;
  }
}
