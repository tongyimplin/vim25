package com.vmware.vim25;

import com.vmware.vim25.HostSubSpecification;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateHostSubSpecificationRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHostSubSpecificationRequestType", propOrder = {"_this", "host", "hostSubSpec"})
public class UpdateHostSubSpecificationRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected HostSubSpecification hostSubSpec;
  
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
  
  public HostSubSpecification getHostSubSpec() {
    return this.hostSubSpec;
  }
  
  public void setHostSubSpec(HostSubSpecification paramHostSubSpecification) {
    this.hostSubSpec = paramHostSubSpecification;
  }
}
