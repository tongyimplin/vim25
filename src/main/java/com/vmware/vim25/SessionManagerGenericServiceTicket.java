package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.SessionManagerGenericServiceTicket;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionManagerGenericServiceTicket", propOrder = {"id", "hostName", "sslThumbprint"})
public class SessionManagerGenericServiceTicket extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  protected String hostName;
  
  protected String sslThumbprint;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public String getSslThumbprint() {
    return this.sslThumbprint;
  }
  
  public void setSslThumbprint(String paramString) {
    this.sslThumbprint = paramString;
  }
}
