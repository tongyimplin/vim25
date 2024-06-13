package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UnmountForceMountedVmfsVolumeRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnmountForceMountedVmfsVolumeRequestType", propOrder = {"_this", "vmfsUuid"})
public class UnmountForceMountedVmfsVolumeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String vmfsUuid;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVmfsUuid() {
    return this.vmfsUuid;
  }
  
  public void setVmfsUuid(String paramString) {
    this.vmfsUuid = paramString;
  }
}
