package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFirewallRulesetIpList;
import com.vmware.vim25.HostFirewallRulesetRulesetSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallRulesetRulesetSpec", propOrder = {"allowedHosts"})
public class HostFirewallRulesetRulesetSpec extends DynamicData {
  @XmlElement(required = true)
  protected HostFirewallRulesetIpList allowedHosts;
  
  public HostFirewallRulesetIpList getAllowedHosts() {
    return this.allowedHosts;
  }
  
  public void setAllowedHosts(HostFirewallRulesetIpList paramHostFirewallRulesetIpList) {
    this.allowedHosts = paramHostFirewallRulesetIpList;
  }
}
