package com.vmware.vim25;

import com.vmware.vim25.DVPortSetting;
import com.vmware.vim25.DVPortgroupConfigSpec;
import com.vmware.vim25.DVPortgroupPolicy;
import com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortgroupConfigSpec", propOrder = {"configVersion", "name", "numPorts", "portNameFormat", "defaultPortConfig", "description", "type", "backingType", "scope", "policy", "vendorSpecificConfig", "autoExpand", "vmVnicNetworkResourcePoolKey", "transportZoneUuid", "transportZoneName", "logicalSwitchUuid", "segmentId"})
public class DVPortgroupConfigSpec extends DynamicData {
  protected String configVersion;
  
  protected String name;
  
  protected Integer numPorts;
  
  protected String portNameFormat;
  
  protected DVPortSetting defaultPortConfig;
  
  protected String description;
  
  protected String type;
  
  protected String backingType;
  
  protected List<ManagedObjectReference> scope;
  
  protected DVPortgroupPolicy policy;
  
  protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
  
  protected Boolean autoExpand;
  
  protected String vmVnicNetworkResourcePoolKey;
  
  protected String transportZoneUuid;
  
  protected String transportZoneName;
  
  protected String logicalSwitchUuid;
  
  protected String segmentId;
  
  public String getConfigVersion() {
    return this.configVersion;
  }
  
  public void setConfigVersion(String paramString) {
    this.configVersion = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Integer getNumPorts() {
    return this.numPorts;
  }
  
  public void setNumPorts(Integer paramInteger) {
    this.numPorts = paramInteger;
  }
  
  public String getPortNameFormat() {
    return this.portNameFormat;
  }
  
  public void setPortNameFormat(String paramString) {
    this.portNameFormat = paramString;
  }
  
  public DVPortSetting getDefaultPortConfig() {
    return this.defaultPortConfig;
  }
  
  public void setDefaultPortConfig(DVPortSetting paramDVPortSetting) {
    this.defaultPortConfig = paramDVPortSetting;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getBackingType() {
    return this.backingType;
  }
  
  public void setBackingType(String paramString) {
    this.backingType = paramString;
  }
  
  public List<ManagedObjectReference> getScope() {
    if (this.scope == null)
      this.scope = new ArrayList<>(); 
    return this.scope;
  }
  
  public DVPortgroupPolicy getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(DVPortgroupPolicy paramDVPortgroupPolicy) {
    this.policy = paramDVPortgroupPolicy;
  }
  
  public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
    if (this.vendorSpecificConfig == null)
      this.vendorSpecificConfig = new ArrayList<>(); 
    return this.vendorSpecificConfig;
  }
  
  public Boolean isAutoExpand() {
    return this.autoExpand;
  }
  
  public void setAutoExpand(Boolean paramBoolean) {
    this.autoExpand = paramBoolean;
  }
  
  public String getVmVnicNetworkResourcePoolKey() {
    return this.vmVnicNetworkResourcePoolKey;
  }
  
  public void setVmVnicNetworkResourcePoolKey(String paramString) {
    this.vmVnicNetworkResourcePoolKey = paramString;
  }
  
  public String getTransportZoneUuid() {
    return this.transportZoneUuid;
  }
  
  public void setTransportZoneUuid(String paramString) {
    this.transportZoneUuid = paramString;
  }
  
  public String getTransportZoneName() {
    return this.transportZoneName;
  }
  
  public void setTransportZoneName(String paramString) {
    this.transportZoneName = paramString;
  }
  
  public String getLogicalSwitchUuid() {
    return this.logicalSwitchUuid;
  }
  
  public void setLogicalSwitchUuid(String paramString) {
    this.logicalSwitchUuid = paramString;
  }
  
  public String getSegmentId() {
    return this.segmentId;
  }
  
  public void setSegmentId(String paramString) {
    this.segmentId = paramString;
  }
}
