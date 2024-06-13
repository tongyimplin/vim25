package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostProxySwitchConfig;
import com.vmware.vim25.HostProxySwitchConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProxySwitchConfig", propOrder = {"hostProxySwitchConfig"})
public class ArrayOfHostProxySwitchConfig {
  @XmlElement(name = "HostProxySwitchConfig")
  protected List<HostProxySwitchConfig> hostProxySwitchConfig;
  
  public List<HostProxySwitchConfig> getHostProxySwitchConfig() {
    if (this.hostProxySwitchConfig == null)
      this.hostProxySwitchConfig = new ArrayList<>(); 
    return this.hostProxySwitchConfig;
  }
}
