package com.vmware.vim25;

import com.vmware.vim25.ExpandVmfsDatastoreRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmfsDatastoreExpandSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpandVmfsDatastoreRequestType", propOrder = {"_this", "datastore", "spec"})
public class ExpandVmfsDatastoreRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  @XmlElement(required = true)
  protected VmfsDatastoreExpandSpec spec;
  
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
  
  public VmfsDatastoreExpandSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VmfsDatastoreExpandSpec paramVmfsDatastoreExpandSpec) {
    this.spec = paramVmfsDatastoreExpandSpec;
  }
}
