package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RestoreFirmwareConfigurationRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestoreFirmwareConfigurationRequestType", propOrder = {"_this", "force"})
public class RestoreFirmwareConfigurationRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected boolean force;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public boolean isForce() {
    return this.force;
  }
  
  public void setForce(boolean paramBoolean) {
    this.force = paramBoolean;
  }
}
