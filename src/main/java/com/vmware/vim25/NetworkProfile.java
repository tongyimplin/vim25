package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.DvsHostVNicProfile;
import com.vmware.vim25.DvsProfile;
import com.vmware.vim25.DvsServiceConsoleVNicProfile;
import com.vmware.vim25.HostPortGroupProfile;
import com.vmware.vim25.IpRouteProfile;
import com.vmware.vim25.NetStackInstanceProfile;
import com.vmware.vim25.NetworkProfile;
import com.vmware.vim25.NetworkProfileDnsConfigProfile;
import com.vmware.vim25.NsxHostVNicProfile;
import com.vmware.vim25.OpaqueSwitchProfile;
import com.vmware.vim25.PhysicalNicProfile;
import com.vmware.vim25.ServiceConsolePortGroupProfile;
import com.vmware.vim25.VirtualSwitchProfile;
import com.vmware.vim25.VmPortGroupProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkProfile", propOrder = {"vswitch", "vmPortGroup", "hostPortGroup", "serviceConsolePortGroup", "dnsConfig", "ipRouteConfig", "consoleIpRouteConfig", "pnic", "dvswitch", "dvsServiceConsoleNic", "dvsHostNic", "nsxHostNic", "netStackInstance", "opaqueSwitch"})
public class NetworkProfile extends ApplyProfile {
  protected List<VirtualSwitchProfile> vswitch;
  
  protected List<VmPortGroupProfile> vmPortGroup;
  
  protected List<HostPortGroupProfile> hostPortGroup;
  
  protected List<ServiceConsolePortGroupProfile> serviceConsolePortGroup;
  
  protected NetworkProfileDnsConfigProfile dnsConfig;
  
  protected IpRouteProfile ipRouteConfig;
  
  protected IpRouteProfile consoleIpRouteConfig;
  
  protected List<PhysicalNicProfile> pnic;
  
  protected List<DvsProfile> dvswitch;
  
  protected List<DvsServiceConsoleVNicProfile> dvsServiceConsoleNic;
  
  protected List<DvsHostVNicProfile> dvsHostNic;
  
  protected List<NsxHostVNicProfile> nsxHostNic;
  
  protected List<NetStackInstanceProfile> netStackInstance;
  
  protected OpaqueSwitchProfile opaqueSwitch;
  
  public List<VirtualSwitchProfile> getVswitch() {
    if (this.vswitch == null)
      this.vswitch = new ArrayList<>(); 
    return this.vswitch;
  }
  
  public List<VmPortGroupProfile> getVmPortGroup() {
    if (this.vmPortGroup == null)
      this.vmPortGroup = new ArrayList<>(); 
    return this.vmPortGroup;
  }
  
  public List<HostPortGroupProfile> getHostPortGroup() {
    if (this.hostPortGroup == null)
      this.hostPortGroup = new ArrayList<>(); 
    return this.hostPortGroup;
  }
  
  public List<ServiceConsolePortGroupProfile> getServiceConsolePortGroup() {
    if (this.serviceConsolePortGroup == null)
      this.serviceConsolePortGroup = new ArrayList<>(); 
    return this.serviceConsolePortGroup;
  }
  
  public NetworkProfileDnsConfigProfile getDnsConfig() {
    return this.dnsConfig;
  }
  
  public void setDnsConfig(NetworkProfileDnsConfigProfile paramNetworkProfileDnsConfigProfile) {
    this.dnsConfig = paramNetworkProfileDnsConfigProfile;
  }
  
  public IpRouteProfile getIpRouteConfig() {
    return this.ipRouteConfig;
  }
  
  public void setIpRouteConfig(IpRouteProfile paramIpRouteProfile) {
    this.ipRouteConfig = paramIpRouteProfile;
  }
  
  public IpRouteProfile getConsoleIpRouteConfig() {
    return this.consoleIpRouteConfig;
  }
  
  public void setConsoleIpRouteConfig(IpRouteProfile paramIpRouteProfile) {
    this.consoleIpRouteConfig = paramIpRouteProfile;
  }
  
  public List<PhysicalNicProfile> getPnic() {
    if (this.pnic == null)
      this.pnic = new ArrayList<>(); 
    return this.pnic;
  }
  
  public List<DvsProfile> getDvswitch() {
    if (this.dvswitch == null)
      this.dvswitch = new ArrayList<>(); 
    return this.dvswitch;
  }
  
  public List<DvsServiceConsoleVNicProfile> getDvsServiceConsoleNic() {
    if (this.dvsServiceConsoleNic == null)
      this.dvsServiceConsoleNic = new ArrayList<>(); 
    return this.dvsServiceConsoleNic;
  }
  
  public List<DvsHostVNicProfile> getDvsHostNic() {
    if (this.dvsHostNic == null)
      this.dvsHostNic = new ArrayList<>(); 
    return this.dvsHostNic;
  }
  
  public List<NsxHostVNicProfile> getNsxHostNic() {
    if (this.nsxHostNic == null)
      this.nsxHostNic = new ArrayList<>(); 
    return this.nsxHostNic;
  }
  
  public List<NetStackInstanceProfile> getNetStackInstance() {
    if (this.netStackInstance == null)
      this.netStackInstance = new ArrayList<>(); 
    return this.netStackInstance;
  }
  
  public OpaqueSwitchProfile getOpaqueSwitch() {
    return this.opaqueSwitch;
  }
  
  public void setOpaqueSwitch(OpaqueSwitchProfile paramOpaqueSwitchProfile) {
    this.opaqueSwitch = paramOpaqueSwitchProfile;
  }
}
