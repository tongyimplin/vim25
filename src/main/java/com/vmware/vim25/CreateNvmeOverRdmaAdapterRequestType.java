package com.vmware.vim25;

import com.vmware.vim25.CreateNvmeOverRdmaAdapterRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateNvmeOverRdmaAdapterRequestType", propOrder = {"_this", "rdmaDeviceName"})
public class CreateNvmeOverRdmaAdapterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String rdmaDeviceName;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getRdmaDeviceName() {
    return this.rdmaDeviceName;
  }
  
  public void setRdmaDeviceName(String paramString) {
    this.rdmaDeviceName = paramString;
  }
}
