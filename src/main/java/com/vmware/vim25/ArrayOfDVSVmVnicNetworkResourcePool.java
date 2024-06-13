package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDVSVmVnicNetworkResourcePool;
import com.vmware.vim25.DVSVmVnicNetworkResourcePool;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDVSVmVnicNetworkResourcePool", propOrder = {"dvsVmVnicNetworkResourcePool"})
public class ArrayOfDVSVmVnicNetworkResourcePool {
  @XmlElement(name = "DVSVmVnicNetworkResourcePool")
  protected List<DVSVmVnicNetworkResourcePool> dvsVmVnicNetworkResourcePool;
  
  public List<DVSVmVnicNetworkResourcePool> getDVSVmVnicNetworkResourcePool() {
    if (this.dvsVmVnicNetworkResourcePool == null)
      this.dvsVmVnicNetworkResourcePool = new ArrayList<>(); 
    return this.dvsVmVnicNetworkResourcePool;
  }
}
