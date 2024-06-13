package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SelectVnicForNicTypeRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectVnicForNicTypeRequestType", propOrder = {"_this", "nicType", "device"})
public class SelectVnicForNicTypeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String nicType;
  
  @XmlElement(required = true)
  protected String device;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getNicType() {
    return this.nicType;
  }
  
  public void setNicType(String paramString) {
    this.nicType = paramString;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
}
