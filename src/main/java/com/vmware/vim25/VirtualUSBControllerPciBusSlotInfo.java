package com.vmware.vim25;

import com.vmware.vim25.VirtualDevicePciBusSlotInfo;
import com.vmware.vim25.VirtualUSBControllerPciBusSlotInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualUSBControllerPciBusSlotInfo", propOrder = {"ehciPciSlotNumber"})
public class VirtualUSBControllerPciBusSlotInfo extends VirtualDevicePciBusSlotInfo {
  protected Integer ehciPciSlotNumber;
  
  public Integer getEhciPciSlotNumber() {
    return this.ehciPciSlotNumber;
  }
  
  public void setEhciPciSlotNumber(Integer paramInteger) {
    this.ehciPciSlotNumber = paramInteger;
  }
}
