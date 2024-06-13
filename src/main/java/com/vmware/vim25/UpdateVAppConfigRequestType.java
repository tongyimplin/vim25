package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateVAppConfigRequestType;
import com.vmware.vim25.VAppConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVAppConfigRequestType", propOrder = {"_this", "spec"})
public class UpdateVAppConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected VAppConfigSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public VAppConfigSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(VAppConfigSpec paramVAppConfigSpec) {
    this.spec = paramVAppConfigSpec;
  }
}
