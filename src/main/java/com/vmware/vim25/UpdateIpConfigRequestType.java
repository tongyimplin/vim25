package com.vmware.vim25;

import com.vmware.vim25.HostIpConfig;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateIpConfigRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIpConfigRequestType", propOrder = {"_this", "ipConfig"})
public class UpdateIpConfigRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostIpConfig ipConfig;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostIpConfig getIpConfig() {
    return this.ipConfig;
  }
  
  public void setIpConfig(HostIpConfig paramHostIpConfig) {
    this.ipConfig = paramHostIpConfig;
  }
}
