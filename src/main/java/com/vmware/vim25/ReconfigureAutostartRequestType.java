package com.vmware.vim25;

import com.vmware.vim25.HostAutoStartManagerConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureAutostartRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureAutostartRequestType", propOrder = {"_this", "spec"})
public class ReconfigureAutostartRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostAutoStartManagerConfig spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostAutoStartManagerConfig getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostAutoStartManagerConfig paramHostAutoStartManagerConfig) {
    this.spec = paramHostAutoStartManagerConfig;
  }
}
