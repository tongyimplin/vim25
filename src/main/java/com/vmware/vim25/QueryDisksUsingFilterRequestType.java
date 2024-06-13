package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryDisksUsingFilterRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDisksUsingFilterRequestType", propOrder = {"_this", "filterId", "compRes"})
public class QueryDisksUsingFilterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String filterId;
  
  @XmlElement(required = true)
  protected ManagedObjectReference compRes;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getFilterId() {
    return this.filterId;
  }
  
  public void setFilterId(String paramString) {
    this.filterId = paramString;
  }
  
  public ManagedObjectReference getCompRes() {
    return this.compRes;
  }
  
  public void setCompRes(ManagedObjectReference paramManagedObjectReference) {
    this.compRes = paramManagedObjectReference;
  }
}
