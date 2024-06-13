package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IpPool;
import com.vmware.vim25.IpPoolAssociation;
import com.vmware.vim25.IpPoolIpPoolConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpPool", propOrder = {"id", "name", "ipv4Config", "ipv6Config", "dnsDomain", "dnsSearchPath", "hostPrefix", "httpProxy", "networkAssociation", "availableIpv4Addresses", "availableIpv6Addresses", "allocatedIpv4Addresses", "allocatedIpv6Addresses"})
public class IpPool extends DynamicData {
  protected Integer id;
  
  protected String name;
  
  protected IpPoolIpPoolConfigInfo ipv4Config;
  
  protected IpPoolIpPoolConfigInfo ipv6Config;
  
  protected String dnsDomain;
  
  protected String dnsSearchPath;
  
  protected String hostPrefix;
  
  protected String httpProxy;
  
  protected List<IpPoolAssociation> networkAssociation;
  
  protected Integer availableIpv4Addresses;
  
  protected Integer availableIpv6Addresses;
  
  protected Integer allocatedIpv4Addresses;
  
  protected Integer allocatedIpv6Addresses;
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(Integer paramInteger) {
    this.id = paramInteger;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public IpPoolIpPoolConfigInfo getIpv4Config() {
    return this.ipv4Config;
  }
  
  public void setIpv4Config(IpPoolIpPoolConfigInfo paramIpPoolIpPoolConfigInfo) {
    this.ipv4Config = paramIpPoolIpPoolConfigInfo;
  }
  
  public IpPoolIpPoolConfigInfo getIpv6Config() {
    return this.ipv6Config;
  }
  
  public void setIpv6Config(IpPoolIpPoolConfigInfo paramIpPoolIpPoolConfigInfo) {
    this.ipv6Config = paramIpPoolIpPoolConfigInfo;
  }
  
  public String getDnsDomain() {
    return this.dnsDomain;
  }
  
  public void setDnsDomain(String paramString) {
    this.dnsDomain = paramString;
  }
  
  public String getDnsSearchPath() {
    return this.dnsSearchPath;
  }
  
  public void setDnsSearchPath(String paramString) {
    this.dnsSearchPath = paramString;
  }
  
  public String getHostPrefix() {
    return this.hostPrefix;
  }
  
  public void setHostPrefix(String paramString) {
    this.hostPrefix = paramString;
  }
  
  public String getHttpProxy() {
    return this.httpProxy;
  }
  
  public void setHttpProxy(String paramString) {
    this.httpProxy = paramString;
  }
  
  public List<IpPoolAssociation> getNetworkAssociation() {
    if (this.networkAssociation == null)
      this.networkAssociation = new ArrayList<>(); 
    return this.networkAssociation;
  }
  
  public Integer getAvailableIpv4Addresses() {
    return this.availableIpv4Addresses;
  }
  
  public void setAvailableIpv4Addresses(Integer paramInteger) {
    this.availableIpv4Addresses = paramInteger;
  }
  
  public Integer getAvailableIpv6Addresses() {
    return this.availableIpv6Addresses;
  }
  
  public void setAvailableIpv6Addresses(Integer paramInteger) {
    this.availableIpv6Addresses = paramInteger;
  }
  
  public Integer getAllocatedIpv4Addresses() {
    return this.allocatedIpv4Addresses;
  }
  
  public void setAllocatedIpv4Addresses(Integer paramInteger) {
    this.allocatedIpv4Addresses = paramInteger;
  }
  
  public Integer getAllocatedIpv6Addresses() {
    return this.allocatedIpv6Addresses;
  }
  
  public void setAllocatedIpv6Addresses(Integer paramInteger) {
    this.allocatedIpv6Addresses = paramInteger;
  }
}
