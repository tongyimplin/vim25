package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IpPoolIpPoolConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpPoolIpPoolConfigInfo", propOrder = {"subnetAddress", "netmask", "gateway", "range", "dns", "dhcpServerAvailable", "ipPoolEnabled"})
public class IpPoolIpPoolConfigInfo extends DynamicData {
  protected String subnetAddress;
  
  protected String netmask;
  
  protected String gateway;
  
  protected String range;
  
  protected List<String> dns;
  
  protected Boolean dhcpServerAvailable;
  
  protected Boolean ipPoolEnabled;
  
  public String getSubnetAddress() {
    return this.subnetAddress;
  }
  
  public void setSubnetAddress(String paramString) {
    this.subnetAddress = paramString;
  }
  
  public String getNetmask() {
    return this.netmask;
  }
  
  public void setNetmask(String paramString) {
    this.netmask = paramString;
  }
  
  public String getGateway() {
    return this.gateway;
  }
  
  public void setGateway(String paramString) {
    this.gateway = paramString;
  }
  
  public String getRange() {
    return this.range;
  }
  
  public void setRange(String paramString) {
    this.range = paramString;
  }
  
  public List<String> getDns() {
    if (this.dns == null)
      this.dns = new ArrayList<>(); 
    return this.dns;
  }
  
  public Boolean isDhcpServerAvailable() {
    return this.dhcpServerAvailable;
  }
  
  public void setDhcpServerAvailable(Boolean paramBoolean) {
    this.dhcpServerAvailable = paramBoolean;
  }
  
  public Boolean isIpPoolEnabled() {
    return this.ipPoolEnabled;
  }
  
  public void setIpPoolEnabled(Boolean paramBoolean) {
    this.ipPoolEnabled = paramBoolean;
  }
}
