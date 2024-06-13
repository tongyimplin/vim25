package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSnmpDestination;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSnmpDestination", propOrder = {"hostName", "port", "community"})
public class HostSnmpDestination extends DynamicData {
  @XmlElement(required = true)
  protected String hostName;
  
  protected int port;
  
  @XmlElement(required = true)
  protected String community;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public int getPort() {
    return this.port;
  }
  
  public void setPort(int paramInt) {
    this.port = paramInt;
  }
  
  public String getCommunity() {
    return this.community;
  }
  
  public void setCommunity(String paramString) {
    this.community = paramString;
  }
}
