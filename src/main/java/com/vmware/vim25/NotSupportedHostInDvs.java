package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.NotSupportedHost;
import com.vmware.vim25.NotSupportedHostInDvs;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotSupportedHostInDvs", propOrder = {"switchProductSpec"})
public class NotSupportedHostInDvs extends NotSupportedHost {
  @XmlElement(required = true)
  protected DistributedVirtualSwitchProductSpec switchProductSpec;
  
  public DistributedVirtualSwitchProductSpec getSwitchProductSpec() {
    return this.switchProductSpec;
  }
  
  public void setSwitchProductSpec(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.switchProductSpec = paramDistributedVirtualSwitchProductSpec;
  }
}
