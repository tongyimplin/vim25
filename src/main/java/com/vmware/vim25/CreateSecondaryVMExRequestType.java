package com.vmware.vim25;

import com.vmware.vim25.CreateSecondaryVMExRequestType;
import com.vmware.vim25.FaultToleranceConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSecondaryVMExRequestType", propOrder = {"_this", "host", "spec"})
public class CreateSecondaryVMExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference host;
  
  protected FaultToleranceConfigSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public FaultToleranceConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(FaultToleranceConfigSpec paramFaultToleranceConfigSpec) {
    this.spec = paramFaultToleranceConfigSpec;
  }
}
