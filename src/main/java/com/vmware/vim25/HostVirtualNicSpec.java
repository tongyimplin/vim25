package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortConnection;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpConfig;
import com.vmware.vim25.HostVirtualNicIpRouteSpec;
import com.vmware.vim25.HostVirtualNicOpaqueNetworkSpec;
import com.vmware.vim25.HostVirtualNicSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualNicSpec", propOrder = {"ip", "mac", "distributedVirtualPort", "portgroup", "mtu", "tsoEnabled", "netStackInstanceKey", "opaqueNetwork", "externalId", "pinnedPnic", "ipRouteSpec", "systemOwned"})
public class HostVirtualNicSpec extends DynamicData {
  protected HostIpConfig ip;
  
  protected String mac;
  
  protected DistributedVirtualSwitchPortConnection distributedVirtualPort;
  
  protected String portgroup;
  
  protected Integer mtu;
  
  protected Boolean tsoEnabled;
  
  protected String netStackInstanceKey;
  
  protected HostVirtualNicOpaqueNetworkSpec opaqueNetwork;
  
  protected String externalId;
  
  protected String pinnedPnic;
  
  protected HostVirtualNicIpRouteSpec ipRouteSpec;
  
  protected Boolean systemOwned;
  
  public HostIpConfig getIp() {
    return this.ip;
  }
  
  public void setIp(HostIpConfig paramHostIpConfig) {
    this.ip = paramHostIpConfig;
  }
  
  public String getMac() {
    return this.mac;
  }
  
  public void setMac(String paramString) {
    this.mac = paramString;
  }
  
  public DistributedVirtualSwitchPortConnection getDistributedVirtualPort() {
    return this.distributedVirtualPort;
  }
  
  public void setDistributedVirtualPort(DistributedVirtualSwitchPortConnection paramDistributedVirtualSwitchPortConnection) {
    this.distributedVirtualPort = paramDistributedVirtualSwitchPortConnection;
  }
  
  public String getPortgroup() {
    return this.portgroup;
  }
  
  public void setPortgroup(String paramString) {
    this.portgroup = paramString;
  }
  
  public Integer getMtu() {
    return this.mtu;
  }
  
  public void setMtu(Integer paramInteger) {
    this.mtu = paramInteger;
  }
  
  public Boolean isTsoEnabled() {
    return this.tsoEnabled;
  }
  
  public void setTsoEnabled(Boolean paramBoolean) {
    this.tsoEnabled = paramBoolean;
  }
  
  public String getNetStackInstanceKey() {
    return this.netStackInstanceKey;
  }
  
  public void setNetStackInstanceKey(String paramString) {
    this.netStackInstanceKey = paramString;
  }
  
  public HostVirtualNicOpaqueNetworkSpec getOpaqueNetwork() {
    return this.opaqueNetwork;
  }
  
  public void setOpaqueNetwork(HostVirtualNicOpaqueNetworkSpec paramHostVirtualNicOpaqueNetworkSpec) {
    this.opaqueNetwork = paramHostVirtualNicOpaqueNetworkSpec;
  }
  
  public String getExternalId() {
    return this.externalId;
  }
  
  public void setExternalId(String paramString) {
    this.externalId = paramString;
  }
  
  public String getPinnedPnic() {
    return this.pinnedPnic;
  }
  
  public void setPinnedPnic(String paramString) {
    this.pinnedPnic = paramString;
  }
  
  public HostVirtualNicIpRouteSpec getIpRouteSpec() {
    return this.ipRouteSpec;
  }
  
  public void setIpRouteSpec(HostVirtualNicIpRouteSpec paramHostVirtualNicIpRouteSpec) {
    this.ipRouteSpec = paramHostVirtualNicIpRouteSpec;
  }
  
  public Boolean isSystemOwned() {
    return this.systemOwned;
  }
  
  public void setSystemOwned(Boolean paramBoolean) {
    this.systemOwned = paramBoolean;
  }
}
