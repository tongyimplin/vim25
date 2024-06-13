package com.vmware.vim25;

import com.vmware.vim25.HostNvmeOverFibreChannelParameters;
import com.vmware.vim25.HostNvmeTransportParameters;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeOverFibreChannelParameters", propOrder = {"nodeWorldWideName", "portWorldWideName"})
public class HostNvmeOverFibreChannelParameters extends HostNvmeTransportParameters {
  protected long nodeWorldWideName;
  
  protected long portWorldWideName;
  
  public long getNodeWorldWideName() {
    return this.nodeWorldWideName;
  }
  
  public void setNodeWorldWideName(long paramLong) {
    this.nodeWorldWideName = paramLong;
  }
  
  public long getPortWorldWideName() {
    return this.portWorldWideName;
  }
  
  public void setPortWorldWideName(long paramLong) {
    this.portWorldWideName = paramLong;
  }
}
