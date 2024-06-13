package com.vmware.vim25;

import com.vmware.vim25.DVPortSetting;
import com.vmware.vim25.DVSConfigInfo;
import com.vmware.vim25.DVSContactInfo;
import com.vmware.vim25.DVSHealthCheckConfig;
import com.vmware.vim25.DVSPolicy;
import com.vmware.vim25.DVSUplinkPortPolicy;
import com.vmware.vim25.DVSVmVnicNetworkResourcePool;
import com.vmware.vim25.DistributedVirtualSwitchHostMember;
import com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob;
import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.DvsHostInfrastructureTrafficResource;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VMwareDVSConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSConfigInfo", propOrder = {"uuid", "name", "numStandalonePorts", "numPorts", "maxPorts", "uplinkPortPolicy", "uplinkPortgroup", "defaultPortConfig", "host", "productInfo", "targetInfo", "extensionKey", "vendorSpecificConfig", "policy", "description", "configVersion", "contact", "switchIpAddress", "createTime", "networkResourceManagementEnabled", "defaultProxySwitchMaxNumPorts", "healthCheckConfig", "infrastructureTrafficResourceConfig", "netResourcePoolTrafficResourceConfig", "networkResourceControlVersion", "vmVnicNetworkResourcePool", "pnicCapacityRatioForReservation"})
@XmlSeeAlso({VMwareDVSConfigInfo.class})
public class DVSConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected String uuid;
  
  @XmlElement(required = true)
  protected String name;
  
  protected int numStandalonePorts;
  
  protected int numPorts;
  
  protected int maxPorts;
  
  @XmlElement(required = true)
  protected DVSUplinkPortPolicy uplinkPortPolicy;
  
  protected List<ManagedObjectReference> uplinkPortgroup;
  
  @XmlElement(required = true)
  protected DVPortSetting defaultPortConfig;
  
  protected List<DistributedVirtualSwitchHostMember> host;
  
  @XmlElement(required = true)
  protected DistributedVirtualSwitchProductSpec productInfo;
  
  protected DistributedVirtualSwitchProductSpec targetInfo;
  
  protected String extensionKey;
  
  protected List<DistributedVirtualSwitchKeyedOpaqueBlob> vendorSpecificConfig;
  
  protected DVSPolicy policy;
  
  protected String description;
  
  @XmlElement(required = true)
  protected String configVersion;
  
  @XmlElement(required = true)
  protected DVSContactInfo contact;
  
  protected String switchIpAddress;
  
  @XmlElement(required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar createTime;
  
  protected Boolean networkResourceManagementEnabled;
  
  protected Integer defaultProxySwitchMaxNumPorts;
  
  protected List<DVSHealthCheckConfig> healthCheckConfig;
  
  protected List<DvsHostInfrastructureTrafficResource> infrastructureTrafficResourceConfig;
  
  protected List<DvsHostInfrastructureTrafficResource> netResourcePoolTrafficResourceConfig;
  
  protected String networkResourceControlVersion;
  
  protected List<DVSVmVnicNetworkResourcePool> vmVnicNetworkResourcePool;
  
  protected Integer pnicCapacityRatioForReservation;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public int getNumStandalonePorts() {
    return this.numStandalonePorts;
  }
  
  public void setNumStandalonePorts(int paramInt) {
    this.numStandalonePorts = paramInt;
  }
  
  public int getNumPorts() {
    return this.numPorts;
  }
  
  public void setNumPorts(int paramInt) {
    this.numPorts = paramInt;
  }
  
  public int getMaxPorts() {
    return this.maxPorts;
  }
  
  public void setMaxPorts(int paramInt) {
    this.maxPorts = paramInt;
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
  
  public List<DistributedVirtualSwitchHostMember> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
  
  public DistributedVirtualSwitchProductSpec getProductInfo() {
    return this.productInfo;
  }
  
  public void setProductInfo(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.productInfo = paramDistributedVirtualSwitchProductSpec;
  }
  
  public DistributedVirtualSwitchProductSpec getTargetInfo() {
    return this.targetInfo;
  }
  
  public void setTargetInfo(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.targetInfo = paramDistributedVirtualSwitchProductSpec;
  }
  
  public String getExtensionKey() {
    return this.extensionKey;
  }
  
  public void setExtensionKey(String paramString) {
    this.extensionKey = paramString;
  }
  
  public List<DistributedVirtualSwitchKeyedOpaqueBlob> getVendorSpecificConfig() {
    if (this.vendorSpecificConfig == null)
      this.vendorSpecificConfig = new ArrayList<>(); 
    return this.vendorSpecificConfig;
  }
  
  public DVSPolicy getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(DVSPolicy paramDVSPolicy) {
    this.policy = paramDVSPolicy;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public String getConfigVersion() {
    return this.configVersion;
  }
  
  public void setConfigVersion(String paramString) {
    this.configVersion = paramString;
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
  
  public XMLGregorianCalendar getCreateTime() {
    return this.createTime;
  }
  
  public void setCreateTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
    this.createTime = paramXMLGregorianCalendar;
  }
  
  public Boolean isNetworkResourceManagementEnabled() {
    return this.networkResourceManagementEnabled;
  }
  
  public void setNetworkResourceManagementEnabled(Boolean paramBoolean) {
    this.networkResourceManagementEnabled = paramBoolean;
  }
  
  public Integer getDefaultProxySwitchMaxNumPorts() {
    return this.defaultProxySwitchMaxNumPorts;
  }
  
  public void setDefaultProxySwitchMaxNumPorts(Integer paramInteger) {
    this.defaultProxySwitchMaxNumPorts = paramInteger;
  }
  
  public List<DVSHealthCheckConfig> getHealthCheckConfig() {
    if (this.healthCheckConfig == null)
      this.healthCheckConfig = new ArrayList<>(); 
    return this.healthCheckConfig;
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
  
  public List<DVSVmVnicNetworkResourcePool> getVmVnicNetworkResourcePool() {
    if (this.vmVnicNetworkResourcePool == null)
      this.vmVnicNetworkResourcePool = new ArrayList<>(); 
    return this.vmVnicNetworkResourcePool;
  }
  
  public Integer getPnicCapacityRatioForReservation() {
    return this.pnicCapacityRatioForReservation;
  }
  
  public void setPnicCapacityRatioForReservation(Integer paramInteger) {
    this.pnicCapacityRatioForReservation = paramInteger;
  }
}
