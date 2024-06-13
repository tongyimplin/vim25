package com.vmware.vim25;

import com.vmware.vim25.HostGraphicsConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateGraphicsConfigRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateGraphicsConfigRequestType", propOrder = {"_this", "config"})
public class UpdateGraphicsConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostGraphicsConfig config;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostGraphicsConfig getConfig() {
    return this.config;
  }
  
  public void setConfig(HostGraphicsConfig paramHostGraphicsConfig) {
    this.config = paramHostGraphicsConfig;
  }
}
