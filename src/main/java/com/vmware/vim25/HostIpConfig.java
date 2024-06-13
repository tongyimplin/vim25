package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpConfig;
import com.vmware.vim25.HostIpConfigIpV6AddressConfiguration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpConfig", propOrder = {"dhcp", "ipAddress", "subnetMask", "ipV6Config"})
public class HostIpConfig extends DynamicData {
  protected boolean dhcp;
  
  protected String ipAddress;
  
  protected String subnetMask;
  
  protected HostIpConfigIpV6AddressConfiguration ipV6Config;
  
  public boolean isDhcp() {
    return this.dhcp;
  }
  
  public void setDhcp(boolean paramBoolean) {
    this.dhcp = paramBoolean;
  }
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
  
  public String getSubnetMask() {
    return this.subnetMask;
  }
  
  public void setSubnetMask(String paramString) {
    this.subnetMask = paramString;
  }
  
  public HostIpConfigIpV6AddressConfiguration getIpV6Config() {
    return this.ipV6Config;
  }
  
  public void setIpV6Config(HostIpConfigIpV6AddressConfiguration paramHostIpConfigIpV6AddressConfiguration) {
    this.ipV6Config = paramHostIpConfigIpV6AddressConfiguration;
  }
}
