package com.vmware.vim25;

import com.vmware.vim25.HostConnectSpec;
import com.vmware.vim25.HostSystemReconnectSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReconnectHostRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconnectHostRequestType", propOrder = {"_this", "cnxSpec", "reconnectSpec"})
public class ReconnectHostRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected HostConnectSpec cnxSpec;
  
  protected HostSystemReconnectSpec reconnectSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostConnectSpec getCnxSpec() {
    return this.cnxSpec;
  }
  
  public void setCnxSpec(HostConnectSpec paramHostConnectSpec) {
    this.cnxSpec = paramHostConnectSpec;
  }
  
  public HostSystemReconnectSpec getReconnectSpec() {
    return this.reconnectSpec;
  }
  
  public void setReconnectSpec(HostSystemReconnectSpec paramHostSystemReconnectSpec) {
    this.reconnectSpec = paramHostSystemReconnectSpec;
  }
}
