package com.vmware.vim25;

import com.vmware.vim25.CreateDescriptorRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OvfCreateDescriptorParams;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDescriptorRequestType", propOrder = {"_this", "obj", "cdp"})
public class CreateDescriptorRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference obj;
  
  @XmlElement(required = true)
  protected OvfCreateDescriptorParams cdp;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getObj() {
    return this.obj;
  }
  
  public void setObj(ManagedObjectReference paramManagedObjectReference) {
    this.obj = paramManagedObjectReference;
  }
  
  public OvfCreateDescriptorParams getCdp() {
    return this.cdp;
  }
  
  public void setCdp(OvfCreateDescriptorParams paramOvfCreateDescriptorParams) {
    this.cdp = paramOvfCreateDescriptorParams;
  }
}
