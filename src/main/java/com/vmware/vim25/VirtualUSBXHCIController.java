package com.vmware.vim25;

import com.vmware.vim25.VirtualController;
import com.vmware.vim25.VirtualUSBXHCIController;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualUSBXHCIController", propOrder = {"autoConnectDevices"})
public class VirtualUSBXHCIController extends VirtualController {
  protected Boolean autoConnectDevices;
  
  public Boolean isAutoConnectDevices() {
    return this.autoConnectDevices;
  }
  
  public void setAutoConnectDevices(Boolean paramBoolean) {
    this.autoConnectDevices = paramBoolean;
  }
}
