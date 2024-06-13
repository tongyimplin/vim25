package com.vmware.vim25;

import com.vmware.vim25.DuplicateCustomizationSpecRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateCustomizationSpecRequestType", propOrder = {"_this", "name", "newName"})
public class DuplicateCustomizationSpecRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String newName;
  
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
  
  public String getNewName() {
    return this.newName;
  }
  
  public void setNewName(String paramString) {
    this.newName = paramString;
  }
}
