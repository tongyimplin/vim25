package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VmDiskFileQueryFlags;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDiskFileQueryFlags", propOrder = {"diskType", "capacityKb", "hardwareVersion", "controllerType", "diskExtents", "thin", "encryption"})
public class VmDiskFileQueryFlags extends DynamicData {
  protected boolean diskType;
  
  protected boolean capacityKb;
  
  protected boolean hardwareVersion;
  
  protected Boolean controllerType;
  
  protected Boolean diskExtents;
  
  protected Boolean thin;
  
  protected Boolean encryption;
  
  public boolean isDiskType() {
    return this.diskType;
  }
  
  public void setDiskType(boolean paramBoolean) {
    this.diskType = paramBoolean;
  }
  
  public boolean isCapacityKb() {
    return this.capacityKb;
  }
  
  public void setCapacityKb(boolean paramBoolean) {
    this.capacityKb = paramBoolean;
  }
  
  public boolean isHardwareVersion() {
    return this.hardwareVersion;
  }
  
  public void setHardwareVersion(boolean paramBoolean) {
    this.hardwareVersion = paramBoolean;
  }
  
  public Boolean isControllerType() {
    return this.controllerType;
  }
  
  public void setControllerType(Boolean paramBoolean) {
    this.controllerType = paramBoolean;
  }
  
  public Boolean isDiskExtents() {
    return this.diskExtents;
  }
  
  public void setDiskExtents(Boolean paramBoolean) {
    this.diskExtents = paramBoolean;
  }
  
  public Boolean isThin() {
    return this.thin;
  }
  
  public void setThin(Boolean paramBoolean) {
    this.thin = paramBoolean;
  }
  
  public Boolean isEncryption() {
    return this.encryption;
  }
  
  public void setEncryption(Boolean paramBoolean) {
    this.encryption = paramBoolean;
  }
}
