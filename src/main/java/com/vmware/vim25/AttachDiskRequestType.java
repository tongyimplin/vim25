package com.vmware.vim25;

import com.vmware.vim25.AttachDiskRequestType;
import com.vmware.vim25.ID;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachDiskRequestType", propOrder = {"_this", "diskId", "datastore", "controllerKey", "unitNumber"})
public class AttachDiskRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ID diskId;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected Integer controllerKey;
  
  protected Integer unitNumber;
  
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
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public Integer getControllerKey() {
    return this.controllerKey;
  }
  
  public void setControllerKey(Integer paramInteger) {
    this.controllerKey = paramInteger;
  }
  
  public Integer getUnitNumber() {
    return this.unitNumber;
  }
  
  public void setUnitNumber(Integer paramInteger) {
    this.unitNumber = paramInteger;
  }
}
