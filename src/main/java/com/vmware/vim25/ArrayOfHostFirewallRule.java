package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostFirewallRule;
import com.vmware.vim25.HostFirewallRule;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostFirewallRule", propOrder = {"hostFirewallRule"})
public class ArrayOfHostFirewallRule {
  @XmlElement(name = "HostFirewallRule")
  protected List<HostFirewallRule> hostFirewallRule;
  
  public List<HostFirewallRule> getHostFirewallRule() {
    if (this.hostFirewallRule == null)
      this.hostFirewallRule = new ArrayList<>(); 
    return this.hostFirewallRule;
  }
}
