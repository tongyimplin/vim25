package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostFirewallRulesetIpNetwork;
import com.vmware.vim25.HostFirewallRulesetIpNetwork;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostFirewallRulesetIpNetwork", propOrder = {"hostFirewallRulesetIpNetwork"})
public class ArrayOfHostFirewallRulesetIpNetwork {
  @XmlElement(name = "HostFirewallRulesetIpNetwork")
  protected List<HostFirewallRulesetIpNetwork> hostFirewallRulesetIpNetwork;
  
  public List<HostFirewallRulesetIpNetwork> getHostFirewallRulesetIpNetwork() {
    if (this.hostFirewallRulesetIpNetwork == null)
      this.hostFirewallRulesetIpNetwork = new ArrayList<>(); 
    return this.hostFirewallRulesetIpNetwork;
  }
}
