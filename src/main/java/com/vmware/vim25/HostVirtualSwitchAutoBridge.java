package com.vmware.vim25;

import com.vmware.vim25.HostVirtualSwitchAutoBridge;
import com.vmware.vim25.HostVirtualSwitchBridge;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVirtualSwitchAutoBridge", propOrder = {"excludedNicDevice"})
public class HostVirtualSwitchAutoBridge extends HostVirtualSwitchBridge {
  protected List<String> excludedNicDevice;
  
  public List<String> getExcludedNicDevice() {
    if (this.excludedNicDevice == null)
      this.excludedNicDevice = new ArrayList<>(); 
    return this.excludedNicDevice;
  }
}
