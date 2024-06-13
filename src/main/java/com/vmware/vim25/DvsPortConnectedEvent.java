package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortConnectee;
import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsPortConnectedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsPortConnectedEvent", propOrder = {"portKey", "connectee"})
public class DvsPortConnectedEvent extends DvsEvent {
  @XmlElement(required = true)
  protected String portKey;
  
  protected DistributedVirtualSwitchPortConnectee connectee;
  
  public String getPortKey() {
    return this.portKey;
  }
  
  public void setPortKey(String paramString) {
    this.portKey = paramString;
  }
  
  public DistributedVirtualSwitchPortConnectee getConnectee() {
    return this.connectee;
  }
  
  public void setConnectee(DistributedVirtualSwitchPortConnectee paramDistributedVirtualSwitchPortConnectee) {
    this.connectee = paramDistributedVirtualSwitchPortConnectee;
  }
}
