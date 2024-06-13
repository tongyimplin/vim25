package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryConnectionInfoRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryConnectionInfoRequestType", propOrder = {"_this", "hostname", "port", "username", "password", "sslThumbprint"})
public class QueryConnectionInfoRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String hostname;
  
  protected int port;
  
  @XmlElement(required = true)
  protected String username;
  
  @XmlElement(required = true)
  protected String password;
  
  protected String sslThumbprint;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getHostname() {
    return this.hostname;
  }
  
  public void setHostname(String paramString) {
    this.hostname = paramString;
  }
  
  public int getPort() {
    return this.port;
  }
  
  public void setPort(int paramInt) {
    this.port = paramInt;
  }
  
  public String getUsername() {
    return this.username;
  }
  
  public void setUsername(String paramString) {
    this.username = paramString;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String paramString) {
    this.password = paramString;
  }
  
  public String getSslThumbprint() {
    return this.sslThumbprint;
  }
  
  public void setSslThumbprint(String paramString) {
    this.sslThumbprint = paramString;
  }
}
