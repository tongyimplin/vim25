package com.vmware.vim25;

import com.vmware.vim25.CreateVmfsDatastoreRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmfsDatastoreCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVmfsDatastoreRequestType", propOrder = {"_this", "spec"})
public class CreateVmfsDatastoreRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VmfsDatastoreCreateSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VmfsDatastoreCreateSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VmfsDatastoreCreateSpec paramVmfsDatastoreCreateSpec) {
    this.spec = paramVmfsDatastoreCreateSpec;
  }
}
