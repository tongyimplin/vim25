package com.vmware.vim25;

import com.vmware.vim25.VirtualController;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualIDEController;
import com.vmware.vim25.VirtualNVDIMMController;
import com.vmware.vim25.VirtualNVMEController;
import com.vmware.vim25.VirtualPCIController;
import com.vmware.vim25.VirtualPS2Controller;
import com.vmware.vim25.VirtualSATAController;
import com.vmware.vim25.VirtualSCSIController;
import com.vmware.vim25.VirtualSIOController;
import com.vmware.vim25.VirtualUSBController;
import com.vmware.vim25.VirtualUSBXHCIController;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualController", propOrder = {"busNumber", "device"})
@XmlSeeAlso({VirtualPS2Controller.class, VirtualNVDIMMController.class, VirtualPCIController.class, VirtualUSBXHCIController.class, VirtualUSBController.class, VirtualIDEController.class, VirtualSCSIController.class, VirtualSIOController.class, VirtualSATAController.class, VirtualNVMEController.class})
public class VirtualController extends VirtualDevice {
  protected int busNumber;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> device;
  
  public int getBusNumber() {
    return this.busNumber;
  }
  
  public void setBusNumber(int paramInt) {
    this.busNumber = paramInt;
  }
  
  public List<Integer> getDevice() {
    if (this.device == null)
      this.device = new ArrayList<>(); 
    return this.device;
  }
}
