package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigInfo;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberTransportZoneInfo;
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
@XmlType(name = "DistributedVirtualSwitchHostMemberConfigInfo", propOrder = {"host", "maxProxySwitchPorts", "vendorSpecificConfig", "backing", "nsxSwitch", "ensEnabled", "ensInterruptEnabled", "transportZones", "nsxtUsedUplinkNames"})
public class DistributedVirtualSwitchHostMemberConfigInfo extends DynamicData {
  protected ManagedObjectReference host;
  
  protected int maxProxySwitchPorts;
  
  protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
  
  @XmlElement(required = true)
  protected DistributedVirtualSwitchHostMemberBacking backing;
  
  protected Boolean nsxSwitch;
  
  protected Boolean ensEnabled;
  
  protected Boolean ensInterruptEnabled;
  
  protected List<DistributedVirtualSwitchHostMemberTransportZoneInfo> transportZones;
  
  protected List<String> nsxtUsedUplinkNames;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public int getMaxProxySwitchPorts() {
    return this.maxProxySwitchPorts;
  }
  
  public void setMaxProxySwitchPorts(int paramInt) {
    this.maxProxySwitchPorts = paramInt;
  }
  
  public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
    if (this.vendorSpecificConfig == null)
      this.vendorSpecificConfig = new ArrayList<>(); 
    return this.vendorSpecificConfig;
  }
  
  public DistributedVirtualSwitchHostMemberBacking getBacking() {
    return this.backing;
  }
  
  public void setBacking(DistributedVirtualSwitchHostMemberBacking paramDistributedVirtualSwitchHostMemberBacking) {
    this.backing = paramDistributedVirtualSwitchHostMemberBacking;
  }
  
  public Boolean isNsxSwitch() {
    return this.nsxSwitch;
  }
  
  public void setNsxSwitch(Boolean paramBoolean) {
    this.nsxSwitch = paramBoolean;
  }
  
  public Boolean isEnsEnabled() {
    return this.ensEnabled;
  }
  
  public void setEnsEnabled(Boolean paramBoolean) {
    this.ensEnabled = paramBoolean;
  }
  
  public Boolean isEnsInterruptEnabled() {
    return this.ensInterruptEnabled;
  }
  
  public void setEnsInterruptEnabled(Boolean paramBoolean) {
    this.ensInterruptEnabled = paramBoolean;
  }
  
  public List<DistributedVirtualSwitchHostMemberTransportZoneInfo> getTransportZones() {
    if (this.transportZones == null)
      this.transportZones = new ArrayList<>(); 
    return this.transportZones;
  }
  
  public List<String> getNsxtUsedUplinkNames() {
    if (this.nsxtUsedUplinkNames == null)
      this.nsxtUsedUplinkNames = new ArrayList<>(); 
    return this.nsxtUsedUplinkNames;
  }
}
