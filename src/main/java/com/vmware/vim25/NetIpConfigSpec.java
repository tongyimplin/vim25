package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetDhcpConfigSpec;
import com.vmware.vim25.NetIpConfigSpec;
import com.vmware.vim25.NetIpConfigSpecIpAddressSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpConfigSpec", propOrder = {"ipAddress", "dhcp", "autoConfigurationEnabled"})
public class NetIpConfigSpec extends DynamicData {
  protected List<NetIpConfigSpecIpAddressSpec> ipAddress;
  
  protected NetDhcpConfigSpec dhcp;
  
  protected Boolean autoConfigurationEnabled;
  
  public List<NetIpConfigSpecIpAddressSpec> getIpAddress() {
    if (this.ipAddress == null)
      this.ipAddress = new ArrayList<>(); 
    return this.ipAddress;
  }
  
  public NetDhcpConfigSpec getDhcp() {
    return this.dhcp;
  }
  
  public void setDhcp(NetDhcpConfigSpec paramNetDhcpConfigSpec) {
    this.dhcp = paramNetDhcpConfigSpec;
  }
  
  public Boolean isAutoConfigurationEnabled() {
    return this.autoConfigurationEnabled;
  }
  
  public void setAutoConfigurationEnabled(Boolean paramBoolean) {
    this.autoConfigurationEnabled = paramBoolean;
  }
}
