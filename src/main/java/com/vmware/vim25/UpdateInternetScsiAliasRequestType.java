package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateInternetScsiAliasRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInternetScsiAliasRequestType", propOrder = {"_this", "iScsiHbaDevice", "iScsiAlias"})
public class UpdateInternetScsiAliasRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String iScsiHbaDevice;
  
  @XmlElement(required = true)
  protected String iScsiAlias;
  
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
  
  public String getIScsiAlias() {
    return this.iScsiAlias;
  }
  
  public void setIScsiAlias(String paramString) {
    this.iScsiAlias = paramString;
  }
}
