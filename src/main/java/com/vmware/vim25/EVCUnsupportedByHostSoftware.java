package com.vmware.vim25;

import com.vmware.vim25.EVCConfigFault;
import com.vmware.vim25.EVCUnsupportedByHostSoftware;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EVCUnsupportedByHostSoftware", propOrder = {"host", "hostName"})
public class EVCUnsupportedByHostSoftware extends EVCConfigFault {
  @XmlElement(required = true)
  protected List<ManagedObjectReference> host;
  
  @XmlElement(required = true)
  protected List<String> hostName;
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
  
  public List<String> getHostName() {
    if (this.hostName == null)
      this.hostName = new ArrayList<>(); 
    return this.hostName;
  }
}
