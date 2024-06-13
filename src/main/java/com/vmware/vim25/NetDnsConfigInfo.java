package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetDnsConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDnsConfigInfo", propOrder = {"dhcp", "hostName", "domainName", "ipAddress", "searchDomain"})
public class NetDnsConfigInfo extends DynamicData {
  protected boolean dhcp;
  
  @XmlElement(required = true)
  protected String hostName;
  
  @XmlElement(required = true)
  protected String domainName;
  
  protected List<String> ipAddress;
  
  protected List<String> searchDomain;
  
  public boolean isDhcp() {
    return this.dhcp;
  }
  
  public void setDhcp(boolean paramBoolean) {
    this.dhcp = paramBoolean;
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
  
  public List<String> getIpAddress() {
    if (this.ipAddress == null)
      this.ipAddress = new ArrayList<>(); 
    return this.ipAddress;
  }
  
  public List<String> getSearchDomain() {
    if (this.searchDomain == null)
      this.searchDomain = new ArrayList<>(); 
    return this.searchDomain;
  }
}
