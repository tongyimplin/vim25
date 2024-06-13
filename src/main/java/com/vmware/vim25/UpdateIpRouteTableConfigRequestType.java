package com.vmware.vim25;

import com.vmware.vim25.HostIpRouteTableConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateIpRouteTableConfigRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIpRouteTableConfigRequestType", propOrder = {"_this", "config"})
public class UpdateIpRouteTableConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostIpRouteTableConfig config;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostIpRouteTableConfig getConfig() {
    return this.config;
  }
  
  public void setConfig(HostIpRouteTableConfig paramHostIpRouteTableConfig) {
    this.config = paramHostIpRouteTableConfig;
  }
}
