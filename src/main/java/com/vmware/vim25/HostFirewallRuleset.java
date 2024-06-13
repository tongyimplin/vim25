package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFirewallRule;
import com.vmware.vim25.HostFirewallRuleset;
import com.vmware.vim25.HostFirewallRulesetIpList;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallRuleset", propOrder = {"key", "label", "required", "rule", "service", "enabled", "allowedHosts"})
public class HostFirewallRuleset extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String label;
  
  protected boolean required;
  
  @XmlElement(required = true)
  protected List<HostFirewallRule> rule;
  
  protected String service;
  
  protected boolean enabled;
  
  protected HostFirewallRulesetIpList allowedHosts;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getLabel() {
    return this.label;
  }
  
  public void setLabel(String paramString) {
    this.label = paramString;
  }
  
  public boolean isRequired() {
    return this.required;
  }
  
  public void setRequired(boolean paramBoolean) {
    this.required = paramBoolean;
  }
  
  public List<HostFirewallRule> getRule() {
    if (this.rule == null)
      this.rule = new ArrayList<>(); 
    return this.rule;
  }
  
  public String getService() {
    return this.service;
  }
  
  public void setService(String paramString) {
    this.service = paramString;
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
