package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetIpRouteConfigInfo;
import com.vmware.vim25.NetIpRouteConfigInfoIpRoute;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpRouteConfigInfo", propOrder = {"ipRoute"})
public class NetIpRouteConfigInfo extends DynamicData {
  protected List<NetIpRouteConfigInfoIpRoute> ipRoute;
  
  public List<NetIpRouteConfigInfoIpRoute> getIpRoute() {
    if (this.ipRoute == null)
      this.ipRoute = new ArrayList<>(); 
    return this.ipRoute;
  }
}
