package com.vmware.vim25;

import com.vmware.vim25.FibreChannelPortType;
import com.vmware.vim25.HostFibreChannelHba;
import com.vmware.vim25.HostFibreChannelOverEthernetHba;
import com.vmware.vim25.HostHostBusAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFibreChannelHba", propOrder = {"portWorldWideName", "nodeWorldWideName", "portType", "speed"})
@XmlSeeAlso({HostFibreChannelOverEthernetHba.class})
public class HostFibreChannelHba extends HostHostBusAdapter {
  protected long portWorldWideName;
  
  protected long nodeWorldWideName;
  
  @XmlElement(required = true)
  protected FibreChannelPortType portType;
  
  protected long speed;
  
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
  
  public FibreChannelPortType getPortType() {
    return this.portType;
  }
  
  public void setPortType(FibreChannelPortType paramFibreChannelPortType) {
    this.portType = paramFibreChannelPortType;
  }
  
  public long getSpeed() {
    return this.speed;
  }
  
  public void setSpeed(long paramLong) {
    this.speed = paramLong;
  }
}
