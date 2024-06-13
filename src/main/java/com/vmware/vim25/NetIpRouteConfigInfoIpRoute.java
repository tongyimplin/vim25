package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetIpRouteConfigInfoGateway;
import com.vmware.vim25.NetIpRouteConfigInfoIpRoute;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpRouteConfigInfoIpRoute", propOrder = {"network", "prefixLength", "gateway"})
public class NetIpRouteConfigInfoIpRoute extends DynamicData {
  @XmlElement(required = true)
  protected String network;
  
  protected int prefixLength;
  
  @XmlElement(required = true)
  protected NetIpRouteConfigInfoGateway gateway;
  
  public String getNetwork() {
    return this.network;
  }
  
  public void setNetwork(String paramString) {
    this.network = paramString;
  }
  
  public int getPrefixLength() {
    return this.prefixLength;
  }
  
  public void setPrefixLength(int paramInt) {
    this.prefixLength = paramInt;
  }
  
  public NetIpRouteConfigInfoGateway getGateway() {
    return this.gateway;
  }
  
  public void setGateway(NetIpRouteConfigInfoGateway paramNetIpRouteConfigInfoGateway) {
    this.gateway = paramNetIpRouteConfigInfoGateway;
  }
}
