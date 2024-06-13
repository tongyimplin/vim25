package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemovePerfIntervalRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovePerfIntervalRequestType", propOrder = {"_this", "samplePeriod"})
public class RemovePerfIntervalRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected int samplePeriod;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public int getSamplePeriod() {
    return this.samplePeriod;
  }
  
  public void setSamplePeriod(int paramInt) {
    this.samplePeriod = paramInt;
  }
}
