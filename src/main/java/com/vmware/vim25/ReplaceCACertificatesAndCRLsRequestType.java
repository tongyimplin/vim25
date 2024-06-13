package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ReplaceCACertificatesAndCRLsRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplaceCACertificatesAndCRLsRequestType", propOrder = {"_this", "caCert", "caCrl"})
public class ReplaceCACertificatesAndCRLsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<String> caCert;
  
  protected List<String> caCrl;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getCaCert() {
    if (this.caCert == null)
      this.caCert = new ArrayList<>(); 
    return this.caCert;
  }
  
  public List<String> getCaCrl() {
    if (this.caCrl == null)
      this.caCrl = new ArrayList<>(); 
    return this.caCrl;
  }
}
