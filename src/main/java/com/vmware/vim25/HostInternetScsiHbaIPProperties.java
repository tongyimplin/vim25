package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaIPProperties;
import com.vmware.vim25.HostInternetScsiHbaIPv6Properties;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaIPProperties", propOrder = {"mac", "address", "dhcpConfigurationEnabled", "subnetMask", "defaultGateway", "primaryDnsServerAddress", "alternateDnsServerAddress", "ipv6Address", "ipv6SubnetMask", "ipv6DefaultGateway", "arpRedirectEnabled", "mtu", "jumboFramesEnabled", "ipv4Enabled", "ipv6Enabled", "ipv6Properties"})
public class HostInternetScsiHbaIPProperties extends DynamicData {
  protected String mac;
  
  protected String address;
  
  protected boolean dhcpConfigurationEnabled;
  
  protected String subnetMask;
  
  protected String defaultGateway;
  
  protected String primaryDnsServerAddress;
  
  protected String alternateDnsServerAddress;
  
  protected String ipv6Address;
  
  protected String ipv6SubnetMask;
  
  protected String ipv6DefaultGateway;
  
  protected Boolean arpRedirectEnabled;
  
  protected Integer mtu;
  
  protected Boolean jumboFramesEnabled;
  
  protected Boolean ipv4Enabled;
  
  protected Boolean ipv6Enabled;
  
  @XmlElement(name = "ipv6properties")
  protected HostInternetScsiHbaIPv6Properties ipv6Properties;
  
  public String getMac() {
    return this.mac;
  }
  
  public void setMac(String paramString) {
    this.mac = paramString;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
  
  public boolean isDhcpConfigurationEnabled() {
    return this.dhcpConfigurationEnabled;
  }
  
  public void setDhcpConfigurationEnabled(boolean paramBoolean) {
    this.dhcpConfigurationEnabled = paramBoolean;
  }
  
  public String getSubnetMask() {
    return this.subnetMask;
  }
  
  public void setSubnetMask(String paramString) {
    this.subnetMask = paramString;
  }
  
  public String getDefaultGateway() {
    return this.defaultGateway;
  }
  
  public void setDefaultGateway(String paramString) {
    this.defaultGateway = paramString;
  }
  
  public String getPrimaryDnsServerAddress() {
    return this.primaryDnsServerAddress;
  }
  
  public void setPrimaryDnsServerAddress(String paramString) {
    this.primaryDnsServerAddress = paramString;
  }
  
  public String getAlternateDnsServerAddress() {
    return this.alternateDnsServerAddress;
  }
  
  public void setAlternateDnsServerAddress(String paramString) {
    this.alternateDnsServerAddress = paramString;
  }
  
  public String getIpv6Address() {
    return this.ipv6Address;
  }
  
  public void setIpv6Address(String paramString) {
    this.ipv6Address = paramString;
  }
  
  public String getIpv6SubnetMask() {
    return this.ipv6SubnetMask;
  }
  
  public void setIpv6SubnetMask(String paramString) {
    this.ipv6SubnetMask = paramString;
  }
  
  public String getIpv6DefaultGateway() {
    return this.ipv6DefaultGateway;
  }
  
  public void setIpv6DefaultGateway(String paramString) {
    this.ipv6DefaultGateway = paramString;
  }
  
  public Boolean isArpRedirectEnabled() {
    return this.arpRedirectEnabled;
  }
  
  public void setArpRedirectEnabled(Boolean paramBoolean) {
    this.arpRedirectEnabled = paramBoolean;
  }
  
  public Integer getMtu() {
    return this.mtu;
  }
  
  public void setMtu(Integer paramInteger) {
    this.mtu = paramInteger;
  }
  
  public Boolean isJumboFramesEnabled() {
    return this.jumboFramesEnabled;
  }
  
  public void setJumboFramesEnabled(Boolean paramBoolean) {
    this.jumboFramesEnabled = paramBoolean;
  }
  
  public Boolean isIpv4Enabled() {
    return this.ipv4Enabled;
  }
  
  public void setIpv4Enabled(Boolean paramBoolean) {
    this.ipv4Enabled = paramBoolean;
  }
  
  public Boolean isIpv6Enabled() {
    return this.ipv6Enabled;
  }
  
  public void setIpv6Enabled(Boolean paramBoolean) {
    this.ipv6Enabled = paramBoolean;
  }
  
  public HostInternetScsiHbaIPv6Properties getIpv6Properties() {
    return this.ipv6Properties;
  }
  
  public void setIpv6Properties(HostInternetScsiHbaIPv6Properties paramHostInternetScsiHbaIPv6Properties) {
    this.ipv6Properties = paramHostInternetScsiHbaIPv6Properties;
  }
}
