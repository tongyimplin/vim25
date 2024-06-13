package com.vmware.vim25;

import com.vmware.vim25.DeleteVffsVolumeStateRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteVffsVolumeStateRequestType", propOrder = {"_this", "vffsUuid"})
public class DeleteVffsVolumeStateRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String vffsUuid;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getVffsUuid() {
    return this.vffsUuid;
  }
  
  public void setVffsUuid(String paramString) {
    this.vffsUuid = paramString;
  }
}
