package com.vmware.vim25;

import com.vmware.vim25.DVSCapability;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateDvsCapabilityRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDvsCapabilityRequestType", propOrder = {"_this", "capability"})
public class UpdateDvsCapabilityRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected DVSCapability capability;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public DVSCapability getCapability() {
    return this.capability;
  }
  
  public void setCapability(DVSCapability paramDVSCapability) {
    this.capability = paramDVSCapability;
  }
}
