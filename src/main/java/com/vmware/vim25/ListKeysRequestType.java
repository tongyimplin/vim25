package com.vmware.vim25;

import com.vmware.vim25.ListKeysRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListKeysRequestType", propOrder = {"_this", "limit"})
public class ListKeysRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected Integer limit;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public Integer getLimit() {
    return this.limit;
  }
  
  public void setLimit(Integer paramInteger) {
    this.limit = paramInteger;
  }
}
