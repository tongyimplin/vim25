package com.vmware.vim25;

import com.vmware.vim25.HostIpRouteConfig;
import com.vmware.vim25.HostIpRouteConfigSpec;
import com.vmware.vim25.HostVirtualNicConnection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpRouteConfigSpec", propOrder = {"gatewayDeviceConnection", "ipV6GatewayDeviceConnection"})
public class HostIpRouteConfigSpec extends HostIpRouteConfig {
  protected HostVirtualNicConnection gatewayDeviceConnection;
  
  protected HostVirtualNicConnection ipV6GatewayDeviceConnection;
  
  public HostVirtualNicConnection getGatewayDeviceConnection() {
    return this.gatewayDeviceConnection;
  }
  
  public void setGatewayDeviceConnection(HostVirtualNicConnection paramHostVirtualNicConnection) {
    this.gatewayDeviceConnection = paramHostVirtualNicConnection;
  }
  
  public HostVirtualNicConnection getIpV6GatewayDeviceConnection() {
    return this.ipV6GatewayDeviceConnection;
  }
  
  public void setIpV6GatewayDeviceConnection(HostVirtualNicConnection paramHostVirtualNicConnection) {
    this.ipV6GatewayDeviceConnection = paramHostVirtualNicConnection;
  }
}
