package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KmipServerInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KmipServerInfo", propOrder = {"name", "address", "port", "proxyAddress", "proxyPort", "reconnect", "protocol", "nbio", "timeout", "userName"})
public class KmipServerInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String address;
  
  protected int port;
  
  protected String proxyAddress;
  
  protected Integer proxyPort;
  
  protected Integer reconnect;
  
  protected String protocol;
  
  protected Integer nbio;
  
  protected Integer timeout;
  
  protected String userName;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
  
  public int getPort() {
    return this.port;
  }
  
  public void setPort(int paramInt) {
    this.port = paramInt;
  }
  
  public String getProxyAddress() {
    return this.proxyAddress;
  }
  
  public void setProxyAddress(String paramString) {
    this.proxyAddress = paramString;
  }
  
  public Integer getProxyPort() {
    return this.proxyPort;
  }
  
  public void setProxyPort(Integer paramInteger) {
    this.proxyPort = paramInteger;
  }
  
  public Integer getReconnect() {
    return this.reconnect;
  }
  
  public void setReconnect(Integer paramInteger) {
    this.reconnect = paramInteger;
  }
  
  public String getProtocol() {
    return this.protocol;
  }
  
  public void setProtocol(String paramString) {
    this.protocol = paramString;
  }
  
  public Integer getNbio() {
    return this.nbio;
  }
  
  public void setNbio(Integer paramInteger) {
    this.nbio = paramInteger;
  }
  
  public Integer getTimeout() {
    return this.timeout;
  }
  
  public void setTimeout(Integer paramInteger) {
    this.timeout = paramInteger;
  }
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
}
