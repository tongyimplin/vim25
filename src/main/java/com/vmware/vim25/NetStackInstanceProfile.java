package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.IpRouteProfile;
import com.vmware.vim25.NetStackInstanceProfile;
import com.vmware.vim25.NetworkProfileDnsConfigProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetStackInstanceProfile", propOrder = {"key", "dnsConfig", "ipRouteConfig"})
public class NetStackInstanceProfile extends ApplyProfile {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected NetworkProfileDnsConfigProfile dnsConfig;
  
  @XmlElement(required = true)
  protected IpRouteProfile ipRouteConfig;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
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
}
