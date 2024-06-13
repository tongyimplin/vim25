package com.vmware.vim25;

import com.vmware.vim25.DistributedVirtualSwitchPortConnection;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostVirtualNicConnection;
import com.vmware.vim25.HostVirtualNicOpaqueNetworkSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualNicConnection", propOrder = {"portgroup", "dvPort", "opNetwork"})
public class HostVirtualNicConnection extends DynamicData {
  protected String portgroup;
  
  protected DistributedVirtualSwitchPortConnection dvPort;
  
  protected HostVirtualNicOpaqueNetworkSpec opNetwork;
  
  public String getPortgroup() {
    return this.portgroup;
  }
  
  public void setPortgroup(String paramString) {
    this.portgroup = paramString;
  }
  
  public DistributedVirtualSwitchPortConnection getDvPort() {
    return this.dvPort;
  }
  
  public void setDvPort(DistributedVirtualSwitchPortConnection paramDistributedVirtualSwitchPortConnection) {
    this.dvPort = paramDistributedVirtualSwitchPortConnection;
  }
  
  public HostVirtualNicOpaqueNetworkSpec getOpNetwork() {
    return this.opNetwork;
  }
  
  public void setOpNetwork(HostVirtualNicOpaqueNetworkSpec paramHostVirtualNicOpaqueNetworkSpec) {
    this.opNetwork = paramHostVirtualNicOpaqueNetworkSpec;
  }
}
