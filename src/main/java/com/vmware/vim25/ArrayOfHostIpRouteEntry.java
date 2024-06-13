package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostIpRouteEntry;
import com.vmware.vim25.HostIpRouteEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostIpRouteEntry", propOrder = {"hostIpRouteEntry"})
public class ArrayOfHostIpRouteEntry {
  @XmlElement(name = "HostIpRouteEntry")
  protected List<HostIpRouteEntry> hostIpRouteEntry;
  
  public List<HostIpRouteEntry> getHostIpRouteEntry() {
    if (this.hostIpRouteEntry == null)
      this.hostIpRouteEntry = new ArrayList<>(); 
    return this.hostIpRouteEntry;
  }
}
