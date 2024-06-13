package com.vmware.vim25;

import com.vmware.vim25.CreateNasDatastoreRequestType;
import com.vmware.vim25.HostNasVolumeSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateNasDatastoreRequestType", propOrder = {"_this", "spec"})
public class CreateNasDatastoreRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostNasVolumeSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostNasVolumeSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostNasVolumeSpec paramHostNasVolumeSpec) {
    this.spec = paramHostNasVolumeSpec;
  }
}
