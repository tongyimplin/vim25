package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateHostImageAcceptanceLevelRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateHostImageAcceptanceLevelRequestType", propOrder = {"_this", "newAcceptanceLevel"})
public class UpdateHostImageAcceptanceLevelRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String newAcceptanceLevel;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getNewAcceptanceLevel() {
    return this.newAcceptanceLevel;
  }
  
  public void setNewAcceptanceLevel(String paramString) {
    this.newAcceptanceLevel = paramString;
  }
}
