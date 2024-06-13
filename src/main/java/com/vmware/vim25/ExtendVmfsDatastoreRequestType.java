package com.vmware.vim25;

import com.vmware.vim25.ExtendVmfsDatastoreRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmfsDatastoreExtendSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendVmfsDatastoreRequestType", propOrder = {"_this", "datastore", "spec"})
public class ExtendVmfsDatastoreRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  @XmlElement(required = true)
  protected VmfsDatastoreExtendSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public VmfsDatastoreExtendSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VmfsDatastoreExtendSpec paramVmfsDatastoreExtendSpec) {
    this.spec = paramVmfsDatastoreExtendSpec;
  }
}
