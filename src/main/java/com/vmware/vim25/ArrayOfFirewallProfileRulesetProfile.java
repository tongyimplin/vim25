package com.vmware.vim25;

import com.vmware.vim25.ArrayOfFirewallProfileRulesetProfile;
import com.vmware.vim25.FirewallProfileRulesetProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFirewallProfileRulesetProfile", propOrder = {"firewallProfileRulesetProfile"})
public class ArrayOfFirewallProfileRulesetProfile {
  @XmlElement(name = "FirewallProfileRulesetProfile")
  protected List<FirewallProfileRulesetProfile> firewallProfileRulesetProfile;
  
  public List<FirewallProfileRulesetProfile> getFirewallProfileRulesetProfile() {
    if (this.firewallProfileRulesetProfile == null)
      this.firewallProfileRulesetProfile = new ArrayList<>(); 
    return this.firewallProfileRulesetProfile;
  }
}
