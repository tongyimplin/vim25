package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateProgressRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProgressRequestType", propOrder = {"_this", "percentDone"})
public class UpdateProgressRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int percentDone;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public int getPercentDone() {
    return this.percentDone;
  }
  
  public void setPercentDone(int paramInt) {
    this.percentDone = paramInt;
  }
}
