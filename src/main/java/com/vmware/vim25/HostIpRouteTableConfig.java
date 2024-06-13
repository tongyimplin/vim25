package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpRouteOp;
import com.vmware.vim25.HostIpRouteTableConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpRouteTableConfig", propOrder = {"ipRoute", "ipv6Route"})
public class HostIpRouteTableConfig extends DynamicData {
  protected List<HostIpRouteOp> ipRoute;
  
  protected List<HostIpRouteOp> ipv6Route;
  
  public List<HostIpRouteOp> getIpRoute() {
    if (this.ipRoute == null)
      this.ipRoute = new ArrayList<>(); 
    return this.ipRoute;
  }
  
  public List<HostIpRouteOp> getIpv6Route() {
    if (this.ipv6Route == null)
      this.ipv6Route = new ArrayList<>(); 
    return this.ipv6Route;
  }
}
