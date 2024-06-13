package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceBusSlotInfo;
import com.vmware.vim25.VirtualDevicePciBusSlotInfo;
import com.vmware.vim25.VirtualUSBControllerPciBusSlotInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDevicePciBusSlotInfo", propOrder = {"pciSlotNumber"})
@XmlSeeAlso({VirtualUSBControllerPciBusSlotInfo.class})
public class VirtualDevicePciBusSlotInfo extends VirtualDeviceBusSlotInfo {
  protected int pciSlotNumber;
  
  public int getPciSlotNumber() {
    return this.pciSlotNumber;
  }
  
  public void setPciSlotNumber(int paramInt) {
    this.pciSlotNumber = paramInt;
  }
}
