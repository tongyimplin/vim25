package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PhysicalNicLinkInfo;
import com.vmware.vim25.UpdatePhysicalNicLinkSpeedRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePhysicalNicLinkSpeedRequestType", propOrder = {"_this", "device", "linkSpeed"})
public class UpdatePhysicalNicLinkSpeedRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String device;
  
  protected PhysicalNicLinkInfo linkSpeed;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public PhysicalNicLinkInfo getLinkSpeed() {
    return this.linkSpeed;
  }
  
  public void setLinkSpeed(PhysicalNicLinkInfo paramPhysicalNicLinkInfo) {
    this.linkSpeed = paramPhysicalNicLinkInfo;
  }
}
