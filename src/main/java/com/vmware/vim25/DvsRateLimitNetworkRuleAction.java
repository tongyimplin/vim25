package com.vmware.vim25;

import com.vmware.vim25.DvsNetworkRuleAction;
import com.vmware.vim25.DvsRateLimitNetworkRuleAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsRateLimitNetworkRuleAction", propOrder = {"packetsPerSecond"})
public class DvsRateLimitNetworkRuleAction extends DvsNetworkRuleAction {
  protected int packetsPerSecond;
  
  public int getPacketsPerSecond() {
    return this.packetsPerSecond;
  }
  
  public void setPacketsPerSecond(int paramInt) {
    this.packetsPerSecond = paramInt;
  }
}
