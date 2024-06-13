package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVirtualSwitchConfig;
import com.vmware.vim25.HostVirtualSwitchConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVirtualSwitchConfig", propOrder = {"hostVirtualSwitchConfig"})
public class ArrayOfHostVirtualSwitchConfig {
  @XmlElement(name = "HostVirtualSwitchConfig")
  protected List<HostVirtualSwitchConfig> hostVirtualSwitchConfig;
  
  public List<HostVirtualSwitchConfig> getHostVirtualSwitchConfig() {
    if (this.hostVirtualSwitchConfig == null)
      this.hostVirtualSwitchConfig = new ArrayList<>(); 
    return this.hostVirtualSwitchConfig;
  }
}
