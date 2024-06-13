package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostRdmaDeviceCapability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaDeviceCapability", propOrder = {"roceV1Capable", "roceV2Capable", "iWarpCapable"})
public class HostRdmaDeviceCapability extends DynamicData {
  protected boolean roceV1Capable;
  
  protected boolean roceV2Capable;
  
  protected boolean iWarpCapable;
  
  public boolean isRoceV1Capable() {
    return this.roceV1Capable;
  }
  
  public void setRoceV1Capable(boolean paramBoolean) {
    this.roceV1Capable = paramBoolean;
  }
  
  public boolean isRoceV2Capable() {
    return this.roceV2Capable;
  }
  
  public void setRoceV2Capable(boolean paramBoolean) {
    this.roceV2Capable = paramBoolean;
  }
  
  public boolean isIWarpCapable() {
    return this.iWarpCapable;
  }
  
  public void setIWarpCapable(boolean paramBoolean) {
    this.iWarpCapable = paramBoolean;
  }
}
