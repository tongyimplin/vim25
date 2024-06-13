package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.HostPortGroupProfile;
import com.vmware.vim25.NetworkPolicyProfile;
import com.vmware.vim25.PortGroupProfile;
import com.vmware.vim25.ServiceConsolePortGroupProfile;
import com.vmware.vim25.VirtualSwitchSelectionProfile;
import com.vmware.vim25.VlanProfile;
import com.vmware.vim25.VmPortGroupProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortGroupProfile", propOrder = {"key", "name", "vlan", "vswitch", "networkPolicy"})
@XmlSeeAlso({HostPortGroupProfile.class, ServiceConsolePortGroupProfile.class, VmPortGroupProfile.class})
public class PortGroupProfile extends ApplyProfile {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected VlanProfile vlan;
  
  @XmlElement(required = true)
  protected VirtualSwitchSelectionProfile vswitch;
  
  @XmlElement(required = true)
  protected NetworkPolicyProfile networkPolicy;
  
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
  
  public VlanProfile getVlan() {
    return this.vlan;
  }
  
  public void setVlan(VlanProfile paramVlanProfile) {
    this.vlan = paramVlanProfile;
  }
  
  public VirtualSwitchSelectionProfile getVswitch() {
    return this.vswitch;
  }
  
  public void setVswitch(VirtualSwitchSelectionProfile paramVirtualSwitchSelectionProfile) {
    this.vswitch = paramVirtualSwitchSelectionProfile;
  }
  
  public NetworkPolicyProfile getNetworkPolicy() {
    return this.networkPolicy;
  }
  
  public void setNetworkPolicy(NetworkPolicyProfile paramNetworkPolicyProfile) {
    this.networkPolicy = paramNetworkPolicyProfile;
  }
}
