package com.vmware.vim25;

import com.vmware.vim25.DVSCapability;
import com.vmware.vim25.DVSConfigSpec;
import com.vmware.vim25.DVSCreateSpec;
import com.vmware.vim25.DistributedVirtualSwitchProductSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSCreateSpec", propOrder = {"configSpec", "productInfo", "capability"})
public class DVSCreateSpec extends DynamicData {
  @XmlElement(required = true)
  protected DVSConfigSpec configSpec;
  
  protected DistributedVirtualSwitchProductSpec productInfo;
  
  protected DVSCapability capability;
  
  public DVSConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(DVSConfigSpec paramDVSConfigSpec) {
    this.configSpec = paramDVSConfigSpec;
  }
  
  public DistributedVirtualSwitchProductSpec getProductInfo() {
    return this.productInfo;
  }
  
  public void setProductInfo(DistributedVirtualSwitchProductSpec paramDistributedVirtualSwitchProductSpec) {
    this.productInfo = paramDistributedVirtualSwitchProductSpec;
  }
  
  public DVSCapability getCapability() {
    return this.capability;
  }
  
  public void setCapability(DVSCapability paramDVSCapability) {
    this.capability = paramDVSCapability;
  }
}
