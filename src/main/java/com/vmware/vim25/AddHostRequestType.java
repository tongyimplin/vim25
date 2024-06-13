package com.vmware.vim25;

import com.vmware.vim25.AddHostRequestType;
import com.vmware.vim25.HostConnectSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddHostRequestType", propOrder = {"_this", "spec", "asConnected", "resourcePool", "license"})
public class AddHostRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostConnectSpec spec;
  
  protected boolean asConnected;
  
  protected ManagedObjectReference resourcePool;
  
  protected String license;
  
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
  
  public boolean isAsConnected() {
    return this.asConnected;
  }
  
  public void setAsConnected(boolean paramBoolean) {
    this.asConnected = paramBoolean;
  }
  
  public ManagedObjectReference getResourcePool() {
    return this.resourcePool;
  }
  
  public void setResourcePool(ManagedObjectReference paramManagedObjectReference) {
    this.resourcePool = paramManagedObjectReference;
  }
  
  public String getLicense() {
    return this.license;
  }
  
  public void setLicense(String paramString) {
    this.license = paramString;
  }
}
