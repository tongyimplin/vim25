package com.vmware.vim25;

import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualNVDIMM;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualNVDIMM", propOrder = {"capacityInMB"})
public class VirtualNVDIMM extends VirtualDevice {
  protected long capacityInMB;
  
  public long getCapacityInMB() {
    return this.capacityInMB;
  }
  
  public void setCapacityInMB(long paramLong) {
    this.capacityInMB = paramLong;
  }
}
