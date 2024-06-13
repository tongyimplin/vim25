package com.vmware.vim25;

import com.vmware.vim25.CloneSessionRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloneSessionRequestType", propOrder = {"_this", "cloneTicket"})
public class CloneSessionRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String cloneTicket;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getCloneTicket() {
    return this.cloneTicket;
  }
  
  public void setCloneTicket(String paramString) {
    this.cloneTicket = paramString;
  }
}
