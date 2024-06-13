package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDhcpService;
import com.vmware.vim25.HostDhcpService;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDhcpService", propOrder = {"hostDhcpService"})
public class ArrayOfHostDhcpService {
  @XmlElement(name = "HostDhcpService")
  protected List<HostDhcpService> hostDhcpService;
  
  public List<HostDhcpService> getHostDhcpService() {
    if (this.hostDhcpService == null)
      this.hostDhcpService = new ArrayList<>(); 
    return this.hostDhcpService;
  }
}
