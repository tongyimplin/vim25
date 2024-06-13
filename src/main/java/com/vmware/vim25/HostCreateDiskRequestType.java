package com.vmware.vim25;

import com.vmware.vim25.HostCreateDiskRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VslmCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCreateDiskRequestType", propOrder = {"_this", "spec"})
public class HostCreateDiskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VslmCreateSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VslmCreateSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VslmCreateSpec paramVslmCreateSpec) {
    this.spec = paramVslmCreateSpec;
  }
}
