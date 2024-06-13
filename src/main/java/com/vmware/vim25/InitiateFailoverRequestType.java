package com.vmware.vim25;

import com.vmware.vim25.InitiateFailoverRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "initiateFailoverRequestType", propOrder = {"_this", "planned"})
public class InitiateFailoverRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected boolean planned;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public boolean isPlanned() {
    return this.planned;
  }
  
  public void setPlanned(boolean paramBoolean) {
    this.planned = paramBoolean;
  }
}
