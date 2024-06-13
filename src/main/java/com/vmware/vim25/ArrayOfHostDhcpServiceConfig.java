package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDhcpServiceConfig;
import com.vmware.vim25.HostDhcpServiceConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDhcpServiceConfig", propOrder = {"hostDhcpServiceConfig"})
public class ArrayOfHostDhcpServiceConfig {
  @XmlElement(name = "HostDhcpServiceConfig")
  protected List<HostDhcpServiceConfig> hostDhcpServiceConfig;
  
  public List<HostDhcpServiceConfig> getHostDhcpServiceConfig() {
    if (this.hostDhcpServiceConfig == null)
      this.hostDhcpServiceConfig = new ArrayList<>(); 
    return this.hostDhcpServiceConfig;
  }
}
