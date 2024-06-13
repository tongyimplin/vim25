package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryFaultToleranceCompatibilityExRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryFaultToleranceCompatibilityExRequestType", propOrder = {"_this", "forLegacyFt"})
public class QueryFaultToleranceCompatibilityExRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected Boolean forLegacyFt;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public Boolean isForLegacyFt() {
    return this.forLegacyFt;
  }
  
  public void setForLegacyFt(Boolean paramBoolean) {
    this.forLegacyFt = paramBoolean;
  }
}
