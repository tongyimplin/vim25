package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryAssignedLicensesRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAssignedLicensesRequestType", propOrder = {"_this", "entityId"})
public class QueryAssignedLicensesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected String entityId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getEntityId() {
    return this.entityId;
  }
  
  public void setEntityId(String paramString) {
    this.entityId = paramString;
  }
}
