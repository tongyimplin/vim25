package com.vmware.vim25;

import com.vmware.vim25.FindByInventoryPathRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindByInventoryPathRequestType", propOrder = {"_this", "inventoryPath"})
public class FindByInventoryPathRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String inventoryPath;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getInventoryPath() {
    return this.inventoryPath;
  }
  
  public void setInventoryPath(String paramString) {
    this.inventoryPath = paramString;
  }
}
