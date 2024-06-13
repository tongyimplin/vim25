package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LinkLayerDiscoveryProtocolInfo;
import com.vmware.vim25.PhysicalNicCdpInfo;
import com.vmware.vim25.PhysicalNicHintInfo;
import com.vmware.vim25.PhysicalNicIpHint;
import com.vmware.vim25.PhysicalNicNameHint;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicHintInfo", propOrder = {"device", "subnet", "network", "connectedSwitchPort", "lldpInfo"})
public class PhysicalNicHintInfo extends DynamicData {
  @XmlElement(required = true)
  protected String device;
  
  protected List<PhysicalNicIpHint> subnet;
  
  protected List<PhysicalNicNameHint> network;
  
  protected PhysicalNicCdpInfo connectedSwitchPort;
  
  protected LinkLayerDiscoveryProtocolInfo lldpInfo;
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public List<PhysicalNicIpHint> getSubnet() {
    if (this.subnet == null)
      this.subnet = new ArrayList<>(); 
    return this.subnet;
  }
  
  public List<PhysicalNicNameHint> getNetwork() {
    if (this.network == null)
      this.network = new ArrayList<>(); 
    return this.network;
  }
  
  public PhysicalNicCdpInfo getConnectedSwitchPort() {
    return this.connectedSwitchPort;
  }
  
  public void setConnectedSwitchPort(PhysicalNicCdpInfo paramPhysicalNicCdpInfo) {
    this.connectedSwitchPort = paramPhysicalNicCdpInfo;
  }
  
  public LinkLayerDiscoveryProtocolInfo getLldpInfo() {
    return this.lldpInfo;
  }
  
  public void setLldpInfo(LinkLayerDiscoveryProtocolInfo paramLinkLayerDiscoveryProtocolInfo) {
    this.lldpInfo = paramLinkLayerDiscoveryProtocolInfo;
  }
}
