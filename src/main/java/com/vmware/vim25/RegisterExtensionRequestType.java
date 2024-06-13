package com.vmware.vim25;

import com.vmware.vim25.Extension;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RegisterExtensionRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterExtensionRequestType", propOrder = {"_this", "extension"})
public class RegisterExtensionRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected Extension extension;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public Extension getExtension() {
    return this.extension;
  }
  
  public void setExtension(Extension paramExtension) {
    this.extension = paramExtension;
  }
}
