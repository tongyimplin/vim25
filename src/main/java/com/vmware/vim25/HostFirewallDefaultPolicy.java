package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFirewallDefaultPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFirewallDefaultPolicy", propOrder = {"incomingBlocked", "outgoingBlocked"})
public class HostFirewallDefaultPolicy extends DynamicData {
  protected Boolean incomingBlocked;
  
  protected Boolean outgoingBlocked;
  
  public Boolean isIncomingBlocked() {
    return this.incomingBlocked;
  }
  
  public void setIncomingBlocked(Boolean paramBoolean) {
    this.incomingBlocked = paramBoolean;
  }
  
  public Boolean isOutgoingBlocked() {
    return this.outgoingBlocked;
  }
  
  public void setOutgoingBlocked(Boolean paramBoolean) {
    this.outgoingBlocked = paramBoolean;
  }
}
