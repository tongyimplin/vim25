package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.SoftwarePackageCapability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwarePackageCapability", propOrder = {"liveInstallAllowed", "liveRemoveAllowed", "statelessReady", "overlay"})
public class SoftwarePackageCapability extends DynamicData {
  protected Boolean liveInstallAllowed;
  
  protected Boolean liveRemoveAllowed;
  
  protected Boolean statelessReady;
  
  protected Boolean overlay;
  
  public Boolean isLiveInstallAllowed() {
    return this.liveInstallAllowed;
  }
  
  public void setLiveInstallAllowed(Boolean paramBoolean) {
    this.liveInstallAllowed = paramBoolean;
  }
  
  public Boolean isLiveRemoveAllowed() {
    return this.liveRemoveAllowed;
  }
  
  public void setLiveRemoveAllowed(Boolean paramBoolean) {
    this.liveRemoveAllowed = paramBoolean;
  }
  
  public Boolean isStatelessReady() {
    return this.statelessReady;
  }
  
  public void setStatelessReady(Boolean paramBoolean) {
    this.statelessReady = paramBoolean;
  }
  
  public Boolean isOverlay() {
    return this.overlay;
  }
  
  public void setOverlay(Boolean paramBoolean) {
    this.overlay = paramBoolean;
  }
}
