package com.vmware.vim25;

import com.vmware.vim25.HostDasEvent;
import com.vmware.vim25.HostPrimaryAgentNotShortNameEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPrimaryAgentNotShortNameEvent", propOrder = {"primaryAgent"})
public class HostPrimaryAgentNotShortNameEvent extends HostDasEvent {
  @XmlElement(required = true)
  protected String primaryAgent;
  
  public String getPrimaryAgent() {
    return this.primaryAgent;
  }
  
  public void setPrimaryAgent(String paramString) {
    this.primaryAgent = paramString;
  }
}
