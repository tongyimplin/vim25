package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PowerOffVAppRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerOffVAppRequestType", propOrder = {"_this", "force"})
public class PowerOffVAppRequestType {
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
