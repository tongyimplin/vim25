package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDnsConfig;
import com.vmware.vim25.HostDnsConfigSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDnsConfig", propOrder = {"dhcp", "virtualNicDevice", "ipv6VirtualNicDevice", "hostName", "domainName", "address", "searchDomain"})
@XmlSeeAlso({HostDnsConfigSpec.class})
public class HostDnsConfig extends DynamicData {
  protected boolean dhcp;
  
  protected String virtualNicDevice;
  
  protected String ipv6VirtualNicDevice;
  
  @XmlElement(required = true)
  protected String hostName;
  
  @XmlElement(required = true)
  protected String domainName;
  
  protected List<String> address;
  
  protected List<String> searchDomain;
  
  public boolean isDhcp() {
    return this.dhcp;
  }
  
  public void setDhcp(boolean paramBoolean) {
    this.dhcp = paramBoolean;
  }
  
  public String getVirtualNicDevice() {
    return this.virtualNicDevice;
  }
  
  public void setVirtualNicDevice(String paramString) {
    this.virtualNicDevice = paramString;
  }
  
  public String getIpv6VirtualNicDevice() {
    return this.ipv6VirtualNicDevice;
  }
  
  public void setIpv6VirtualNicDevice(String paramString) {
    this.ipv6VirtualNicDevice = paramString;
  }
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public String getDomainName() {
    return this.domainName;
  }
  
  public void setDomainName(String paramString) {
    this.domainName = paramString;
  }
  
  public List<String> getAddress() {
    if (this.address == null)
      this.address = new ArrayList<>(); 
    return this.address;
  }
  
  public List<String> getSearchDomain() {
    if (this.searchDomain == null)
      this.searchDomain = new ArrayList<>(); 
    return this.searchDomain;
  }
}
