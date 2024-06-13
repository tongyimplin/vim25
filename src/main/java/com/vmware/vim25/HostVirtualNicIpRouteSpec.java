package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpRouteConfig;
import com.vmware.vim25.HostVirtualNicIpRouteSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualNicIpRouteSpec", propOrder = {"ipRouteConfig"})
public class HostVirtualNicIpRouteSpec extends DynamicData {
  protected HostIpRouteConfig ipRouteConfig;
  
  public HostIpRouteConfig getIpRouteConfig() {
    return this.ipRouteConfig;
  }
  
  public void setIpRouteConfig(HostIpRouteConfig paramHostIpRouteConfig) {
    this.ipRouteConfig = paramHostIpRouteConfig;
  }
}
