package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetCapabilities;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetCapabilities", propOrder = {"canSetPhysicalNicLinkSpeed", "supportsNicTeaming", "nicTeamingPolicy", "supportsVlan", "usesServiceConsoleNic", "supportsNetworkHints", "maxPortGroupsPerVswitch", "vswitchConfigSupported", "vnicConfigSupported", "ipRouteConfigSupported", "dnsConfigSupported", "dhcpOnVnicSupported", "ipV6Supported"})
public class HostNetCapabilities extends DynamicData {
  protected boolean canSetPhysicalNicLinkSpeed;
  
  protected boolean supportsNicTeaming;
  
  protected List<String> nicTeamingPolicy;
  
  protected boolean supportsVlan;
  
  protected boolean usesServiceConsoleNic;
  
  protected boolean supportsNetworkHints;
  
  protected Integer maxPortGroupsPerVswitch;
  
  protected boolean vswitchConfigSupported;
  
  protected boolean vnicConfigSupported;
  
  protected boolean ipRouteConfigSupported;
  
  protected boolean dnsConfigSupported;
  
  protected boolean dhcpOnVnicSupported;
  
  protected Boolean ipV6Supported;
  
  public boolean isCanSetPhysicalNicLinkSpeed() {
    return this.canSetPhysicalNicLinkSpeed;
  }
  
  public void setCanSetPhysicalNicLinkSpeed(boolean paramBoolean) {
    this.canSetPhysicalNicLinkSpeed = paramBoolean;
  }
  
  public boolean isSupportsNicTeaming() {
    return this.supportsNicTeaming;
  }
  
  public void setSupportsNicTeaming(boolean paramBoolean) {
    this.supportsNicTeaming = paramBoolean;
  }
  
  public List<String> getNicTeamingPolicy() {
    if (this.nicTeamingPolicy == null)
      this.nicTeamingPolicy = new ArrayList<>(); 
    return this.nicTeamingPolicy;
  }
  
  public boolean isSupportsVlan() {
    return this.supportsVlan;
  }
  
  public void setSupportsVlan(boolean paramBoolean) {
    this.supportsVlan = paramBoolean;
  }
  
  public boolean isUsesServiceConsoleNic() {
    return this.usesServiceConsoleNic;
  }
  
  public void setUsesServiceConsoleNic(boolean paramBoolean) {
    this.usesServiceConsoleNic = paramBoolean;
  }
  
  public boolean isSupportsNetworkHints() {
    return this.supportsNetworkHints;
  }
  
  public void setSupportsNetworkHints(boolean paramBoolean) {
    this.supportsNetworkHints = paramBoolean;
  }
  
  public Integer getMaxPortGroupsPerVswitch() {
    return this.maxPortGroupsPerVswitch;
  }
  
  public void setMaxPortGroupsPerVswitch(Integer paramInteger) {
    this.maxPortGroupsPerVswitch = paramInteger;
  }
  
  public boolean isVswitchConfigSupported() {
    return this.vswitchConfigSupported;
  }
  
  public void setVswitchConfigSupported(boolean paramBoolean) {
    this.vswitchConfigSupported = paramBoolean;
  }
  
  public boolean isVnicConfigSupported() {
    return this.vnicConfigSupported;
  }
  
  public void setVnicConfigSupported(boolean paramBoolean) {
    this.vnicConfigSupported = paramBoolean;
  }
  
  public boolean isIpRouteConfigSupported() {
    return this.ipRouteConfigSupported;
  }
  
  public void setIpRouteConfigSupported(boolean paramBoolean) {
    this.ipRouteConfigSupported = paramBoolean;
  }
  
  public boolean isDnsConfigSupported() {
    return this.dnsConfigSupported;
  }
  
  public void setDnsConfigSupported(boolean paramBoolean) {
    this.dnsConfigSupported = paramBoolean;
  }
  
  public boolean isDhcpOnVnicSupported() {
    return this.dhcpOnVnicSupported;
  }
  
  public void setDhcpOnVnicSupported(boolean paramBoolean) {
    this.dhcpOnVnicSupported = paramBoolean;
  }
  
  public Boolean isIpV6Supported() {
    return this.ipV6Supported;
  }
  
  public void setIpV6Supported(Boolean paramBoolean) {
    this.ipV6Supported = paramBoolean;
  }
}
