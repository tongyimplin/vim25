package com.vmware.vim25;

import com.vmware.vim25.HostDateTimeConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateDateTimeConfigRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDateTimeConfigRequestType", propOrder = {"_this", "config"})
public class UpdateDateTimeConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostDateTimeConfig config;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostDateTimeConfig getConfig() {
    return this.config;
  }
  
  public void setConfig(HostDateTimeConfig paramHostDateTimeConfig) {
    this.config = paramHostDateTimeConfig;
  }
}
