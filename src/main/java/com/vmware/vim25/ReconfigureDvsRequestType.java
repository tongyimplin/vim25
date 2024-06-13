package com.vmware.vim25;

import com.vmware.vim25.DVSConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureDvsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureDvsRequestType", propOrder = {"_this", "spec"})
public class ReconfigureDvsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected DVSConfigSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public DVSConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(DVSConfigSpec paramDVSConfigSpec) {
    this.spec = paramDVSConfigSpec;
  }
}
