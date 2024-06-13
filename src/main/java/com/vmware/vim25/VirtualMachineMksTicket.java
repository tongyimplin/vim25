package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineMksTicket;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineMksTicket", propOrder = {"ticket", "cfgFile", "host", "port", "sslThumbprint"})
public class VirtualMachineMksTicket extends DynamicData {
  @XmlElement(required = true)
  protected String ticket;
  
  @XmlElement(required = true)
  protected String cfgFile;
  
  protected String host;
  
  protected Integer port;
  
  protected String sslThumbprint;
  
  public String getTicket() {
    return this.ticket;
  }
  
  public void setTicket(String paramString) {
    this.ticket = paramString;
  }
  
  public String getCfgFile() {
    return this.cfgFile;
  }
  
  public void setCfgFile(String paramString) {
    this.cfgFile = paramString;
  }
  
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
}
