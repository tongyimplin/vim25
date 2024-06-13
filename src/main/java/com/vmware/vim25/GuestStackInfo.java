package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestStackInfo;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.NetDhcpConfigInfo;
import com.vmware.vim25.NetDnsConfigInfo;
import com.vmware.vim25.NetIpRouteConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestStackInfo", propOrder = {"dnsConfig", "ipRouteConfig", "ipStackConfig", "dhcpConfig"})
public class GuestStackInfo extends DynamicData {
  protected NetDnsConfigInfo dnsConfig;
  
  protected NetIpRouteConfigInfo ipRouteConfig;
  
  protected List<KeyValue> ipStackConfig;
  
  protected NetDhcpConfigInfo dhcpConfig;
  
  public NetDnsConfigInfo getDnsConfig() {
    return this.dnsConfig;
  }
  
  public void setDnsConfig(NetDnsConfigInfo paramNetDnsConfigInfo) {
    this.dnsConfig = paramNetDnsConfigInfo;
  }
  
  public NetIpRouteConfigInfo getIpRouteConfig() {
    return this.ipRouteConfig;
  }
  
  public void setIpRouteConfig(NetIpRouteConfigInfo paramNetIpRouteConfigInfo) {
    this.ipRouteConfig = paramNetIpRouteConfigInfo;
  }
  
  public List<KeyValue> getIpStackConfig() {
    if (this.ipStackConfig == null)
      this.ipStackConfig = new ArrayList<>(); 
    return this.ipStackConfig;
  }
  
  public NetDhcpConfigInfo getDhcpConfig() {
    return this.dhcpConfig;
  }
  
  public void setDhcpConfig(NetDhcpConfigInfo paramNetDhcpConfigInfo) {
    this.dhcpConfig = paramNetDhcpConfigInfo;
  }
}
