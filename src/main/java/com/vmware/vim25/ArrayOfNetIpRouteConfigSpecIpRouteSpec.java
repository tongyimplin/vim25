package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNetIpRouteConfigSpecIpRouteSpec;
import com.vmware.vim25.NetIpRouteConfigSpecIpRouteSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetIpRouteConfigSpecIpRouteSpec", propOrder = {"netIpRouteConfigSpecIpRouteSpec"})
public class ArrayOfNetIpRouteConfigSpecIpRouteSpec {
  @XmlElement(name = "NetIpRouteConfigSpecIpRouteSpec")
  protected List<NetIpRouteConfigSpecIpRouteSpec> netIpRouteConfigSpecIpRouteSpec;
  
  public List<NetIpRouteConfigSpecIpRouteSpec> getNetIpRouteConfigSpecIpRouteSpec() {
    if (this.netIpRouteConfigSpecIpRouteSpec == null)
      this.netIpRouteConfigSpecIpRouteSpec = new ArrayList<>(); 
    return this.netIpRouteConfigSpecIpRouteSpec;
  }
}
