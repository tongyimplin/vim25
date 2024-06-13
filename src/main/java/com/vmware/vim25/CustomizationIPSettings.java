package com.vmware.vim25;

import com.vmware.vim25.CustomizationIPSettings;
import com.vmware.vim25.CustomizationIPSettingsIpV6AddressSpec;
import com.vmware.vim25.CustomizationIpGenerator;
import com.vmware.vim25.CustomizationNetBIOSMode;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationIPSettings", propOrder = {"ip", "subnetMask", "gateway", "ipV6Spec", "dnsServerList", "dnsDomain", "primaryWINS", "secondaryWINS", "netBIOS"})
public class CustomizationIPSettings extends DynamicData {
  @XmlElement(required = true)
  protected CustomizationIpGenerator ip;
  
  protected String subnetMask;
  
  protected List<String> gateway;
  
  protected CustomizationIPSettingsIpV6AddressSpec ipV6Spec;
  
  protected List<String> dnsServerList;
  
  protected String dnsDomain;
  
  protected String primaryWINS;
  
  protected String secondaryWINS;
  
  protected CustomizationNetBIOSMode netBIOS;
  
  public CustomizationIpGenerator getIp() {
    return this.ip;
  }
  
  public void setIp(CustomizationIpGenerator paramCustomizationIpGenerator) {
    this.ip = paramCustomizationIpGenerator;
  }
  
  public String getSubnetMask() {
    return this.subnetMask;
  }
  
  public void setSubnetMask(String paramString) {
    this.subnetMask = paramString;
  }
  
  public List<String> getGateway() {
    if (this.gateway == null)
      this.gateway = new ArrayList<>(); 
    return this.gateway;
  }
  
  public CustomizationIPSettingsIpV6AddressSpec getIpV6Spec() {
    return this.ipV6Spec;
  }
  
  public void setIpV6Spec(CustomizationIPSettingsIpV6AddressSpec paramCustomizationIPSettingsIpV6AddressSpec) {
    this.ipV6Spec = paramCustomizationIPSettingsIpV6AddressSpec;
  }
  
  public List<String> getDnsServerList() {
    if (this.dnsServerList == null)
      this.dnsServerList = new ArrayList<>(); 
    return this.dnsServerList;
  }
  
  public String getDnsDomain() {
    return this.dnsDomain;
  }
  
  public void setDnsDomain(String paramString) {
    this.dnsDomain = paramString;
  }
  
  public String getPrimaryWINS() {
    return this.primaryWINS;
  }
  
  public void setPrimaryWINS(String paramString) {
    this.primaryWINS = paramString;
  }
  
  public String getSecondaryWINS() {
    return this.secondaryWINS;
  }
  
  public void setSecondaryWINS(String paramString) {
    this.secondaryWINS = paramString;
  }
  
  public CustomizationNetBIOSMode getNetBIOS() {
    return this.netBIOS;
  }
  
  public void setNetBIOS(CustomizationNetBIOSMode paramCustomizationNetBIOSMode) {
    this.netBIOS = paramCustomizationNetBIOSMode;
  }
}
