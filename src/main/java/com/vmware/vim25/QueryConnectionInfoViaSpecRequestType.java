package com.vmware.vim25;

import com.vmware.vim25.HostConnectSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryConnectionInfoViaSpecRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryConnectionInfoViaSpecRequestType", propOrder = {"_this", "spec"})
public class QueryConnectionInfoViaSpecRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostConnectSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostConnectSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostConnectSpec paramHostConnectSpec) {
    this.spec = paramHostConnectSpec;
  }
}
