package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PhysicalNicCdpDeviceCapability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicCdpDeviceCapability", propOrder = {"router", "transparentBridge", "sourceRouteBridge", "networkSwitch", "host", "igmpEnabled", "repeater"})
public class PhysicalNicCdpDeviceCapability extends DynamicData {
  protected boolean router;
  
  protected boolean transparentBridge;
  
  protected boolean sourceRouteBridge;
  
  protected boolean networkSwitch;
  
  protected boolean host;
  
  protected boolean igmpEnabled;
  
  protected boolean repeater;
  
  public boolean isRouter() {
    return this.router;
  }
  
  public void setRouter(boolean paramBoolean) {
    this.router = paramBoolean;
  }
  
  public boolean isTransparentBridge() {
    return this.transparentBridge;
  }
  
  public void setTransparentBridge(boolean paramBoolean) {
    this.transparentBridge = paramBoolean;
  }
  
  public boolean isSourceRouteBridge() {
    return this.sourceRouteBridge;
  }
  
  public void setSourceRouteBridge(boolean paramBoolean) {
    this.sourceRouteBridge = paramBoolean;
  }
  
  public boolean isNetworkSwitch() {
    return this.networkSwitch;
  }
  
  public void setNetworkSwitch(boolean paramBoolean) {
    this.networkSwitch = paramBoolean;
  }
  
  public boolean isHost() {
    return this.host;
  }
  
  public void setHost(boolean paramBoolean) {
    this.host = paramBoolean;
  }
  
  public boolean isIgmpEnabled() {
    return this.igmpEnabled;
  }
  
  public void setIgmpEnabled(boolean paramBoolean) {
    this.igmpEnabled = paramBoolean;
  }
  
  public boolean isRepeater() {
    return this.repeater;
  }
  
  public void setRepeater(boolean paramBoolean) {
    this.repeater = paramBoolean;
  }
}
