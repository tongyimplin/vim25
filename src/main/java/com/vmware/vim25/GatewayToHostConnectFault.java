package com.vmware.vim25;

import com.vmware.vim25.GatewayConnectFault;
import com.vmware.vim25.GatewayHostNotReachable;
import com.vmware.vim25.GatewayToHostAuthFault;
import com.vmware.vim25.GatewayToHostConnectFault;
import com.vmware.vim25.GatewayToHostTrustVerifyFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GatewayToHostConnectFault", propOrder = {"hostname", "port"})
@XmlSeeAlso({GatewayToHostAuthFault.class, GatewayToHostTrustVerifyFault.class, GatewayHostNotReachable.class})
public class GatewayToHostConnectFault extends GatewayConnectFault {
  @XmlElement(required = true)
  protected String hostname;
  
  protected Integer port;
  
  public String getHostname() {
    return this.hostname;
  }
  
  public void setHostname(String paramString) {
    this.hostname = paramString;
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public void setPort(Integer paramInteger) {
    this.port = paramInteger;
  }
}
