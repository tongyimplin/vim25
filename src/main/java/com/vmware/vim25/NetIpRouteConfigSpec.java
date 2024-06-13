package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetIpRouteConfigSpec;
import com.vmware.vim25.NetIpRouteConfigSpecIpRouteSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpRouteConfigSpec", propOrder = {"ipRoute"})
public class NetIpRouteConfigSpec extends DynamicData {
  protected List<NetIpRouteConfigSpecIpRouteSpec> ipRoute;
  
  public List<NetIpRouteConfigSpecIpRouteSpec> getIpRoute() {
    if (this.ipRoute == null)
      this.ipRoute = new ArrayList<>(); 
    return this.ipRoute;
  }
}
