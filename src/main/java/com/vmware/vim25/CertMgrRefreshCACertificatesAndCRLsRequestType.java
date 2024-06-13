package com.vmware.vim25;

import com.vmware.vim25.CertMgrRefreshCACertificatesAndCRLsRequestType;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertMgrRefreshCACertificatesAndCRLsRequestType", propOrder = {"_this", "host"})
public class CertMgrRefreshCACertificatesAndCRLsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected List<ManagedObjectReference> host;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
}
