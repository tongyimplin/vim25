package com.vmware.vim25;

import com.vmware.vim25.CannotUseNetwork;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotUseNetwork", propOrder = {"device", "backing", "connected", "reason", "network"})
public class CannotUseNetwork extends VmConfigFault {
  @XmlElement(required = true)
  protected String device;
  
  @XmlElement(required = true)
  protected String backing;
  
  protected boolean connected;
  
  @XmlElement(required = true)
  protected String reason;
  
  protected ManagedObjectReference network;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public String getBacking() {
    return this.backing;
  }
  
  public void setBacking(String paramString) {
    this.backing = paramString;
  }
  
  public boolean isConnected() {
    return this.connected;
  }
  
  public void setConnected(boolean paramBoolean) {
    this.connected = paramBoolean;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public ManagedObjectReference getNetwork() {
    return this.network;
  }
  
  public void setNetwork(ManagedObjectReference paramManagedObjectReference) {
    this.network = paramManagedObjectReference;
  }
}
