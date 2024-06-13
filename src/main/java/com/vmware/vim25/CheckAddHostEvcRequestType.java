package com.vmware.vim25;

import com.vmware.vim25.CheckAddHostEvcRequestType;
import com.vmware.vim25.HostConnectSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckAddHostEvcRequestType", propOrder = {"_this", "cnxSpec"})
public class CheckAddHostEvcRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostConnectSpec cnxSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostConnectSpec getCnxSpec() {
    return this.cnxSpec;
  }
  
  public void setCnxSpec(HostConnectSpec paramHostConnectSpec) {
    this.cnxSpec = paramHostConnectSpec;
  }
}
