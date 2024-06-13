package com.vmware.vim25;

import com.vmware.vim25.EnableNetworkResourceManagementRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnableNetworkResourceManagementRequestType", propOrder = {"_this", "enable"})
public class EnableNetworkResourceManagementRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected boolean enable;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public boolean isEnable() {
    return this.enable;
  }
  
  public void setEnable(boolean paramBoolean) {
    this.enable = paramBoolean;
  }
}
