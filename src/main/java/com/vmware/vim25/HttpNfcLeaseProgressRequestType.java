package com.vmware.vim25;

import com.vmware.vim25.HttpNfcLeaseProgressRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HttpNfcLeaseProgressRequestType", propOrder = {"_this", "percent"})
public class HttpNfcLeaseProgressRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int percent;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public int getPercent() {
    return this.percent;
  }
  
  public void setPercent(int paramInt) {
    this.percent = paramInt;
  }
}
