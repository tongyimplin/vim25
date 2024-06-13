package com.vmware.vim25;

import com.vmware.vim25.DVPortSetting;
import com.vmware.vim25.DVSConfigSpec;
import com.vmware.vim25.DVSContactInfo;
import com.vmware.vim25.DVSPolicy;
import com.vmware.vim25.DVSUplinkPortPolicy;
import com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec;
import com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob;
import com.vmware.vim25.DvsHostInfrastructureTrafficResource;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VMwareDVSConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSConfigSpec", propOrder = {"configVersion", "name", "numStandalonePorts", "maxPorts", "uplinkPortPolicy", "uplinkPortgroup", "defaultPortConfig", "host", "extensionKey", "description", "policy", "vendorSpecificConfig", "contact", "switchIpAddress", "defaultProxySwitchMaxNumPorts", "infrastructureTrafficResourceConfig", "netResourcePoolTrafficResourceConfig", "networkResourceControlVersion"})
@XmlSeeAlso({VMwareDVSConfigSpec.class})
public class DVSConfigSpec extends DynamicData {
  protected String configVersion;
  
  protected String name;
  
  protected Integer numStandalonePorts;
  
  protected Integer maxPorts;
  
  protected DVSUplinkPortPolicy uplinkPortPolicy;
  
  protected List<ManagedObjectReference> uplinkPortgroup;
  
  protected DVPortSetting defaultPortConfig;
  
  protected List<DistributedVirtualSwitchHostMemberConfigSpec> host;
  
  protected String extensionKey;
  
  protected String description;
  
  protected DVSPolicy policy;
  
  protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
  
  protected DVSContactInfo contact;
  
  protected String switchIpAddress;
  
  protected Integer defaultProxySwitchMaxNumPorts;
  
  protected List<DvsHostInfrastructureTrafficResource> infrastructureTrafficResourceConfig;
  
  protected List<DvsHostInfrastructureTrafficResource> netResourcePoolTrafficResourceConfig;
  
  protected String networkResourceControlVersion;
  
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
  
  public Integer getNumStandalonePorts() {
    return this.numStandalonePorts;
  }
  
  public void setNumStandalonePorts(Integer paramInteger) {
    this.numStandalonePorts = paramInteger;
  }
  
  public Integer getMaxPorts() {
    return this.maxPorts;
  }
  
  public void setMaxPorts(Integer paramInteger) {
    this.maxPorts = paramInteger;
  }
  
  public DVSUplinkPortPolicy getUplinkPortPolicy() {
    return this.uplinkPortPolicy;
  }
  
  public void setUplinkPortPolicy(DVSUplinkPortPolicy paramDVSUplinkPortPolicy) {
    this.uplinkPortPolicy = paramDVSUplinkPortPolicy;
  }
  
  public List<ManagedObjectReference> getUplinkPortgroup() {
    if (this.uplinkPortgroup == null)
      this.uplinkPortgroup = new ArrayList<>(); 
    return this.uplinkPortgroup;
  }
  
  public DVPortSetting getDefaultPortConfig() {
    return this.defaultPortConfig;
  }
  
  public void setDefaultPortConfig(DVPortSetting paramDVPortSetting) {
    this.defaultPortConfig = paramDVPortSetting;
  }
  
  public List<DistributedVirtualSwitchHostMemberConfigSpec> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
  
  public String getExtensionKey() {
    return this.extensionKey;
  }
  
  public void setExtensionKey(String paramString) {
    this.extensionKey = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public DVSPolicy getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(DVSPolicy paramDVSPolicy) {
    this.policy = paramDVSPolicy;
  }
  
  public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
    if (this.vendorSpecificConfig == null)
      this.vendorSpecificConfig = new ArrayList<>(); 
    return this.vendorSpecificConfig;
  }
  
  public DVSContactInfo getContact() {
    return this.contact;
  }
  
  public void setContact(DVSContactInfo paramDVSContactInfo) {
    this.contact = paramDVSContactInfo;
  }
  
  public String getSwitchIpAddress() {
    return this.switchIpAddress;
  }
  
  public void setSwitchIpAddress(String paramString) {
    this.switchIpAddress = paramString;
  }
  
  public Integer getDefaultProxySwitchMaxNumPorts() {
    return this.defaultProxySwitchMaxNumPorts;
  }
  
  public void setDefaultProxySwitchMaxNumPorts(Integer paramInteger) {
    this.defaultProxySwitchMaxNumPorts = paramInteger;
  }
  
  public List<DvsHostInfrastructureTrafficResource> getInfrastructureTrafficResourceConfig() {
    if (this.infrastructureTrafficResourceConfig == null)
      this.infrastructureTrafficResourceConfig = new ArrayList<>(); 
    return this.infrastructureTrafficResourceConfig;
  }
  
  public List<DvsHostInfrastructureTrafficResource> getNetResourcePoolTrafficResourceConfig() {
    if (this.netResourcePoolTrafficResourceConfig == null)
      this.netResourcePoolTrafficResourceConfig = new ArrayList<>(); 
    return this.netResourcePoolTrafficResourceConfig;
  }
  
  public String getNetworkResourceControlVersion() {
    return this.networkResourceControlVersion;
  }
  
  public void setNetworkResourceControlVersion(String paramString) {
    this.networkResourceControlVersion = paramString;
  }
}
