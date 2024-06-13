package com.vmware.vim25;

import com.vmware.vim25.HostSpecification;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateHostSpecificationRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHostSpecificationRequestType", propOrder = {"_this", "host", "hostSpec"})
public class UpdateHostSpecificationRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected HostSpecification hostSpec;
  
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
  
  public HostSpecification getHostSpec() {
    return this.hostSpec;
  }
  
  public void setHostSpec(HostSpecification paramHostSpecification) {
    this.hostSpec = paramHostSpecification;
  }
}
