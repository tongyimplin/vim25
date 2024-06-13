package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaIPCapabilities;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaIPCapabilities", propOrder = {"addressSettable", "ipConfigurationMethodSettable", "subnetMaskSettable", "defaultGatewaySettable", "primaryDnsServerAddressSettable", "alternateDnsServerAddressSettable", "ipv6Supported", "arpRedirectSettable", "mtuSettable", "hostNameAsTargetAddress", "nameAliasSettable", "ipv4EnableSettable", "ipv6EnableSettable", "ipv6PrefixLengthSettable", "ipv6PrefixLength", "ipv6DhcpConfigurationSettable", "ipv6LinkLocalAutoConfigurationSettable", "ipv6RouterAdvertisementConfigurationSettable", "ipv6DefaultGatewaySettable", "ipv6MaxStaticAddressesSupported"})
public class HostInternetScsiHbaIPCapabilities extends DynamicData {
  protected boolean addressSettable;
  
  protected boolean ipConfigurationMethodSettable;
  
  protected boolean subnetMaskSettable;
  
  protected boolean defaultGatewaySettable;
  
  protected boolean primaryDnsServerAddressSettable;
  
  protected boolean alternateDnsServerAddressSettable;
  
  protected Boolean ipv6Supported;
  
  protected Boolean arpRedirectSettable;
  
  protected Boolean mtuSettable;
  
  protected Boolean hostNameAsTargetAddress;
  
  protected Boolean nameAliasSettable;
  
  protected Boolean ipv4EnableSettable;
  
  protected Boolean ipv6EnableSettable;
  
  protected Boolean ipv6PrefixLengthSettable;
  
  protected Integer ipv6PrefixLength;
  
  protected Boolean ipv6DhcpConfigurationSettable;
  
  protected Boolean ipv6LinkLocalAutoConfigurationSettable;
  
  protected Boolean ipv6RouterAdvertisementConfigurationSettable;
  
  protected Boolean ipv6DefaultGatewaySettable;
  
  protected Integer ipv6MaxStaticAddressesSupported;
  
  public boolean isAddressSettable() {
    return this.addressSettable;
  }
  
  public void setAddressSettable(boolean paramBoolean) {
    this.addressSettable = paramBoolean;
  }
  
  public boolean isIpConfigurationMethodSettable() {
    return this.ipConfigurationMethodSettable;
  }
  
  public void setIpConfigurationMethodSettable(boolean paramBoolean) {
    this.ipConfigurationMethodSettable = paramBoolean;
  }
  
  public boolean isSubnetMaskSettable() {
    return this.subnetMaskSettable;
  }
  
  public void setSubnetMaskSettable(boolean paramBoolean) {
    this.subnetMaskSettable = paramBoolean;
  }
  
  public boolean isDefaultGatewaySettable() {
    return this.defaultGatewaySettable;
  }
  
  public void setDefaultGatewaySettable(boolean paramBoolean) {
    this.defaultGatewaySettable = paramBoolean;
  }
  
  public boolean isPrimaryDnsServerAddressSettable() {
    return this.primaryDnsServerAddressSettable;
  }
  
  public void setPrimaryDnsServerAddressSettable(boolean paramBoolean) {
    this.primaryDnsServerAddressSettable = paramBoolean;
  }
  
  public boolean isAlternateDnsServerAddressSettable() {
    return this.alternateDnsServerAddressSettable;
  }
  
  public void setAlternateDnsServerAddressSettable(boolean paramBoolean) {
    this.alternateDnsServerAddressSettable = paramBoolean;
  }
  
  public Boolean isIpv6Supported() {
    return this.ipv6Supported;
  }
  
  public void setIpv6Supported(Boolean paramBoolean) {
    this.ipv6Supported = paramBoolean;
  }
  
  public Boolean isArpRedirectSettable() {
    return this.arpRedirectSettable;
  }
  
  public void setArpRedirectSettable(Boolean paramBoolean) {
    this.arpRedirectSettable = paramBoolean;
  }
  
  public Boolean isMtuSettable() {
    return this.mtuSettable;
  }
  
  public void setMtuSettable(Boolean paramBoolean) {
    this.mtuSettable = paramBoolean;
  }
  
  public Boolean isHostNameAsTargetAddress() {
    return this.hostNameAsTargetAddress;
  }
  
  public void setHostNameAsTargetAddress(Boolean paramBoolean) {
    this.hostNameAsTargetAddress = paramBoolean;
  }
  
  public Boolean isNameAliasSettable() {
    return this.nameAliasSettable;
  }
  
  public void setNameAliasSettable(Boolean paramBoolean) {
    this.nameAliasSettable = paramBoolean;
  }
  
  public Boolean isIpv4EnableSettable() {
    return this.ipv4EnableSettable;
  }
  
  public void setIpv4EnableSettable(Boolean paramBoolean) {
    this.ipv4EnableSettable = paramBoolean;
  }
  
  public Boolean isIpv6EnableSettable() {
    return this.ipv6EnableSettable;
  }
  
  public void setIpv6EnableSettable(Boolean paramBoolean) {
    this.ipv6EnableSettable = paramBoolean;
  }
  
  public Boolean isIpv6PrefixLengthSettable() {
    return this.ipv6PrefixLengthSettable;
  }
  
  public void setIpv6PrefixLengthSettable(Boolean paramBoolean) {
    this.ipv6PrefixLengthSettable = paramBoolean;
  }
  
  public Integer getIpv6PrefixLength() {
    return this.ipv6PrefixLength;
  }
  
  public void setIpv6PrefixLength(Integer paramInteger) {
    this.ipv6PrefixLength = paramInteger;
  }
  
  public Boolean isIpv6DhcpConfigurationSettable() {
    return this.ipv6DhcpConfigurationSettable;
  }
  
  public void setIpv6DhcpConfigurationSettable(Boolean paramBoolean) {
    this.ipv6DhcpConfigurationSettable = paramBoolean;
  }
  
  public Boolean isIpv6LinkLocalAutoConfigurationSettable() {
    return this.ipv6LinkLocalAutoConfigurationSettable;
  }
  
  public void setIpv6LinkLocalAutoConfigurationSettable(Boolean paramBoolean) {
    this.ipv6LinkLocalAutoConfigurationSettable = paramBoolean;
  }
  
  public Boolean isIpv6RouterAdvertisementConfigurationSettable() {
    return this.ipv6RouterAdvertisementConfigurationSettable;
  }
  
  public void setIpv6RouterAdvertisementConfigurationSettable(Boolean paramBoolean) {
    this.ipv6RouterAdvertisementConfigurationSettable = paramBoolean;
  }
  
  public Boolean isIpv6DefaultGatewaySettable() {
    return this.ipv6DefaultGatewaySettable;
  }
  
  public void setIpv6DefaultGatewaySettable(Boolean paramBoolean) {
    this.ipv6DefaultGatewaySettable = paramBoolean;
  }
  
  public Integer getIpv6MaxStaticAddressesSupported() {
    return this.ipv6MaxStaticAddressesSupported;
  }
  
  public void setIpv6MaxStaticAddressesSupported(Integer paramInteger) {
    this.ipv6MaxStaticAddressesSupported = paramInteger;
  }
}
