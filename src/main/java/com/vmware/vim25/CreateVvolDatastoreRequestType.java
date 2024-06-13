package com.vmware.vim25;

import com.vmware.vim25.CreateVvolDatastoreRequestType;
import com.vmware.vim25.HostDatastoreSystemVvolDatastoreSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateVvolDatastoreRequestType", propOrder = {"_this", "spec"})
public class CreateVvolDatastoreRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostDatastoreSystemVvolDatastoreSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostDatastoreSystemVvolDatastoreSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostDatastoreSystemVvolDatastoreSpec paramHostDatastoreSystemVvolDatastoreSpec) {
    this.spec = paramHostDatastoreSystemVvolDatastoreSpec;
  }
}
