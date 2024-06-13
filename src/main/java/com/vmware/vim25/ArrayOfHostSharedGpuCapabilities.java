package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostSharedGpuCapabilities;
import com.vmware.vim25.HostSharedGpuCapabilities;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostSharedGpuCapabilities", propOrder = {"hostSharedGpuCapabilities"})
public class ArrayOfHostSharedGpuCapabilities {
  @XmlElement(name = "HostSharedGpuCapabilities")
  protected List<HostSharedGpuCapabilities> hostSharedGpuCapabilities;
  
  public List<HostSharedGpuCapabilities> getHostSharedGpuCapabilities() {
    if (this.hostSharedGpuCapabilities == null)
      this.hostSharedGpuCapabilities = new ArrayList<>(); 
    return this.hostSharedGpuCapabilities;
  }
}
