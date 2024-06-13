package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpRouteEntry;
import com.vmware.vim25.HostIpRouteTableInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpRouteTableInfo", propOrder = {"ipRoute", "ipv6Route"})
public class HostIpRouteTableInfo extends DynamicData {
  protected List<HostIpRouteEntry> ipRoute;
  
  protected List<HostIpRouteEntry> ipv6Route;
  
  public List<HostIpRouteEntry> getIpRoute() {
    if (this.ipRoute == null)
      this.ipRoute = new ArrayList<>(); 
    return this.ipRoute;
  }
  
  public List<HostIpRouteEntry> getIpv6Route() {
    if (this.ipv6Route == null)
      this.ipv6Route = new ArrayList<>(); 
    return this.ipv6Route;
  }
}
