package com.vmware.vim25;

import com.vmware.vim25.DeployVchaRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VchaClusterDeploymentSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deployVchaRequestType", propOrder = {"_this", "deploymentSpec"})
public class DeployVchaRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VchaClusterDeploymentSpec deploymentSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VchaClusterDeploymentSpec getDeploymentSpec() {
    return this.deploymentSpec;
  }
  
  public void setDeploymentSpec(VchaClusterDeploymentSpec paramVchaClusterDeploymentSpec) {
    this.deploymentSpec = paramVchaClusterDeploymentSpec;
  }
}
