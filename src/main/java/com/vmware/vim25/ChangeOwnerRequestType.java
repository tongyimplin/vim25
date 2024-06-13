package com.vmware.vim25;

import com.vmware.vim25.ChangeOwnerRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeOwnerRequestType", propOrder = {"_this", "name", "datacenter", "owner"})
public class ChangeOwnerRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  protected ManagedObjectReference datacenter;
  
  @XmlElement(required = true)
  protected String owner;
  
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
  
  public ManagedObjectReference getDatacenter() {
    return this.datacenter;
  }
  
  public void setDatacenter(ManagedObjectReference paramManagedObjectReference) {
    this.datacenter = paramManagedObjectReference;
  }
  
  public String getOwner() {
    return this.owner;
  }
  
  public void setOwner(String paramString) {
    this.owner = paramString;
  }
}
