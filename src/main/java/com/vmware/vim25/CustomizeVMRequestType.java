package com.vmware.vim25;

import com.vmware.vim25.CustomizationSpec;
import com.vmware.vim25.CustomizeVMRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizeVMRequestType", propOrder = {"_this", "spec"})
public class CustomizeVMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected CustomizationSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public CustomizationSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(CustomizationSpec paramCustomizationSpec) {
    this.spec = paramCustomizationSpec;
  }
}
