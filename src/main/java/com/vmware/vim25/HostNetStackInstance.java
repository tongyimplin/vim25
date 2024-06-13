package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDnsConfig;
import com.vmware.vim25.HostIpRouteConfig;
import com.vmware.vim25.HostIpRouteTableConfig;
import com.vmware.vim25.HostNetStackInstance;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNetStackInstance", propOrder = {"key", "name", "dnsConfig", "ipRouteConfig", "requestedMaxNumberOfConnections", "congestionControlAlgorithm", "ipV6Enabled", "routeTableConfig"})
public class HostNetStackInstance extends DynamicData {
  protected String key;
  
  protected String name;
  
  protected HostDnsConfig dnsConfig;
  
  protected HostIpRouteConfig ipRouteConfig;
  
  protected Integer requestedMaxNumberOfConnections;
  
  protected String congestionControlAlgorithm;
  
  protected Boolean ipV6Enabled;
  
  protected HostIpRouteTableConfig routeTableConfig;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public HostDnsConfig getDnsConfig() {
    return this.dnsConfig;
  }
  
  public void setDnsConfig(HostDnsConfig paramHostDnsConfig) {
    this.dnsConfig = paramHostDnsConfig;
  }
  
  public HostIpRouteConfig getIpRouteConfig() {
    return this.ipRouteConfig;
  }
  
  public void setIpRouteConfig(HostIpRouteConfig paramHostIpRouteConfig) {
    this.ipRouteConfig = paramHostIpRouteConfig;
  }
  
  public Integer getRequestedMaxNumberOfConnections() {
    return this.requestedMaxNumberOfConnections;
  }
  
  public void setRequestedMaxNumberOfConnections(Integer paramInteger) {
    this.requestedMaxNumberOfConnections = paramInteger;
  }
  
  public String getCongestionControlAlgorithm() {
    return this.congestionControlAlgorithm;
  }
  
  public void setCongestionControlAlgorithm(String paramString) {
    this.congestionControlAlgorithm = paramString;
  }
  
  public Boolean isIpV6Enabled() {
    return this.ipV6Enabled;
  }
  
  public void setIpV6Enabled(Boolean paramBoolean) {
    this.ipV6Enabled = paramBoolean;
  }
  
  public HostIpRouteTableConfig getRouteTableConfig() {
    return this.routeTableConfig;
  }
  
  public void setRouteTableConfig(HostIpRouteTableConfig paramHostIpRouteTableConfig) {
    this.routeTableConfig = paramHostIpRouteTableConfig;
  }
}
