package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OvfParseDescriptorParams;
import com.vmware.vim25.ParseDescriptorRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParseDescriptorRequestType", propOrder = {"_this", "ovfDescriptor", "pdp"})
public class ParseDescriptorRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String ovfDescriptor;
  
  @XmlElement(required = true)
  protected OvfParseDescriptorParams pdp;
  
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
  
  public OvfParseDescriptorParams getPdp() {
    return this.pdp;
  }
  
  public void setPdp(OvfParseDescriptorParams paramOvfParseDescriptorParams) {
    this.pdp = paramOvfParseDescriptorParams;
  }
}
