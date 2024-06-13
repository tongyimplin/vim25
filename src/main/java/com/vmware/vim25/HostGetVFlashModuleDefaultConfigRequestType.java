package com.vmware.vim25;

import com.vmware.vim25.HostGetVFlashModuleDefaultConfigRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostGetVFlashModuleDefaultConfigRequestType", propOrder = {"_this", "vFlashModule"})
public class HostGetVFlashModuleDefaultConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String vFlashModule;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVFlashModule() {
    return this.vFlashModule;
  }
  
  public void setVFlashModule(String paramString) {
    this.vFlashModule = paramString;
  }
}
