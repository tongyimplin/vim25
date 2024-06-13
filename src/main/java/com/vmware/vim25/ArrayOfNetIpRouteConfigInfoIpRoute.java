package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNetIpRouteConfigInfoIpRoute;
import com.vmware.vim25.NetIpRouteConfigInfoIpRoute;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetIpRouteConfigInfoIpRoute", propOrder = {"netIpRouteConfigInfoIpRoute"})
public class ArrayOfNetIpRouteConfigInfoIpRoute {
  @XmlElement(name = "NetIpRouteConfigInfoIpRoute")
  protected List<NetIpRouteConfigInfoIpRoute> netIpRouteConfigInfoIpRoute;
  
  public List<NetIpRouteConfigInfoIpRoute> getNetIpRouteConfigInfoIpRoute() {
    if (this.netIpRouteConfigInfoIpRoute == null)
      this.netIpRouteConfigInfoIpRoute = new ArrayList<>(); 
    return this.netIpRouteConfigInfoIpRoute;
  }
}
