package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveNvmeOverRdmaAdapterRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveNvmeOverRdmaAdapterRequestType", propOrder = {"_this", "hbaDeviceName"})
public class RemoveNvmeOverRdmaAdapterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String hbaDeviceName;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getHbaDeviceName() {
    return this.hbaDeviceName;
  }
  
  public void setHbaDeviceName(String paramString) {
    this.hbaDeviceName = paramString;
  }
}
