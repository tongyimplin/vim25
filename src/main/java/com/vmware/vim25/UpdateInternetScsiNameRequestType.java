package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateInternetScsiNameRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInternetScsiNameRequestType", propOrder = {"_this", "iScsiHbaDevice", "iScsiName"})
public class UpdateInternetScsiNameRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String iScsiHbaDevice;
  
  @XmlElement(required = true)
  protected String iScsiName;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getIScsiHbaDevice() {
    return this.iScsiHbaDevice;
  }
  
  public void setIScsiHbaDevice(String paramString) {
    this.iScsiHbaDevice = paramString;
  }
  
  public String getIScsiName() {
    return this.iScsiName;
  }
  
  public void setIScsiName(String paramString) {
    this.iScsiName = paramString;
  }
}
