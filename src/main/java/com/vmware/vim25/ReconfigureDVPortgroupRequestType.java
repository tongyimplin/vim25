package com.vmware.vim25;

import com.vmware.vim25.DVPortgroupConfigSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconfigureDVPortgroupRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconfigureDVPortgroupRequestType", propOrder = {"_this", "spec"})
public class ReconfigureDVPortgroupRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected DVPortgroupConfigSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public DVPortgroupConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(DVPortgroupConfigSpec paramDVPortgroupConfigSpec) {
    this.spec = paramDVPortgroupConfigSpec;
  }
}
