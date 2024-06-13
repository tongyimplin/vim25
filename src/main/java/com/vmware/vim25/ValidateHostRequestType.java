package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OvfValidateHostParams;
import com.vmware.vim25.ValidateHostRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidateHostRequestType", propOrder = {"_this", "ovfDescriptor", "host", "vhp"})
public class ValidateHostRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String ovfDescriptor;
  
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected OvfValidateHostParams vhp;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getOvfDescriptor() {
    return this.ovfDescriptor;
  }
  
  public void setOvfDescriptor(String paramString) {
    this.ovfDescriptor = paramString;
  }
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public OvfValidateHostParams getVhp() {
    return this.vhp;
  }
  
  public void setVhp(OvfValidateHostParams paramOvfValidateHostParams) {
    this.vhp = paramOvfValidateHostParams;
  }
}
