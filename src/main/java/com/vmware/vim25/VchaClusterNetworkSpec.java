package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NodeNetworkSpec;
import com.vmware.vim25.PassiveNodeNetworkSpec;
import com.vmware.vim25.VchaClusterNetworkSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaClusterNetworkSpec", propOrder = {"witnessNetworkSpec", "passiveNetworkSpec"})
public class VchaClusterNetworkSpec extends DynamicData {
  @XmlElement(required = true)
  protected NodeNetworkSpec witnessNetworkSpec;
  
  @XmlElement(required = true)
  protected PassiveNodeNetworkSpec passiveNetworkSpec;
  
  public NodeNetworkSpec getWitnessNetworkSpec() {
    return this.witnessNetworkSpec;
  }
  
  public void setWitnessNetworkSpec(NodeNetworkSpec paramNodeNetworkSpec) {
    this.witnessNetworkSpec = paramNodeNetworkSpec;
  }
  
  public PassiveNodeNetworkSpec getPassiveNetworkSpec() {
    return this.passiveNetworkSpec;
  }
  
  public void setPassiveNetworkSpec(PassiveNodeNetworkSpec paramPassiveNodeNetworkSpec) {
    this.passiveNetworkSpec = paramPassiveNodeNetworkSpec;
  }
}
