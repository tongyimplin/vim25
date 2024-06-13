package com.vmware.vim25;

import com.vmware.vim25.DisconnectNvmeControllerRequestType;
import com.vmware.vim25.HostNvmeDisconnectSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisconnectNvmeControllerRequestType", propOrder = {"_this", "disconnectSpec"})
public class DisconnectNvmeControllerRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostNvmeDisconnectSpec disconnectSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostNvmeDisconnectSpec getDisconnectSpec() {
    return this.disconnectSpec;
  }
  
  public void setDisconnectSpec(HostNvmeDisconnectSpec paramHostNvmeDisconnectSpec) {
    this.disconnectSpec = paramHostNvmeDisconnectSpec;
  }
}
