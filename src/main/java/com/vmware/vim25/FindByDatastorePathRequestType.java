package com.vmware.vim25;

import com.vmware.vim25.FindByDatastorePathRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindByDatastorePathRequestType", propOrder = {"_this", "datacenter", "path"})
public class FindByDatastorePathRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datacenter;
  
  @XmlElement(required = true)
  protected String path;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatacenter() {
    return this.datacenter;
  }
  
  public void setDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.datacenter = paramManagedObjectReference;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
}
