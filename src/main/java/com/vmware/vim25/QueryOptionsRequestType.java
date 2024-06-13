package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryOptionsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOptionsRequestType", propOrder = {"_this", "name"})
public class QueryOptionsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected String name;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
