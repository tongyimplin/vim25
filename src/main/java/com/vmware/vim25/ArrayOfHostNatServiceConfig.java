package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNatServiceConfig;
import com.vmware.vim25.HostNatServiceConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNatServiceConfig", propOrder = {"hostNatServiceConfig"})
public class ArrayOfHostNatServiceConfig {
  @XmlElement(name = "HostNatServiceConfig")
  protected List<HostNatServiceConfig> hostNatServiceConfig;
  
  public List<HostNatServiceConfig> getHostNatServiceConfig() {
    if (this.hostNatServiceConfig == null)
      this.hostNatServiceConfig = new ArrayList<>(); 
    return this.hostNatServiceConfig;
  }
}
