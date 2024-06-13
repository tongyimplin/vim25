package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDhcpService;
import com.vmware.vim25.HostDnsConfig;
import com.vmware.vim25.HostIpRouteConfig;
import com.vmware.vim25.HostIpRouteTableInfo;
import com.vmware.vim25.HostNatService;
import com.vmware.vim25.HostNetStackInstance;
import com.vmware.vim25.HostNetworkInfo;
import com.vmware.vim25.HostOpaqueNetworkInfo;
import com.vmware.vim25.HostOpaqueSwitch;
import com.vmware.vim25.HostPortGroup;
import com.vmware.vim25.HostProxySwitch;
import com.vmware.vim25.HostRdmaDevice;
import com.vmware.vim25.HostVirtualNic;
import com.vmware.vim25.HostVirtualSwitch;
import com.vmware.vim25.PhysicalNic;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkInfo", propOrder = {"vswitch", "proxySwitch", "portgroup", "pnic", "rdmaDevice", "vnic", "consoleVnic", "dnsConfig", "ipRouteConfig", "consoleIpRouteConfig", "routeTableInfo", "dhcp", "nat", "ipV6Enabled", "atBootIpV6Enabled", "netStackInstance", "opaqueSwitch", "opaqueNetwork", "nsxTransportNodeId"})
public class HostNetworkInfo extends DynamicData {
  protected List<HostVirtualSwitch> vswitch;
  
  protected List<HostProxySwitch> proxySwitch;
  
  protected List<HostPortGroup> portgroup;
  
  protected List<PhysicalNic> pnic;
  
  protected List<HostRdmaDevice> rdmaDevice;
  
  protected List<HostVirtualNic> vnic;
  
  protected List<HostVirtualNic> consoleVnic;
  
  protected HostDnsConfig dnsConfig;
  
  protected HostIpRouteConfig ipRouteConfig;
  
  protected HostIpRouteConfig consoleIpRouteConfig;
  
  protected HostIpRouteTableInfo routeTableInfo;
  
  protected List<HostDhcpService> dhcp;
  
  protected List<HostNatService> nat;
  
  protected Boolean ipV6Enabled;
  
  protected Boolean atBootIpV6Enabled;
  
  protected List<HostNetStackInstance> netStackInstance;
  
  protected List<HostOpaqueSwitch> opaqueSwitch;
  
  protected List<HostOpaqueNetworkInfo> opaqueNetwork;
  
  protected String nsxTransportNodeId;
  
  public List<HostVirtualSwitch> getVswitch() {
    if (this.vswitch == null)
      this.vswitch = new ArrayList<>(); 
    return this.vswitch;
  }
  
  public List<HostProxySwitch> getProxySwitch() {
    if (this.proxySwitch == null)
      this.proxySwitch = new ArrayList<>(); 
    return this.proxySwitch;
  }
  
  public List<HostPortGroup> getPortgroup() {
    if (this.portgroup == null)
      this.portgroup = new ArrayList<>(); 
    return this.portgroup;
  }
  
  public List<PhysicalNic> getPnic() {
    if (this.pnic == null)
      this.pnic = new ArrayList<>(); 
    return this.pnic;
  }
  
  public List<HostRdmaDevice> getRdmaDevice() {
    if (this.rdmaDevice == null)
      this.rdmaDevice = new ArrayList<>(); 
    return this.rdmaDevice;
  }
  
  public List<HostVirtualNic> getVnic() {
    if (this.vnic == null)
      this.vnic = new ArrayList<>(); 
    return this.vnic;
  }
  
  public List<HostVirtualNic> getConsoleVnic() {
    if (this.consoleVnic == null)
      this.consoleVnic = new ArrayList<>(); 
    return this.consoleVnic;
  }
  
  public HostDnsConfig getDnsConfig() {
    return this.dnsConfig;
  }
  
  public void setDnsConfig(HostDnsConfig paramHostDnsConfig) {
    this.dnsConfig = paramHostDnsConfig;
  }
  
  public HostIpRouteConfig getIpRouteConfig() {
    return this.ipRouteConfig;
  }
  
  public void setIpRouteConfig(HostIpRouteConfig paramHostIpRouteConfig) {
    this.ipRouteConfig = paramHostIpRouteConfig;
  }
  
  public HostIpRouteConfig getConsoleIpRouteConfig() {
    return this.consoleIpRouteConfig;
  }
  
  public void setConsoleIpRouteConfig(HostIpRouteConfig paramHostIpRouteConfig) {
    this.consoleIpRouteConfig = paramHostIpRouteConfig;
  }
  
  public HostIpRouteTableInfo getRouteTableInfo() {
    return this.routeTableInfo;
  }
  
  public void setRouteTableInfo(HostIpRouteTableInfo paramHostIpRouteTableInfo) {
    this.routeTableInfo = paramHostIpRouteTableInfo;
  }
  
  public List<HostDhcpService> getDhcp() {
    if (this.dhcp == null)
      this.dhcp = new ArrayList<>(); 
    return this.dhcp;
  }
  
  public List<HostNatService> getNat() {
    if (this.nat == null)
      this.nat = new ArrayList<>(); 
    return this.nat;
  }
  
  public Boolean isIpV6Enabled() {
    return this.ipV6Enabled;
  }
  
  public void setIpV6Enabled(Boolean paramBoolean) {
    this.ipV6Enabled = paramBoolean;
  }
  
  public Boolean isAtBootIpV6Enabled() {
    return this.atBootIpV6Enabled;
  }
  
  public void setAtBootIpV6Enabled(Boolean paramBoolean) {
    this.atBootIpV6Enabled = paramBoolean;
  }
  
  public List<HostNetStackInstance> getNetStackInstance() {
    if (this.netStackInstance == null)
      this.netStackInstance = new ArrayList<>(); 
    return this.netStackInstance;
  }
  
  public List<HostOpaqueSwitch> getOpaqueSwitch() {
    if (this.opaqueSwitch == null)
      this.opaqueSwitch = new ArrayList<>(); 
    return this.opaqueSwitch;
  }
  
  public List<HostOpaqueNetworkInfo> getOpaqueNetwork() {
    if (this.opaqueNetwork == null)
      this.opaqueNetwork = new ArrayList<>(); 
    return this.opaqueNetwork;
  }
  
  public String getNsxTransportNodeId() {
    return this.nsxTransportNodeId;
  }
  
  public void setNsxTransportNodeId(String paramString) {
    this.nsxTransportNodeId = paramString;
  }
}
