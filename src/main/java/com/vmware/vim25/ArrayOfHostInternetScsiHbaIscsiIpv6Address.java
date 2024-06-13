package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostInternetScsiHbaIscsiIpv6Address;
import com.vmware.vim25.HostInternetScsiHbaIscsiIpv6Address;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostInternetScsiHbaIscsiIpv6Address", propOrder = {"hostInternetScsiHbaIscsiIpv6Address"})
public class ArrayOfHostInternetScsiHbaIscsiIpv6Address {
  @XmlElement(name = "HostInternetScsiHbaIscsiIpv6Address")
  protected List<HostInternetScsiHbaIscsiIpv6Address> hostInternetScsiHbaIscsiIpv6Address;
  
  public List<HostInternetScsiHbaIscsiIpv6Address> getHostInternetScsiHbaIscsiIpv6Address() {
    if (this.hostInternetScsiHbaIscsiIpv6Address == null)
      this.hostInternetScsiHbaIscsiIpv6Address = new ArrayList<>(); 
    return this.hostInternetScsiHbaIscsiIpv6Address;
  }
}
