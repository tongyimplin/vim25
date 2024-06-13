package com.vmware.vim25;

import com.vmware.vim25.ConnectNvmeControllerRequestType;
import com.vmware.vim25.HostNvmeConnectSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectNvmeControllerRequestType", propOrder = {"_this", "connectSpec"})
public class ConnectNvmeControllerRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostNvmeConnectSpec connectSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostNvmeConnectSpec getConnectSpec() {
    return this.connectSpec;
  }
  
  public void setConnectSpec(HostNvmeConnectSpec paramHostNvmeConnectSpec) {
    this.connectSpec = paramHostNvmeConnectSpec;
  }
}
