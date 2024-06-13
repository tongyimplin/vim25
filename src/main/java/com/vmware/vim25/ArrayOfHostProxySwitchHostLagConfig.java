package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostProxySwitchHostLagConfig;
import com.vmware.vim25.HostProxySwitchHostLagConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostProxySwitchHostLagConfig", propOrder = {"hostProxySwitchHostLagConfig"})
public class ArrayOfHostProxySwitchHostLagConfig {
  @XmlElement(name = "HostProxySwitchHostLagConfig")
  protected List<HostProxySwitchHostLagConfig> hostProxySwitchHostLagConfig;
  
  public List<HostProxySwitchHostLagConfig> getHostProxySwitchHostLagConfig() {
    if (this.hostProxySwitchHostLagConfig == null)
      this.hostProxySwitchHostLagConfig = new ArrayList<>(); 
    return this.hostProxySwitchHostLagConfig;
  }
}
