package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNetIpConfigSpecIpAddressSpec;
import com.vmware.vim25.NetIpConfigSpecIpAddressSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetIpConfigSpecIpAddressSpec", propOrder = {"netIpConfigSpecIpAddressSpec"})
public class ArrayOfNetIpConfigSpecIpAddressSpec {
  @XmlElement(name = "NetIpConfigSpecIpAddressSpec")
  protected List<NetIpConfigSpecIpAddressSpec> netIpConfigSpecIpAddressSpec;
  
  public List<NetIpConfigSpecIpAddressSpec> getNetIpConfigSpecIpAddressSpec() {
    if (this.netIpConfigSpecIpAddressSpec == null)
      this.netIpConfigSpecIpAddressSpec = new ArrayList<>(); 
    return this.netIpConfigSpecIpAddressSpec;
  }
}
