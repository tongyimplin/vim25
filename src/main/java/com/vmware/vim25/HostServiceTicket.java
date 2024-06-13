package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostServiceTicket;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostServiceTicket", propOrder = {"host", "port", "sslThumbprint", "service", "serviceVersion", "sessionId"})
public class HostServiceTicket extends DynamicData {
  protected String host;
  
  protected Integer port;
  
  protected String sslThumbprint;
  
  @XmlElement(required = true)
  protected String service;
  
  @XmlElement(required = true)
  protected String serviceVersion;
  
  @XmlElement(required = true)
  protected String sessionId;
  
  public String getHost() {
    return this.host;
  }
  
  public void setHost(String paramString) {
    this.host = paramString;
  }
  
  public Integer getPort() {
    return this.port;
  }
  
  public void setPort(Integer paramInteger) {
    this.port = paramInteger;
  }
  
  public String getSslThumbprint() {
    return this.sslThumbprint;
  }
  
  public void setSslThumbprint(String paramString) {
    this.sslThumbprint = paramString;
  }
  
  public String getService() {
    return this.service;
  }
  
  public void setService(String paramString) {
    this.service = paramString;
  }
  
  public String getServiceVersion() {
    return this.serviceVersion;
  }
  
  public void setServiceVersion(String paramString) {
    this.serviceVersion = paramString;
  }
  
  public String getSessionId() {
    return this.sessionId;
  }
  
  public void setSessionId(String paramString) {
    this.sessionId = paramString;
  }
}
