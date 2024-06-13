package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpRouteConfig;
import com.vmware.vim25.HostIpRouteConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpRouteConfig", propOrder = {"defaultGateway", "gatewayDevice", "ipV6DefaultGateway", "ipV6GatewayDevice"})
@XmlSeeAlso({HostIpRouteConfigSpec.class})
public class HostIpRouteConfig extends DynamicData {
  protected String defaultGateway;
  
  protected String gatewayDevice;
  
  protected String ipV6DefaultGateway;
  
  protected String ipV6GatewayDevice;
  
  public String getDefaultGateway() {
    return this.defaultGateway;
  }
  
  public void setDefaultGateway(String paramString) {
    this.defaultGateway = paramString;
  }
  
  public String getGatewayDevice() {
    return this.gatewayDevice;
  }
  
  public void setGatewayDevice(String paramString) {
    this.gatewayDevice = paramString;
  }
  
  public String getIpV6DefaultGateway() {
    return this.ipV6DefaultGateway;
  }
  
  public void setIpV6DefaultGateway(String paramString) {
    this.ipV6DefaultGateway = paramString;
  }
  
  public String getIpV6GatewayDevice() {
    return this.ipV6GatewayDevice;
  }
  
  public void setIpV6GatewayDevice(String paramString) {
    this.ipV6GatewayDevice = paramString;
  }
}
