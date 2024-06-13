package com.vmware.vim25;

import com.vmware.vim25.ImportCertificateForCAMRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportCertificateForCAMRequestType", propOrder = {"_this", "certPath", "camServer"})
public class ImportCertificateForCAMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String certPath;
  
  @XmlElement(required = true)
  protected String camServer;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getCertPath() {
    return this.certPath;
  }
  
  public void setCertPath(String paramString) {
    this.certPath = paramString;
  }
  
  public String getCamServer() {
    return this.camServer;
  }
  
  public void setCamServer(String paramString) {
    this.camServer = paramString;
  }
}
