package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDhcpServiceConfig;
import com.vmware.vim25.HostDnsConfig;
import com.vmware.vim25.HostIpRouteConfig;
import com.vmware.vim25.HostIpRouteTableConfig;
import com.vmware.vim25.HostNatServiceConfig;
import com.vmware.vim25.HostNetworkConfig;
import com.vmware.vim25.HostNetworkConfigNetStackSpec;
import com.vmware.vim25.HostPortGroupConfig;
import com.vmware.vim25.HostProxySwitchConfig;
import com.vmware.vim25.HostVirtualNicConfig;
import com.vmware.vim25.HostVirtualSwitchConfig;
import com.vmware.vim25.PhysicalNicConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetworkConfig", propOrder = {"vswitch", "proxySwitch", "portgroup", "pnic", "vnic", "consoleVnic", "dnsConfig", "ipRouteConfig", "consoleIpRouteConfig", "routeTableConfig", "dhcp", "nat", "ipV6Enabled", "netStackSpec"})
public class HostNetworkConfig extends DynamicData {
  protected List<HostVirtualSwitchConfig> vswitch;
  
  protected List<HostProxySwitchConfig> proxySwitch;
  
  protected List<HostPortGroupConfig> portgroup;
  
  protected List<PhysicalNicConfig> pnic;
  
  protected List<HostVirtualNicConfig> vnic;
  
  protected List<HostVirtualNicConfig> consoleVnic;
  
  protected HostDnsConfig dnsConfig;
  
  protected HostIpRouteConfig ipRouteConfig;
  
  protected HostIpRouteConfig consoleIpRouteConfig;
  
  protected HostIpRouteTableConfig routeTableConfig;
  
  protected List<HostDhcpServiceConfig> dhcp;
  
  protected List<HostNatServiceConfig> nat;
  
  protected Boolean ipV6Enabled;
  
  protected List<HostNetworkConfigNetStackSpec> netStackSpec;
  
  public List<HostVirtualSwitchConfig> getVswitch() {
    if (this.vswitch == null)
      this.vswitch = new ArrayList<>(); 
    return this.vswitch;
  }
  
  public List<HostProxySwitchConfig> getProxySwitch() {
    if (this.proxySwitch == null)
      this.proxySwitch = new ArrayList<>(); 
    return this.proxySwitch;
  }
  
  public List<HostPortGroupConfig> getPortgroup() {
    if (this.portgroup == null)
      this.portgroup = new ArrayList<>(); 
    return this.portgroup;
  }
  
  public List<PhysicalNicConfig> getPnic() {
    if (this.pnic == null)
      this.pnic = new ArrayList<>(); 
    return this.pnic;
  }
  
  public List<HostVirtualNicConfig> getVnic() {
    if (this.vnic == null)
      this.vnic = new ArrayList<>(); 
    return this.vnic;
  }
  
  public List<HostVirtualNicConfig> getConsoleVnic() {
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
  
  public HostIpRouteTableConfig getRouteTableConfig() {
    return this.routeTableConfig;
  }
  
  public void setRouteTableConfig(HostIpRouteTableConfig paramHostIpRouteTableConfig) {
    this.routeTableConfig = paramHostIpRouteTableConfig;
  }
  
  public List<HostDhcpServiceConfig> getDhcp() {
    if (this.dhcp == null)
      this.dhcp = new ArrayList<>(); 
    return this.dhcp;
  }
  
  public List<HostNatServiceConfig> getNat() {
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
  
  public List<HostNetworkConfigNetStackSpec> getNetStackSpec() {
    if (this.netStackSpec == null)
      this.netStackSpec = new ArrayList<>(); 
    return this.netStackSpec;
  }
}
