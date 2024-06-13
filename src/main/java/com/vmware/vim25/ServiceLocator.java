package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ServiceLocator;
import com.vmware.vim25.ServiceLocatorCredential;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocator", propOrder = {"instanceUuid", "url", "credential", "sslThumbprint"})
public class ServiceLocator extends DynamicData {
  @XmlElement(required = true)
  protected String instanceUuid;
  
  @XmlElement(required = true)
  protected String url;
  
  @XmlElement(required = true)
  protected ServiceLocatorCredential credential;
  
  protected String sslThumbprint;
  
  public String getInstanceUuid() {
    return this.instanceUuid;
  }
  
  public void setInstanceUuid(String paramString) {
    this.instanceUuid = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
  
  public ServiceLocatorCredential getCredential() {
    return this.credential;
  }
  
  public void setCredential(ServiceLocatorCredential paramServiceLocatorCredential) {
    this.credential = paramServiceLocatorCredential;
  }
  
  public String getSslThumbprint() {
    return this.sslThumbprint;
  }
  
  public void setSslThumbprint(String paramString) {
    this.sslThumbprint = paramString;
  }
}
