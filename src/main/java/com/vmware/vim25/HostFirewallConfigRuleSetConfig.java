package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFirewallConfigRuleSetConfig;
import com.vmware.vim25.HostFirewallRulesetIpList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallConfigRuleSetConfig", propOrder = {"rulesetId", "enabled", "allowedHosts"})
public class HostFirewallConfigRuleSetConfig extends DynamicData {
  @XmlElement(required = true)
  protected String rulesetId;
  
  protected boolean enabled;
  
  protected HostFirewallRulesetIpList allowedHosts;
  
  public String getRulesetId() {
    return this.rulesetId;
  }
  
  public void setRulesetId(String paramString) {
    this.rulesetId = paramString;
  }
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public HostFirewallRulesetIpList getAllowedHosts() {
    return this.allowedHosts;
  }
  
  public void setAllowedHosts(HostFirewallRulesetIpList paramHostFirewallRulesetIpList) {
    this.allowedHosts = paramHostFirewallRulesetIpList;
  }
}
