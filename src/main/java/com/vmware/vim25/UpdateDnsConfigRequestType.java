package com.vmware.vim25;

import com.vmware.vim25.HostDnsConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateDnsConfigRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDnsConfigRequestType", propOrder = {"_this", "config"})
public class UpdateDnsConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostDnsConfig config;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostDnsConfig getConfig() {
    return this.config;
  }
  
  public void setConfig(HostDnsConfig paramHostDnsConfig) {
    this.config = paramHostDnsConfig;
  }
}
