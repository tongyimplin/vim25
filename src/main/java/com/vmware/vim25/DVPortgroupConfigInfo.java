package com.vmware.vim25;

import com.vmware.vim25.DVPortSetting;
import com.vmware.vim25.DVPortgroupConfigInfo;
import com.vmware.vim25.DVPortgroupPolicy;
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
@XmlType(name = "DVPortgroupConfigInfo", propOrder = {"key", "name", "numPorts", "distributedVirtualSwitch", "defaultPortConfig", "description", "type", "backingType", "policy", "portNameFormat", "scope", "vendorSpecificConfig", "configVersion", "autoExpand", "vmVnicNetworkResourcePoolKey", "uplink", "transportZoneUuid", "transportZoneName", "logicalSwitchUuid", "segmentId"})
public class DVPortgroupConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String name;
  
  protected int numPorts;
  
  protected ManagedObjectReference distributedVirtualSwitch;
  
  protected DVPortSetting defaultPortConfig;
  
  protected String description;
  
  @XmlElement(required = true)
  protected String type;
  
  protected String backingType;
  
  @XmlElement(required = true)
  protected DVPortgroupPolicy policy;
  
  protected String portNameFormat;
  
  protected List<ManagedObjectReference> scope;
  
  protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
  
  protected String configVersion;
  
  protected Boolean autoExpand;
  
  protected String vmVnicNetworkResourcePoolKey;
  
  protected Boolean uplink;
  
  protected String transportZoneUuid;
  
  protected String transportZoneName;
  
  protected String logicalSwitchUuid;
  
  protected String segmentId;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public int getNumPorts() {
    return this.numPorts;
  }
  
  public void setNumPorts(int paramInt) {
    this.numPorts = paramInt;
  }
  
  public ManagedObjectReference getDistributedVirtualSwitch() {
    return this.distributedVirtualSwitch;
  }
  
  public void setDistributedVirtualSwitch(ManagedObjectReference paramManagedObjectReference) {
    this.distributedVirtualSwitch = paramManagedObjectReference;
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
  
  public DVPortgroupPolicy getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(DVPortgroupPolicy paramDVPortgroupPolicy) {
    this.policy = paramDVPortgroupPolicy;
  }
  
  public String getPortNameFormat() {
    return this.portNameFormat;
  }
  
  public void setPortNameFormat(String paramString) {
    this.portNameFormat = paramString;
  }
  
  public List<ManagedObjectReference> getScope() {
    if (this.scope == null)
      this.scope = new ArrayList<>(); 
    return this.scope;
  }
  
  public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
    if (this.vendorSpecificConfig == null)
      this.vendorSpecificConfig = new ArrayList<>(); 
    return this.vendorSpecificConfig;
  }
  
  public String getConfigVersion() {
    return this.configVersion;
  }
  
  public void setConfigVersion(String paramString) {
    this.configVersion = paramString;
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
  
  public Boolean isUplink() {
    return this.uplink;
  }
  
  public void setUplink(Boolean paramBoolean) {
    this.uplink = paramBoolean;
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
