package com.vmware.vim25;

import com.vmware.vim25.ClusterNetworkConfigSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NodeDeploymentSpec;
import com.vmware.vim25.PassiveNodeDeploymentSpec;
import com.vmware.vim25.SourceNodeSpec;
import com.vmware.vim25.VchaClusterDeploymentSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VchaClusterDeploymentSpec", propOrder = {"passiveDeploymentSpec", "witnessDeploymentSpec", "activeVcSpec", "activeVcNetworkConfig"})
public class VchaClusterDeploymentSpec extends DynamicData {
  @XmlElement(required = true)
  protected PassiveNodeDeploymentSpec passiveDeploymentSpec;
  
  @XmlElement(required = true)
  protected NodeDeploymentSpec witnessDeploymentSpec;
  
  @XmlElement(required = true)
  protected SourceNodeSpec activeVcSpec;
  
  protected ClusterNetworkConfigSpec activeVcNetworkConfig;
  
  public PassiveNodeDeploymentSpec getPassiveDeploymentSpec() {
    return this.passiveDeploymentSpec;
  }
  
  public void setPassiveDeploymentSpec(PassiveNodeDeploymentSpec paramPassiveNodeDeploymentSpec) {
    this.passiveDeploymentSpec = paramPassiveNodeDeploymentSpec;
  }
  
  public NodeDeploymentSpec getWitnessDeploymentSpec() {
    return this.witnessDeploymentSpec;
  }
  
  public void setWitnessDeploymentSpec(NodeDeploymentSpec paramNodeDeploymentSpec) {
    this.witnessDeploymentSpec = paramNodeDeploymentSpec;
  }
  
  public SourceNodeSpec getActiveVcSpec() {
    return this.activeVcSpec;
  }
  
  public void setActiveVcSpec(SourceNodeSpec paramSourceNodeSpec) {
    this.activeVcSpec = paramSourceNodeSpec;
  }
  
  public ClusterNetworkConfigSpec getActiveVcNetworkConfig() {
    return this.activeVcNetworkConfig;
  }
  
  public void setActiveVcNetworkConfig(ClusterNetworkConfigSpec paramClusterNetworkConfigSpec) {
    this.activeVcNetworkConfig = paramClusterNetworkConfigSpec;
  }
}
