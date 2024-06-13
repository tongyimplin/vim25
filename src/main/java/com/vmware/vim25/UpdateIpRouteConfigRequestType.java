package com.vmware.vim25;

import com.vmware.vim25.HostIpRouteConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateIpRouteConfigRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIpRouteConfigRequestType", propOrder = {"_this", "config"})
public class UpdateIpRouteConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostIpRouteConfig config;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostIpRouteConfig getConfig() {
    return this.config;
  }
  
  public void setConfig(HostIpRouteConfig paramHostIpRouteConfig) {
    this.config = paramHostIpRouteConfig;
  }
}
