package com.vmware.vim25;

import com.vmware.vim25.HostVirtualSwitchBeaconConfig;
import com.vmware.vim25.HostVirtualSwitchBondBridge;
import com.vmware.vim25.HostVirtualSwitchBridge;
import com.vmware.vim25.LinkDiscoveryProtocolConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchBondBridge", propOrder = {"nicDevice", "beacon", "linkDiscoveryProtocolConfig"})
public class HostVirtualSwitchBondBridge extends HostVirtualSwitchBridge {
  @XmlElement(required = true)
  protected List<String> nicDevice;
  
  protected HostVirtualSwitchBeaconConfig beacon;
  
  protected LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;
  
  public List<String> getNicDevice() {
    if (this.nicDevice == null)
      this.nicDevice = new ArrayList<>(); 
    return this.nicDevice;
  }
  
  public HostVirtualSwitchBeaconConfig getBeacon() {
    return this.beacon;
  }
  
  public void setBeacon(HostVirtualSwitchBeaconConfig paramHostVirtualSwitchBeaconConfig) {
    this.beacon = paramHostVirtualSwitchBeaconConfig;
  }
  
  public LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
    return this.linkDiscoveryProtocolConfig;
  }
  
  public void setLinkDiscoveryProtocolConfig(LinkDiscoveryProtocolConfig paramLinkDiscoveryProtocolConfig) {
    this.linkDiscoveryProtocolConfig = paramLinkDiscoveryProtocolConfig;
  }
}
