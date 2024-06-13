package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostIpRouteEntry;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpRouteEntry", propOrder = {"network", "prefixLength", "gateway", "deviceName"})
public class HostIpRouteEntry extends DynamicData {
  @XmlElement(required = true)
  protected String network;
  
  protected int prefixLength;
  
  @XmlElement(required = true)
  protected String gateway;
  
  protected String deviceName;
  
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
  
  public String getGateway() {
    return this.gateway;
  }
  
  public void setGateway(String paramString) {
    this.gateway = paramString;
  }
  
  public String getDeviceName() {
    return this.deviceName;
  }
  
  public void setDeviceName(String paramString) {
    this.deviceName = paramString;
  }
}
