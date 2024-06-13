package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchManagerHostContainer;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostContainerFilter;
import com.vmware.vim25.DistributedVirtualSwitchManagerHostDvsFilterSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributedVirtualSwitchManagerHostContainerFilter", propOrder = {"hostContainer"})
public class DistributedVirtualSwitchManagerHostContainerFilter extends DistributedVirtualSwitchManagerHostDvsFilterSpec {
  @XmlElement(required = true)
  protected DistributedVirtualSwitchManagerHostContainer hostContainer;
  
  public DistributedVirtualSwitchManagerHostContainer getHostContainer() {
    return this.hostContainer;
  }
  
  public void setHostContainer(DistributedVirtualSwitchManagerHostContainer paramDistributedVirtualSwitchManagerHostContainer) {
    this.hostContainer = paramDistributedVirtualSwitchManagerHostContainer;
  }
}
