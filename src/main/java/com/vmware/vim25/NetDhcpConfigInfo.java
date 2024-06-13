package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetDhcpConfigInfo;
import com.vmware.vim25.NetDhcpConfigInfoDhcpOptions;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDhcpConfigInfo", propOrder = {"ipv6", "ipv4"})
public class NetDhcpConfigInfo extends DynamicData {
  protected NetDhcpConfigInfoDhcpOptions ipv6;
  
  protected NetDhcpConfigInfoDhcpOptions ipv4;
  
  public NetDhcpConfigInfoDhcpOptions getIpv6() {
    return this.ipv6;
  }
  
  public void setIpv6(NetDhcpConfigInfoDhcpOptions paramNetDhcpConfigInfoDhcpOptions) {
    this.ipv6 = paramNetDhcpConfigInfoDhcpOptions;
  }
  
  public NetDhcpConfigInfoDhcpOptions getIpv4() {
    return this.ipv4;
  }
  
  public void setIpv4(NetDhcpConfigInfoDhcpOptions paramNetDhcpConfigInfoDhcpOptions) {
    this.ipv4 = paramNetDhcpConfigInfoDhcpOptions;
  }
}
