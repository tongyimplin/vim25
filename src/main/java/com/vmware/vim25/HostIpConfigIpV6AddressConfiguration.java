package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpConfigIpV6Address;
import com.vmware.vim25.HostIpConfigIpV6AddressConfiguration;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpConfigIpV6AddressConfiguration", propOrder = {"ipV6Address", "autoConfigurationEnabled", "dhcpV6Enabled"})
public class HostIpConfigIpV6AddressConfiguration extends DynamicData {
  protected List<HostIpConfigIpV6Address> ipV6Address;
  
  protected Boolean autoConfigurationEnabled;
  
  protected Boolean dhcpV6Enabled;
  
  public List<HostIpConfigIpV6Address> getIpV6Address() {
    if (this.ipV6Address == null)
      this.ipV6Address = new ArrayList<>(); 
    return this.ipV6Address;
  }
  
  public Boolean isAutoConfigurationEnabled() {
    return this.autoConfigurationEnabled;
  }
  
  public void setAutoConfigurationEnabled(Boolean paramBoolean) {
    this.autoConfigurationEnabled = paramBoolean;
  }
  
  public Boolean isDhcpV6Enabled() {
    return this.dhcpV6Enabled;
  }
  
  public void setDhcpV6Enabled(Boolean paramBoolean) {
    this.dhcpV6Enabled = paramBoolean;
  }
}
