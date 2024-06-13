package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFirewallRule;
import com.vmware.vim25.HostFirewallRuleDirection;
import com.vmware.vim25.HostFirewallRulePortType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallRule", propOrder = {"port", "endPort", "direction", "portType", "protocol"})
public class HostFirewallRule extends DynamicData {
  protected int port;
  
  protected Integer endPort;
  
  @XmlElement(required = true)
  protected HostFirewallRuleDirection direction;
  
  protected HostFirewallRulePortType portType;
  
  @XmlElement(required = true)
  protected String protocol;
  
  public int getPort() {
    return this.port;
  }
  
  public void setPort(int paramInt) {
    this.port = paramInt;
  }
  
  public Integer getEndPort() {
    return this.endPort;
  }
  
  public void setEndPort(Integer paramInteger) {
    this.endPort = paramInteger;
  }
  
  public HostFirewallRuleDirection getDirection() {
    return this.direction;
  }
  
  public void setDirection(HostFirewallRuleDirection paramHostFirewallRuleDirection) {
    this.direction = paramHostFirewallRuleDirection;
  }
  
  public HostFirewallRulePortType getPortType() {
    return this.portType;
  }
  
  public void setPortType(HostFirewallRulePortType paramHostFirewallRulePortType) {
    this.portType = paramHostFirewallRulePortType;
  }
  
  public String getProtocol() {
    return this.protocol;
  }
  
  public void setProtocol(String paramString) {
    this.protocol = paramString;
  }
}
