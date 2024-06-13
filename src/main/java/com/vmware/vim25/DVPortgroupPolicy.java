package com.vmware.vim25;

import com.vmware.vim25.DVPortgroupPolicy;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareDVSPortgroupPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVPortgroupPolicy", propOrder = {"blockOverrideAllowed", "shapingOverrideAllowed", "vendorConfigOverrideAllowed", "livePortMovingAllowed", "portConfigResetAtDisconnect", "networkResourcePoolOverrideAllowed", "trafficFilterOverrideAllowed"})
@XmlSeeAlso({VMwareDVSPortgroupPolicy.class})
public class DVPortgroupPolicy extends DynamicData {
  protected boolean blockOverrideAllowed;
  
  protected boolean shapingOverrideAllowed;
  
  protected boolean vendorConfigOverrideAllowed;
  
  protected boolean livePortMovingAllowed;
  
  protected boolean portConfigResetAtDisconnect;
  
  protected Boolean networkResourcePoolOverrideAllowed;
  
  protected Boolean trafficFilterOverrideAllowed;
  
  public boolean isBlockOverrideAllowed() {
    return this.blockOverrideAllowed;
  }
  
  public void setBlockOverrideAllowed(boolean paramBoolean) {
    this.blockOverrideAllowed = paramBoolean;
  }
  
  public boolean isShapingOverrideAllowed() {
    return this.shapingOverrideAllowed;
  }
  
  public void setShapingOverrideAllowed(boolean paramBoolean) {
    this.shapingOverrideAllowed = paramBoolean;
  }
  
  public boolean isVendorConfigOverrideAllowed() {
    return this.vendorConfigOverrideAllowed;
  }
  
  public void setVendorConfigOverrideAllowed(boolean paramBoolean) {
    this.vendorConfigOverrideAllowed = paramBoolean;
  }
  
  public boolean isLivePortMovingAllowed() {
    return this.livePortMovingAllowed;
  }
  
  public void setLivePortMovingAllowed(boolean paramBoolean) {
    this.livePortMovingAllowed = paramBoolean;
  }
  
  public boolean isPortConfigResetAtDisconnect() {
    return this.portConfigResetAtDisconnect;
  }
  
  public void setPortConfigResetAtDisconnect(boolean paramBoolean) {
    this.portConfigResetAtDisconnect = paramBoolean;
  }
  
  public Boolean isNetworkResourcePoolOverrideAllowed() {
    return this.networkResourcePoolOverrideAllowed;
  }
  
  public void setNetworkResourcePoolOverrideAllowed(Boolean paramBoolean) {
    this.networkResourcePoolOverrideAllowed = paramBoolean;
  }
  
  public Boolean isTrafficFilterOverrideAllowed() {
    return this.trafficFilterOverrideAllowed;
  }
  
  public void setTrafficFilterOverrideAllowed(Boolean paramBoolean) {
    this.trafficFilterOverrideAllowed = paramBoolean;
  }
}
