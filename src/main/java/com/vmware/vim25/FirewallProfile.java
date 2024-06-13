package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.FirewallProfile;
import com.vmware.vim25.FirewallProfileRulesetProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirewallProfile", propOrder = {"ruleset"})
public class FirewallProfile extends ApplyProfile {
  protected List<FirewallProfileRulesetProfile> ruleset;
  
  public List<FirewallProfileRulesetProfile> getRuleset() {
    if (this.ruleset == null)
      this.ruleset = new ArrayList<>(); 
    return this.ruleset;
  }
}
