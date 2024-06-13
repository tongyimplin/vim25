package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RenameRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenameRequestType", propOrder = {"_this", "newName"})
public class RenameRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String newName;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getNewName() {
    return this.newName;
  }
  
  public void setNewName(String paramString) {
    this.newName = paramString;
  }
}
