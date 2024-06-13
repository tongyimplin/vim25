package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortConnection;
import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualEthernetCardDistributedVirtualPortBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualEthernetCardDistributedVirtualPortBackingInfo", propOrder = {"port"})
public class VirtualEthernetCardDistributedVirtualPortBackingInfo extends VirtualDeviceBackingInfo {
  @XmlElement(required = true)
  protected DistributedVirtualSwitchPortConnection port;
  
  public DistributedVirtualSwitchPortConnection getPort() {
    return this.port;
  }
  
  public void setPort(DistributedVirtualSwitchPortConnection paramDistributedVirtualSwitchPortConnection) {
    this.port = paramDistributedVirtualSwitchPortConnection;
  }
}
