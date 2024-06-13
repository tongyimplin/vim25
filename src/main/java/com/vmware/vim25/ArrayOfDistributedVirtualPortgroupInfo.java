package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDistributedVirtualPortgroupInfo;
import com.vmware.vim25.DistributedVirtualPortgroupInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDistributedVirtualPortgroupInfo", propOrder = {"distributedVirtualPortgroupInfo"})
public class ArrayOfDistributedVirtualPortgroupInfo {
  @XmlElement(name = "DistributedVirtualPortgroupInfo")
  protected List<DistributedVirtualPortgroupInfo> distributedVirtualPortgroupInfo;
  
  public List<DistributedVirtualPortgroupInfo> getDistributedVirtualPortgroupInfo() {
    if (this.distributedVirtualPortgroupInfo == null)
      this.distributedVirtualPortgroupInfo = new ArrayList<>(); 
    return this.distributedVirtualPortgroupInfo;
  }
}
