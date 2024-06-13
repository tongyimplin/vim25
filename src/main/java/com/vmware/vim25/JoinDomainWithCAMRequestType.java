package com.vmware.vim25;

import com.vmware.vim25.JoinDomainWithCAMRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JoinDomainWithCAMRequestType", propOrder = {"_this", "domainName", "camServer"})
public class JoinDomainWithCAMRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String domainName;
  
  @XmlElement(required = true)
  protected String camServer;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getDomainName() {
    return this.domainName;
  }
  
  public void setDomainName(String paramString) {
    this.domainName = paramString;
  }
  
  public String getCamServer() {
    return this.camServer;
  }
  
  public void setCamServer(String paramString) {
    this.camServer = paramString;
  }
}
