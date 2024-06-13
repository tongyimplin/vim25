package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RetrieveObjectScheduledTaskRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveObjectScheduledTaskRequestType", propOrder = {"_this", "obj"})
public class RetrieveObjectScheduledTaskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected ManagedObjectReference obj;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getObj() {
    return this.obj;
  }
  
  public void setObj(ManagedObjectReference paramManagedObjectReference) {
    this.obj = paramManagedObjectReference;
  }
}
