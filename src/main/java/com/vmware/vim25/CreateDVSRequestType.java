package com.vmware.vim25;

import com.vmware.vim25.CreateDVSRequestType;
import com.vmware.vim25.DVSCreateSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDVSRequestType", propOrder = {"_this", "spec"})
public class CreateDVSRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected DVSCreateSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public DVSCreateSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(DVSCreateSpec paramDVSCreateSpec) {
    this.spec = paramDVSCreateSpec;
  }
}
