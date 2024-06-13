package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFirewallConfig;
import com.vmware.vim25.HostFirewallConfigRuleSetConfig;
import com.vmware.vim25.HostFirewallDefaultPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallConfig", propOrder = {"rule", "defaultBlockingPolicy"})
public class HostFirewallConfig extends DynamicData {
  protected List<HostFirewallConfigRuleSetConfig> rule;
  
  @XmlElement(required = true)
  protected HostFirewallDefaultPolicy defaultBlockingPolicy;
  
  public List<HostFirewallConfigRuleSetConfig> getRule() {
    if (this.rule == null)
      this.rule = new ArrayList<>(); 
    return this.rule;
  }
  
  public HostFirewallDefaultPolicy getDefaultBlockingPolicy() {
    return this.defaultBlockingPolicy;
  }
  
  public void setDefaultBlockingPolicy(HostFirewallDefaultPolicy paramHostFirewallDefaultPolicy) {
    this.defaultBlockingPolicy = paramHostFirewallDefaultPolicy;
  }
}
