package com.vmware.vim25;

import com.vmware.vim25.CreatePassiveNodeRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PassiveNodeDeploymentSpec;
import com.vmware.vim25.SourceNodeSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPassiveNodeRequestType", propOrder = {"_this", "passiveDeploymentSpec", "sourceVcSpec"})
public class CreatePassiveNodeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected PassiveNodeDeploymentSpec passiveDeploymentSpec;
  
  @XmlElement(required = true)
  protected SourceNodeSpec sourceVcSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public PassiveNodeDeploymentSpec getPassiveDeploymentSpec() {
    return this.passiveDeploymentSpec;
  }
  
  public void setPassiveDeploymentSpec(PassiveNodeDeploymentSpec paramPassiveNodeDeploymentSpec) {
    this.passiveDeploymentSpec = paramPassiveNodeDeploymentSpec;
  }
  
  public SourceNodeSpec getSourceVcSpec() {
    return this.sourceVcSpec;
  }
  
  public void setSourceVcSpec(SourceNodeSpec paramSourceNodeSpec) {
    this.sourceVcSpec = paramSourceNodeSpec;
  }
}
