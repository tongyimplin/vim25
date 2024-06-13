package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDVSNetworkResourcePool;
import com.vmware.vim25.DVSNetworkResourcePool;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDVSNetworkResourcePool", propOrder = {"dvsNetworkResourcePool"})
public class ArrayOfDVSNetworkResourcePool {
  @XmlElement(name = "DVSNetworkResourcePool")
  protected List<DVSNetworkResourcePool> dvsNetworkResourcePool;
  
  public List<DVSNetworkResourcePool> getDVSNetworkResourcePool() {
    if (this.dvsNetworkResourcePool == null)
      this.dvsNetworkResourcePool = new ArrayList<>(); 
    return this.dvsNetworkResourcePool;
  }
}
