package com.vmware.vim25;

import com.vmware.vim25.CreateListViewFromViewRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateListViewFromViewRequestType", propOrder = {"_this", "view"})
public class CreateListViewFromViewRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference view;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getView() {
    return this.view;
  }
  
  public void setView(ManagedObjectReference paramManagedObjectReference) {
    this.view = paramManagedObjectReference;
  }
}
