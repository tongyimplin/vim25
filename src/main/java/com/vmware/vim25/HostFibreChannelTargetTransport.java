package com.vmware.vim25;

import com.vmware.vim25.HostFibreChannelOverEthernetTargetTransport;
import com.vmware.vim25.HostFibreChannelTargetTransport;
import com.vmware.vim25.HostTargetTransport;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFibreChannelTargetTransport", propOrder = {"portWorldWideName", "nodeWorldWideName"})
@XmlSeeAlso({HostFibreChannelOverEthernetTargetTransport.class})
public class HostFibreChannelTargetTransport extends HostTargetTransport {
  protected long portWorldWideName;
  
  protected long nodeWorldWideName;
  
  public long getPortWorldWideName() {
    return this.portWorldWideName;
  }
  
  public void setPortWorldWideName(long paramLong) {
    this.portWorldWideName = paramLong;
  }
  
  public long getNodeWorldWideName() {
    return this.nodeWorldWideName;
  }
  
  public void setNodeWorldWideName(long paramLong) {
    this.nodeWorldWideName = paramLong;
  }
}
