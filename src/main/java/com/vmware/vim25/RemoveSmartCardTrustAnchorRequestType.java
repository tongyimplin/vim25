package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveSmartCardTrustAnchorRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveSmartCardTrustAnchorRequestType", propOrder = {"_this", "issuer", "serial"})
public class RemoveSmartCardTrustAnchorRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String issuer;
  
  @XmlElement(required = true)
  protected String serial;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getIssuer() {
    return this.issuer;
  }
  
  public void setIssuer(String paramString) {
    this.issuer = paramString;
  }
  
  public String getSerial() {
    return this.serial;
  }
  
  public void setSerial(String paramString) {
    this.serial = paramString;
  }
}
