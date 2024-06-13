package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualPortgroupProblem;
import com.vmware.vim25.DistributedVirtualPortgroupProblem;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualPortgroupProblem", propOrder = {"distributedVirtualPortgroupProblem"})
public class ArrayOfDistributedVirtualPortgroupProblem {
  @XmlElement(name = "DistributedVirtualPortgroupProblem")
  protected List<DistributedVirtualPortgroupProblem> distributedVirtualPortgroupProblem;
  
  public List<DistributedVirtualPortgroupProblem> getDistributedVirtualPortgroupProblem() {
    if (this.distributedVirtualPortgroupProblem == null)
      this.distributedVirtualPortgroupProblem = new ArrayList<>(); 
    return this.distributedVirtualPortgroupProblem;
  }
}
