package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReplaceSmartCardTrustAnchorsRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplaceSmartCardTrustAnchorsRequestType", propOrder = {"_this", "certs"})
public class ReplaceSmartCardTrustAnchorsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> certs;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getCerts() {
    if (this.certs == null)
      this.certs = new ArrayList<>(); 
    return this.certs;
  }
}
