package com.vmware.vim25;

import com.vmware.vim25.HostDasEvent;
import com.vmware.vim25.HostExtraNetworksEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostExtraNetworksEvent", propOrder = {"ips"})
public class HostExtraNetworksEvent extends HostDasEvent {
  protected String ips;
  
  public String getIps() {
    return this.ips;
  }
  
  public void setIps(String paramString) {
    this.ips = paramString;
  }
}
