package com.vmware.vim25;

import com.vmware.vim25.CreateWitnessNodeRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NodeDeploymentSpec;
import com.vmware.vim25.SourceNodeSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createWitnessNodeRequestType", propOrder = {"_this", "witnessDeploymentSpec", "sourceVcSpec"})
public class CreateWitnessNodeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected NodeDeploymentSpec witnessDeploymentSpec;
  
  @XmlElement(required = true)
  protected SourceNodeSpec sourceVcSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public NodeDeploymentSpec getWitnessDeploymentSpec() {
    return this.witnessDeploymentSpec;
  }
  
  public void setWitnessDeploymentSpec(NodeDeploymentSpec paramNodeDeploymentSpec) {
    this.witnessDeploymentSpec = paramNodeDeploymentSpec;
  }
  
  public SourceNodeSpec getSourceVcSpec() {
    return this.sourceVcSpec;
  }
  
  public void setSourceVcSpec(SourceNodeSpec paramSourceNodeSpec) {
    this.sourceVcSpec = paramSourceNodeSpec;
  }
}
