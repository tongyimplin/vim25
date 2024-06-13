package com.vmware.vim25;

import com.vmware.vim25.BindVnicRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindVnicRequestType", propOrder = {"_this", "iScsiHbaName", "vnicDevice"})
public class BindVnicRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String iScsiHbaName;
  
  @XmlElement(required = true)
  protected String vnicDevice;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getIScsiHbaName() {
    return this.iScsiHbaName;
  }
  
  public void setIScsiHbaName(String paramString) {
    this.iScsiHbaName = paramString;
  }
  
  public String getVnicDevice() {
    return this.vnicDevice;
  }
  
  public void setVnicDevice(String paramString) {
    this.vnicDevice = paramString;
  }
}
