package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReloadVirtualMachineFromPathRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reloadVirtualMachineFromPathRequestType", propOrder = {"_this", "configurationPath"})
public class ReloadVirtualMachineFromPathRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String configurationPath;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getConfigurationPath() {
    return this.configurationPath;
  }
  
  public void setConfigurationPath(String paramString) {
    this.configurationPath = paramString;
  }
}
