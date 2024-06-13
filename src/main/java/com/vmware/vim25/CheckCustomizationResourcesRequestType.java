package com.vmware.vim25;

import com.vmware.vim25.CheckCustomizationResourcesRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckCustomizationResourcesRequestType", propOrder = {"_this", "guestOs"})
public class CheckCustomizationResourcesRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String guestOs;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getGuestOs() {
    return this.guestOs;
  }
  
  public void setGuestOs(String paramString) {
    this.guestOs = paramString;
  }
}
