package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetDhcpConfigSpec;
import com.vmware.vim25.NetDhcpConfigSpecDhcpOptionsSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDhcpConfigSpec", propOrder = {"ipv6", "ipv4"})
public class NetDhcpConfigSpec extends DynamicData {
  protected NetDhcpConfigSpecDhcpOptionsSpec ipv6;
  
  protected NetDhcpConfigSpecDhcpOptionsSpec ipv4;
  
  public NetDhcpConfigSpecDhcpOptionsSpec getIpv6() {
    return this.ipv6;
  }
  
  public void setIpv6(NetDhcpConfigSpecDhcpOptionsSpec paramNetDhcpConfigSpecDhcpOptionsSpec) {
    this.ipv6 = paramNetDhcpConfigSpecDhcpOptionsSpec;
  }
  
  public NetDhcpConfigSpecDhcpOptionsSpec getIpv4() {
    return this.ipv4;
  }
  
  public void setIpv4(NetDhcpConfigSpecDhcpOptionsSpec paramNetDhcpConfigSpecDhcpOptionsSpec) {
    this.ipv4 = paramNetDhcpConfigSpecDhcpOptionsSpec;
  }
}
