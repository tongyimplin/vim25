package com.vmware.vim25;

import com.vmware.vim25.DVSManagerDvsConfigTarget;
import com.vmware.vim25.DistributedVirtualPortgroupInfo;
import com.vmware.vim25.DistributedVirtualSwitchInfo;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSManagerDvsConfigTarget", propOrder = {"distributedVirtualPortgroup", "distributedVirtualSwitch"})
public class DVSManagerDvsConfigTarget extends DynamicData {
  protected List<DistributedVirtualPortgroupInfo> distributedVirtualPortgroup;
  
  protected List<DistributedVirtualSwitchInfo> distributedVirtualSwitch;
  
  public List<DistributedVirtualPortgroupInfo> getDistributedVirtualPortgroup() {
    if (this.distributedVirtualPortgroup == null)
      this.distributedVirtualPortgroup = new ArrayList<>(); 
    return this.distributedVirtualPortgroup;
  }
  
  public List<DistributedVirtualSwitchInfo> getDistributedVirtualSwitch() {
    if (this.distributedVirtualSwitch == null)
      this.distributedVirtualSwitch = new ArrayList<>(); 
    return this.distributedVirtualSwitch;
  }
}
