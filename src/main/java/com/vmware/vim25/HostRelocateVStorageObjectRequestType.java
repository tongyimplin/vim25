package com.vmware.vim25;

import com.vmware.vim25.HostRelocateVStorageObjectRequestType;
import com.vmware.vim25.ID;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VslmRelocateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRelocateVStorageObjectRequestType", propOrder = {"_this", "id", "datastore", "spec"})
public class HostRelocateVStorageObjectRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ID id;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  @XmlElement(required = true)
  protected VslmRelocateSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ID getId() {
    return this.id;
  }
  
  public void setId(ID paramID) {
    this.id = paramID;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public VslmRelocateSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VslmRelocateSpec paramVslmRelocateSpec) {
    this.spec = paramVslmRelocateSpec;
  }
}
