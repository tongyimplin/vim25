package com.vmware.vim25;

import com.vmware.vim25.HostSystemSwapConfiguration;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateSystemSwapConfigurationRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSystemSwapConfigurationRequestType", propOrder = {"_this", "sysSwapConfig"})
public class UpdateSystemSwapConfigurationRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostSystemSwapConfiguration sysSwapConfig;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostSystemSwapConfiguration getSysSwapConfig() {
    return this.sysSwapConfig;
  }
  
  public void setSysSwapConfig(HostSystemSwapConfiguration paramHostSystemSwapConfiguration) {
    this.sysSwapConfig = paramHostSystemSwapConfiguration;
  }
}
