package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec;
import com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchHostMemberConfigSpec", propOrder = {"operation", "host", "backing", "maxProxySwitchPorts", "vendorSpecificConfig"})
public class DistributedVirtualSwitchHostMemberConfigSpec extends DynamicData {
  @XmlElement(required = true)
  protected String operation;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected DistributedVirtualSwitchHostMemberBacking backing;
  
  protected Integer maxProxySwitchPorts;
  
  protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public DistributedVirtualSwitchHostMemberBacking getBacking() {
    return this.backing;
  }
  
  public void setBacking(DistributedVirtualSwitchHostMemberBacking paramDistributedVirtualSwitchHostMemberBacking) {
    this.backing = paramDistributedVirtualSwitchHostMemberBacking;
  }
  
  public Integer getMaxProxySwitchPorts() {
    return this.maxProxySwitchPorts;
  }
  
  public void setMaxProxySwitchPorts(Integer paramInteger) {
    this.maxProxySwitchPorts = paramInteger;
  }
  
  public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
    if (this.vendorSpecificConfig == null)
      this.vendorSpecificConfig = new ArrayList<>(); 
    return this.vendorSpecificConfig;
  }
}
