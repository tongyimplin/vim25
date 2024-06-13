package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsUpgradeRejectedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsUpgradeRejectedEvent", propOrder = {"productInfo"})
public class DvsUpgradeRejectedEvent extends DvsEvent {
  @XmlElement(required = true)
  protected DistributedVirtualSwitchProductSpec productInfo;
  
  public DistributedVirtualSwitchProductSpec getProductInfo() {
    return this.productInfo;
  }
  
  public void setProductInfo(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.productInfo = paramDistributedVirtualSwitchProductSpec;
  }
}
