package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.LinkProfile;
import com.vmware.vim25.NetworkPolicyProfile;
import com.vmware.vim25.NumPortsProfile;
import com.vmware.vim25.VirtualSwitchProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSwitchProfile", propOrder = {"key", "name", "link", "numPorts", "networkPolicy"})
public class VirtualSwitchProfile extends ApplyProfile {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected LinkProfile link;
  
  @XmlElement(required = true)
  protected NumPortsProfile numPorts;
  
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
  
  public LinkProfile getLink() {
    return this.link;
  }
  
  public void setLink(LinkProfile paramLinkProfile) {
    this.link = paramLinkProfile;
  }
  
  public NumPortsProfile getNumPorts() {
    return this.numPorts;
  }
  
  public void setNumPorts(NumPortsProfile paramNumPortsProfile) {
    this.numPorts = paramNumPortsProfile;
  }
  
  public NetworkPolicyProfile getNetworkPolicy() {
    return this.networkPolicy;
  }
  
  public void setNetworkPolicy(NetworkPolicyProfile paramNetworkPolicyProfile) {
    this.networkPolicy = paramNetworkPolicyProfile;
  }
}
