package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostFirewallRuleset;
import com.vmware.vim25.HostFirewallRuleset;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostFirewallRuleset", propOrder = {"hostFirewallRuleset"})
public class ArrayOfHostFirewallRuleset {
  @XmlElement(name = "HostFirewallRuleset")
  protected List<HostFirewallRuleset> hostFirewallRuleset;
  
  public List<HostFirewallRuleset> getHostFirewallRuleset() {
    if (this.hostFirewallRuleset == null)
      this.hostFirewallRuleset = new ArrayList<>(); 
    return this.hostFirewallRuleset;
  }
}
