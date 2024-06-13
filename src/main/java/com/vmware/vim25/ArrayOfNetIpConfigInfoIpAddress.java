package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNetIpConfigInfoIpAddress;
import com.vmware.vim25.NetIpConfigInfoIpAddress;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetIpConfigInfoIpAddress", propOrder = {"netIpConfigInfoIpAddress"})
public class ArrayOfNetIpConfigInfoIpAddress {
  @XmlElement(name = "NetIpConfigInfoIpAddress")
  protected List<NetIpConfigInfoIpAddress> netIpConfigInfoIpAddress;
  
  public List<NetIpConfigInfoIpAddress> getNetIpConfigInfoIpAddress() {
    if (this.netIpConfigInfoIpAddress == null)
      this.netIpConfigInfoIpAddress = new ArrayList<>(); 
    return this.netIpConfigInfoIpAddress;
  }
}
