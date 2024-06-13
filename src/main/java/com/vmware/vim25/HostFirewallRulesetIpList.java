package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFirewallRulesetIpList;
import com.vmware.vim25.HostFirewallRulesetIpNetwork;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallRulesetIpList", propOrder = {"ipAddress", "ipNetwork", "allIp"})
public class HostFirewallRulesetIpList extends DynamicData {
  protected List<String> ipAddress;
  
  protected List<HostFirewallRulesetIpNetwork> ipNetwork;
  
  protected boolean allIp;
  
  public List<String> getIpAddress() {
    if (this.ipAddress == null)
      this.ipAddress = new ArrayList<>(); 
    return this.ipAddress;
  }
  
  public List<HostFirewallRulesetIpNetwork> getIpNetwork() {
    if (this.ipNetwork == null)
      this.ipNetwork = new ArrayList<>(); 
    return this.ipNetwork;
  }
  
  public boolean isAllIp() {
    return this.allIp;
  }
  
  public void setAllIp(boolean paramBoolean) {
    this.allIp = paramBoolean;
  }
}
