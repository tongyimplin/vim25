package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNatServicePortForwardSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNatServicePortForwardSpec", propOrder = {"type", "name", "hostPort", "guestPort", "guestIpAddress"})
public class HostNatServicePortForwardSpec extends DynamicData {
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String name;
  
  protected int hostPort;
  
  protected int guestPort;
  
  @XmlElement(required = true)
  protected String guestIpAddress;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public int getHostPort() {
    return this.hostPort;
  }
  
  public void setHostPort(int paramInt) {
    this.hostPort = paramInt;
  }
  
  public int getGuestPort() {
    return this.guestPort;
  }
  
  public void setGuestPort(int paramInt) {
    this.guestPort = paramInt;
  }
  
  public String getGuestIpAddress() {
    return this.guestIpAddress;
  }
  
  public void setGuestIpAddress(String paramString) {
    this.guestIpAddress = paramString;
  }
}
