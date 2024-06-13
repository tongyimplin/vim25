package com.vmware.vim25;

import com.vmware.vim25.DVPortState;
import com.vmware.vim25.DVPortStatus;
import com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob;
import com.vmware.vim25.DistributedVirtualSwitchPortStatistics;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortState", propOrder = {"runtimeInfo", "stats", "vendorSpecificState"})
public class DVPortState extends DynamicData {
  protected DVPortStatus runtimeInfo;
  
  @XmlElement(required = true)
  protected DistributedVirtualSwitchPortStatistics stats;
  
  protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificState;
  
  public DVPortStatus getRuntimeInfo() {
    return this.runtimeInfo;
  }
  
  public void setRuntimeInfo(DVPortStatus paramDVPortStatus) {
    this.runtimeInfo = paramDVPortStatus;
  }
  
  public DistributedVirtualSwitchPortStatistics getStats() {
    return this.stats;
  }
  
  public void setStats(DistributedVirtualSwitchPortStatistics paramDistributedVirtualSwitchPortStatistics) {
    this.stats = paramDistributedVirtualSwitchPortStatistics;
  }
  
  public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificState() {
    if (this.vendorSpecificState == null)
      this.vendorSpecificState = new ArrayList<>(); 
    return this.vendorSpecificState;
  }
}
