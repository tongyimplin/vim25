package com.vmware.vim25;

import com.vmware.vim25.CannotAccessNetwork;
import com.vmware.vim25.CannotAccessVmComponent;
import com.vmware.vim25.CannotAccessVmDevice;
import com.vmware.vim25.CannotAccessVmDisk;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotAccessVmDevice", propOrder = {"device", "backing", "connected"})
@XmlSeeAlso({CannotAccessNetwork.class, CannotAccessVmDisk.class})
public class CannotAccessVmDevice extends CannotAccessVmComponent {
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
