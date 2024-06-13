package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetDhcpConfigInfo;
import com.vmware.vim25.NetIpConfigInfo;
import com.vmware.vim25.NetIpConfigInfoIpAddress;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpConfigInfo", propOrder = {"ipAddress", "dhcp", "autoConfigurationEnabled"})
public class NetIpConfigInfo extends DynamicData {
  protected List<NetIpConfigInfoIpAddress> ipAddress;
  
  protected NetDhcpConfigInfo dhcp;
  
  protected Boolean autoConfigurationEnabled;
  
  public List<NetIpConfigInfoIpAddress> getIpAddress() {
    if (this.ipAddress == null)
      this.ipAddress = new ArrayList<>(); 
    return this.ipAddress;
  }
  
  public NetDhcpConfigInfo getDhcp() {
    return this.dhcp;
  }
  
  public void setDhcp(NetDhcpConfigInfo paramNetDhcpConfigInfo) {
    this.dhcp = paramNetDhcpConfigInfo;
  }
  
  public Boolean isAutoConfigurationEnabled() {
    return this.autoConfigurationEnabled;
  }
  
  public void setAutoConfigurationEnabled(Boolean paramBoolean) {
    this.autoConfigurationEnabled = paramBoolean;
  }
}
