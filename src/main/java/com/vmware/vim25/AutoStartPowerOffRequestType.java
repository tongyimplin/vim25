package com.vmware.vim25;

import com.vmware.vim25.AutoStartPowerOffRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoStartPowerOffRequestType", propOrder = {"_this"})
public class AutoStartPowerOffRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
}
