package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualPortgroupNsxPortgroupOperationResult;
import com.vmware.vim25.DistributedVirtualPortgroupProblem;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualPortgroupNsxPortgroupOperationResult", propOrder = {"portgroups", "problems"})
public class DistributedVirtualPortgroupNsxPortgroupOperationResult extends DynamicData {
  protected List<ManagedObjectReference> portgroups;
  
  protected List<DistributedVirtualPortgroupProblem> problems;
  
  public List<ManagedObjectReference> getPortgroups() {
    if (this.portgroups == null)
      this.portgroups = new ArrayList<>(); 
    return this.portgroups;
  }
  
  public List<DistributedVirtualPortgroupProblem> getProblems() {
    if (this.problems == null)
      this.problems = new ArrayList<>(); 
    return this.problems;
  }
}
