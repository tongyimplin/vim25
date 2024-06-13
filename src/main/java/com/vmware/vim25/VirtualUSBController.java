package com.vmware.vim25;

import com.vmware.vim25.VirtualController;
import com.vmware.vim25.VirtualUSBController;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualUSBController", propOrder = {"autoConnectDevices", "ehciEnabled"})
public class VirtualUSBController extends VirtualController {
  protected Boolean autoConnectDevices;
  
  protected Boolean ehciEnabled;
  
  public Boolean isAutoConnectDevices() {
    return this.autoConnectDevices;
  }
  
  public void setAutoConnectDevices(Boolean paramBoolean) {
    this.autoConnectDevices = paramBoolean;
  }
  
  public Boolean isEhciEnabled() {
    return this.ehciEnabled;
  }
  
  public void setEhciEnabled(Boolean paramBoolean) {
    this.ehciEnabled = paramBoolean;
  }
}
