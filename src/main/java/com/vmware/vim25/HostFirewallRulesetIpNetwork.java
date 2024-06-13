package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFirewallRulesetIpNetwork;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallRulesetIpNetwork", propOrder = {"network", "prefixLength"})
public class HostFirewallRulesetIpNetwork extends DynamicData {
  @XmlElement(required = true)
  protected String network;
  
  protected int prefixLength;
  
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
}
