package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostFirewallConfigRuleSetConfig;
import com.vmware.vim25.HostFirewallConfigRuleSetConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostFirewallConfigRuleSetConfig", propOrder = {"hostFirewallConfigRuleSetConfig"})
public class ArrayOfHostFirewallConfigRuleSetConfig {
  @XmlElement(name = "HostFirewallConfigRuleSetConfig")
  protected List<HostFirewallConfigRuleSetConfig> hostFirewallConfigRuleSetConfig;
  
  public List<HostFirewallConfigRuleSetConfig> getHostFirewallConfigRuleSetConfig() {
    if (this.hostFirewallConfigRuleSetConfig == null)
      this.hostFirewallConfigRuleSetConfig = new ArrayList<>(); 
    return this.hostFirewallConfigRuleSetConfig;
  }
}
