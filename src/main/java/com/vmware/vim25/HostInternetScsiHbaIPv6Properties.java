package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaIPv6Properties;
import com.vmware.vim25.HostInternetScsiHbaIscsiIpv6Address;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaIPv6Properties", propOrder = {"iscsiIpv6Address", "ipv6DhcpConfigurationEnabled", "ipv6LinkLocalAutoConfigurationEnabled", "ipv6RouterAdvertisementConfigurationEnabled", "ipv6DefaultGateway"})
public class HostInternetScsiHbaIPv6Properties extends DynamicData {
  protected List<HostInternetScsiHbaIscsiIpv6Address> iscsiIpv6Address;
  
  protected Boolean ipv6DhcpConfigurationEnabled;
  
  protected Boolean ipv6LinkLocalAutoConfigurationEnabled;
  
  protected Boolean ipv6RouterAdvertisementConfigurationEnabled;
  
  protected String ipv6DefaultGateway;
  
  public List<HostInternetScsiHbaIscsiIpv6Address> getIscsiIpv6Address() {
    if (this.iscsiIpv6Address == null)
      this.iscsiIpv6Address = new ArrayList<>(); 
    return this.iscsiIpv6Address;
  }
  
  public Boolean isIpv6DhcpConfigurationEnabled() {
    return this.ipv6DhcpConfigurationEnabled;
  }
  
  public void setIpv6DhcpConfigurationEnabled(Boolean paramBoolean) {
    this.ipv6DhcpConfigurationEnabled = paramBoolean;
  }
  
  public Boolean isIpv6LinkLocalAutoConfigurationEnabled() {
    return this.ipv6LinkLocalAutoConfigurationEnabled;
  }
  
  public void setIpv6LinkLocalAutoConfigurationEnabled(Boolean paramBoolean) {
    this.ipv6LinkLocalAutoConfigurationEnabled = paramBoolean;
  }
  
  public Boolean isIpv6RouterAdvertisementConfigurationEnabled() {
    return this.ipv6RouterAdvertisementConfigurationEnabled;
  }
  
  public void setIpv6RouterAdvertisementConfigurationEnabled(Boolean paramBoolean) {
    this.ipv6RouterAdvertisementConfigurationEnabled = paramBoolean;
  }
  
  public String getIpv6DefaultGateway() {
    return this.ipv6DefaultGateway;
  }
  
  public void setIpv6DefaultGateway(String paramString) {
    this.ipv6DefaultGateway = paramString;
  }
}
