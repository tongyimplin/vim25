package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostNvmeDiscoveryLogEntry;
import com.vmware.vim25.HostNvmeDiscoveryLogEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostNvmeDiscoveryLogEntry", propOrder = {"hostNvmeDiscoveryLogEntry"})
public class ArrayOfHostNvmeDiscoveryLogEntry {
  @XmlElement(name = "HostNvmeDiscoveryLogEntry")
  protected List<HostNvmeDiscoveryLogEntry> hostNvmeDiscoveryLogEntry;
  
  public List<HostNvmeDiscoveryLogEntry> getHostNvmeDiscoveryLogEntry() {
    if (this.hostNvmeDiscoveryLogEntry == null)
      this.hostNvmeDiscoveryLogEntry = new ArrayList<>(); 
    return this.hostNvmeDiscoveryLogEntry;
  }
}
