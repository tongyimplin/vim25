package com.vmware.vim25;

import com.vmware.vim25.HostNetworkConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateNetworkConfigRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateNetworkConfigRequestType", propOrder = {"_this", "config", "changeMode"})
public class UpdateNetworkConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostNetworkConfig config;
  
  @XmlElement(required = true)
  protected String changeMode;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostNetworkConfig getConfig() {
    return this.config;
  }
  
  public void setConfig(HostNetworkConfig paramHostNetworkConfig) {
    this.config = paramHostNetworkConfig;
  }
  
  public String getChangeMode() {
    return this.changeMode;
  }
  
  public void setChangeMode(String paramString) {
    this.changeMode = paramString;
  }
}
