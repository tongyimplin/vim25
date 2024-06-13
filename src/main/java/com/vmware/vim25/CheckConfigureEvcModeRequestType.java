package com.vmware.vim25;

import com.vmware.vim25.CheckConfigureEvcModeRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckConfigureEvcModeRequestType", propOrder = {"_this", "evcModeKey"})
public class CheckConfigureEvcModeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String evcModeKey;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getEvcModeKey() {
    return this.evcModeKey;
  }
  
  public void setEvcModeKey(String paramString) {
    this.evcModeKey = paramString;
  }
}
