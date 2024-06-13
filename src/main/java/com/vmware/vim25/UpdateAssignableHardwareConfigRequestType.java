package com.vmware.vim25;

import com.vmware.vim25.HostAssignableHardwareConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateAssignableHardwareConfigRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAssignableHardwareConfigRequestType", propOrder = {"_this", "config"})
public class UpdateAssignableHardwareConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostAssignableHardwareConfig config;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostAssignableHardwareConfig getConfig() {
    return this.config;
  }
  
  public void setConfig(HostAssignableHardwareConfig paramHostAssignableHardwareConfig) {
    this.config = paramHostAssignableHardwareConfig;
  }
}
