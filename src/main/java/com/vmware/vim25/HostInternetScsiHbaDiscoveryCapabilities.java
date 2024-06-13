package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaDiscoveryCapabilities;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaDiscoveryCapabilities", propOrder = {"iSnsDiscoverySettable", "slpDiscoverySettable", "staticTargetDiscoverySettable", "sendTargetsDiscoverySettable"})
public class HostInternetScsiHbaDiscoveryCapabilities extends DynamicData {
  protected boolean iSnsDiscoverySettable;
  
  protected boolean slpDiscoverySettable;
  
  protected boolean staticTargetDiscoverySettable;
  
  protected boolean sendTargetsDiscoverySettable;
  
  public boolean isISnsDiscoverySettable() {
    return this.iSnsDiscoverySettable;
  }
  
  public void setISnsDiscoverySettable(boolean paramBoolean) {
    this.iSnsDiscoverySettable = paramBoolean;
  }
  
  public boolean isSlpDiscoverySettable() {
    return this.slpDiscoverySettable;
  }
  
  public void setSlpDiscoverySettable(boolean paramBoolean) {
    this.slpDiscoverySettable = paramBoolean;
  }
  
  public boolean isStaticTargetDiscoverySettable() {
    return this.staticTargetDiscoverySettable;
  }
  
  public void setStaticTargetDiscoverySettable(boolean paramBoolean) {
    this.staticTargetDiscoverySettable = paramBoolean;
  }
  
  public boolean isSendTargetsDiscoverySettable() {
    return this.sendTargetsDiscoverySettable;
  }
  
  public void setSendTargetsDiscoverySettable(boolean paramBoolean) {
    this.sendTargetsDiscoverySettable = paramBoolean;
  }
}
