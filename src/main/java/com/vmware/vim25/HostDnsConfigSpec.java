package com.vmware.vim25;

import com.vmware.vim25.HostDnsConfig;
import com.vmware.vim25.HostDnsConfigSpec;
import com.vmware.vim25.HostVirtualNicConnection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDnsConfigSpec", propOrder = {"virtualNicConnection", "virtualNicConnectionV6"})
public class HostDnsConfigSpec extends HostDnsConfig {
  protected HostVirtualNicConnection virtualNicConnection;
  
  protected HostVirtualNicConnection virtualNicConnectionV6;
  
  public HostVirtualNicConnection getVirtualNicConnection() {
    return this.virtualNicConnection;
  }
  
  public void setVirtualNicConnection(HostVirtualNicConnection paramHostVirtualNicConnection) {
    this.virtualNicConnection = paramHostVirtualNicConnection;
  }
  
  public HostVirtualNicConnection getVirtualNicConnectionV6() {
    return this.virtualNicConnectionV6;
  }
  
  public void setVirtualNicConnectionV6(HostVirtualNicConnection paramHostVirtualNicConnection) {
    this.virtualNicConnectionV6 = paramHostVirtualNicConnection;
  }
}
