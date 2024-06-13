package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateVStorageInfrastructureObjectPolicyRequestType;
import com.vmware.vim25.VslmInfrastructureObjectPolicySpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVStorageInfrastructureObjectPolicyRequestType", propOrder = {"_this", "spec"})
public class UpdateVStorageInfrastructureObjectPolicyRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VslmInfrastructureObjectPolicySpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VslmInfrastructureObjectPolicySpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VslmInfrastructureObjectPolicySpec paramVslmInfrastructureObjectPolicySpec) {
    this.spec = paramVslmInfrastructureObjectPolicySpec;
  }
}
