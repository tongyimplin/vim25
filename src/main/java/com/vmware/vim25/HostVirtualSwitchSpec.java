package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostNetworkPolicy;
import com.vmware.vim25.HostVirtualSwitchBridge;
import com.vmware.vim25.HostVirtualSwitchSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchSpec", propOrder = {"numPorts", "bridge", "policy", "mtu"})
public class HostVirtualSwitchSpec extends DynamicData {
  protected int numPorts;
  
  protected HostVirtualSwitchBridge bridge;
  
  protected HostNetworkPolicy policy;
  
  protected Integer mtu;
  
  public int getNumPorts() {
    return this.numPorts;
  }
  
  public void setNumPorts(int paramInt) {
    this.numPorts = paramInt;
  }
  
  public HostVirtualSwitchBridge getBridge() {
    return this.bridge;
  }
  
  public void setBridge(HostVirtualSwitchBridge paramHostVirtualSwitchBridge) {
    this.bridge = paramHostVirtualSwitchBridge;
  }
  
  public HostNetworkPolicy getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(HostNetworkPolicy paramHostNetworkPolicy) {
    this.policy = paramHostNetworkPolicy;
  }
  
  public Integer getMtu() {
    return this.mtu;
  }
  
  public void setMtu(Integer paramInteger) {
    this.mtu = paramInteger;
  }
}
