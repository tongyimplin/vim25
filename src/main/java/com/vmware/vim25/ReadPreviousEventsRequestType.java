package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReadPreviousEventsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReadPreviousEventsRequestType", propOrder = {"_this", "maxCount"})
public class ReadPreviousEventsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int maxCount;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public int getMaxCount() {
    return this.maxCount;
  }
  
  public void setMaxCount(int paramInt) {
    this.maxCount = paramInt;
  }
}
