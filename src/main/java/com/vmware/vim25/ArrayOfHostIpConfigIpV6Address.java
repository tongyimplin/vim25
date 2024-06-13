package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostIpConfigIpV6Address;
import com.vmware.vim25.HostIpConfigIpV6Address;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostIpConfigIpV6Address", propOrder = {"hostIpConfigIpV6Address"})
public class ArrayOfHostIpConfigIpV6Address {
  @XmlElement(name = "HostIpConfigIpV6Address")
  protected List<HostIpConfigIpV6Address> hostIpConfigIpV6Address;
  
  public List<HostIpConfigIpV6Address> getHostIpConfigIpV6Address() {
    if (this.hostIpConfigIpV6Address == null)
      this.hostIpConfigIpV6Address = new ArrayList<>(); 
    return this.hostIpConfigIpV6Address;
  }
}
