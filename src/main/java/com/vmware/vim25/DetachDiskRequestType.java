package com.vmware.vim25;

import com.vmware.vim25.DetachDiskRequestType;
import com.vmware.vim25.ID;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetachDiskRequestType", propOrder = {"_this", "diskId"})
public class DetachDiskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ID diskId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ID getDiskId() {
    return this.diskId;
  }
  
  public void setDiskId(ID paramID) {
    this.diskId = paramID;
  }
}
