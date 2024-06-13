package com.vmware.vim25;

import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.MismatchedNetworkPolicies;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MismatchedNetworkPolicies", propOrder = {"device", "backing", "connected"})
public class MismatchedNetworkPolicies extends MigrationFault {
  @XmlElement(required = true)
  protected String device;
  
  @XmlElement(required = true)
  protected String backing;
  
  protected boolean connected;
  
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
}
