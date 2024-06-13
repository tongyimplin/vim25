package com.vmware.vim25;

import com.vmware.vim25.BoolPolicy;
import com.vmware.vim25.DVPortSetting;
import com.vmware.vim25.DVSTrafficShapingPolicy;
import com.vmware.vim25.DVSVendorSpecificConfig;
import com.vmware.vim25.DvsFilterPolicy;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StringPolicy;
import com.vmware.vim25.VMwareDVSPortSetting;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortSetting", propOrder = {"blocked", "vmDirectPathGen2Allowed", "inShapingPolicy", "outShapingPolicy", "vendorSpecificConfig", "networkResourcePoolKey", "filterPolicy"})
@XmlSeeAlso({VMwareDVSPortSetting.class})
public class DVPortSetting extends DynamicData {
  protected BoolPolicy blocked;
  
  protected BoolPolicy vmDirectPathGen2Allowed;
  
  protected DVSTrafficShapingPolicy inShapingPolicy;
  
  protected DVSTrafficShapingPolicy outShapingPolicy;
  
  protected DVSVendorSpecificConfig vendorSpecificConfig;
  
  protected StringPolicy networkResourcePoolKey;
  
  protected DvsFilterPolicy filterPolicy;
  
  public BoolPolicy getBlocked() {
    return this.blocked;
  }
  
  public void setBlocked(BoolPolicy paramBoolPolicy) {
    this.blocked = paramBoolPolicy;
  }
  
  public BoolPolicy getVmDirectPathGen2Allowed() {
    return this.vmDirectPathGen2Allowed;
  }
  
  public void setVmDirectPathGen2Allowed(BoolPolicy paramBoolPolicy) {
    this.vmDirectPathGen2Allowed = paramBoolPolicy;
  }
  
  public DVSTrafficShapingPolicy getInShapingPolicy() {
    return this.inShapingPolicy;
  }
  
  public void setInShapingPolicy(DVSTrafficShapingPolicy paramDVSTrafficShapingPolicy) {
    this.inShapingPolicy = paramDVSTrafficShapingPolicy;
  }
  
  public DVSTrafficShapingPolicy getOutShapingPolicy() {
    return this.outShapingPolicy;
  }
  
  public void setOutShapingPolicy(DVSTrafficShapingPolicy paramDVSTrafficShapingPolicy) {
    this.outShapingPolicy = paramDVSTrafficShapingPolicy;
  }
  
  public DVSVendorSpecificConfig getVendorSpecificConfig() {
    return this.vendorSpecificConfig;
  }
  
  public void setVendorSpecificConfig(DVSVendorSpecificConfig paramDVSVendorSpecificConfig) {
    this.vendorSpecificConfig = paramDVSVendorSpecificConfig;
  }
  
  public StringPolicy getNetworkResourcePoolKey() {
    return this.networkResourcePoolKey;
  }
  
  public void setNetworkResourcePoolKey(StringPolicy paramStringPolicy) {
    this.networkResourcePoolKey = paramStringPolicy;
  }
  
  public DvsFilterPolicy getFilterPolicy() {
    return this.filterPolicy;
  }
  
  public void setFilterPolicy(DvsFilterPolicy paramDvsFilterPolicy) {
    this.filterPolicy = paramDvsFilterPolicy;
  }
}
