package com.vmware.vim25;

import com.vmware.vim25.HostVirtualSwitchBridge;
import com.vmware.vim25.HostVirtualSwitchSimpleBridge;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchSimpleBridge", propOrder = {"nicDevice"})
public class HostVirtualSwitchSimpleBridge extends HostVirtualSwitchBridge {
  @XmlElement(required = true)
  protected String nicDevice;
  
  public String getNicDevice() {
    return this.nicDevice;
  }
  
  public void setNicDevice(String paramString) {
    this.nicDevice = paramString;
  }
}
