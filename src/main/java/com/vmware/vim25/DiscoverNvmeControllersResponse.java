package com.vmware.vim25;

import com.vmware.vim25.DiscoverNvmeControllersResponse;
import com.vmware.vim25.HostNvmeDiscoveryLog;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "DiscoverNvmeControllersResponse")
public class DiscoverNvmeControllersResponse {
  @XmlElement(required = true)
  protected HostNvmeDiscoveryLog returnval;
  
  public HostNvmeDiscoveryLog getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostNvmeDiscoveryLog paramHostNvmeDiscoveryLog) {
    this.returnval = paramHostNvmeDiscoveryLog;
  }
}
