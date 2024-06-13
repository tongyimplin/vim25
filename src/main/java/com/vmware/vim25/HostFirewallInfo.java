package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFirewallDefaultPolicy;
import com.vmware.vim25.HostFirewallInfo;
import com.vmware.vim25.HostFirewallRuleset;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallInfo", propOrder = {"defaultPolicy", "ruleset"})
public class HostFirewallInfo extends DynamicData {
  @XmlElement(required = true)
  protected HostFirewallDefaultPolicy defaultPolicy;
  
  protected List<HostFirewallRuleset> ruleset;
  
  public HostFirewallDefaultPolicy getDefaultPolicy() {
    return this.defaultPolicy;
  }
  
  public void setDefaultPolicy(HostFirewallDefaultPolicy paramHostFirewallDefaultPolicy) {
    this.defaultPolicy = paramHostFirewallDefaultPolicy;
  }
  
  public List<HostFirewallRuleset> getRuleset() {
    if (this.ruleset == null)
      this.ruleset = new ArrayList<>(); 
    return this.ruleset;
  }
}
