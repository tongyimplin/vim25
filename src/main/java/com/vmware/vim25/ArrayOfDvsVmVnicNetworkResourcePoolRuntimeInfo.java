package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo;
import com.vmware.vim25.DvsVmVnicNetworkResourcePoolRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo", propOrder = {"dvsVmVnicNetworkResourcePoolRuntimeInfo"})
public class ArrayOfDvsVmVnicNetworkResourcePoolRuntimeInfo {
  @XmlElement(name = "DvsVmVnicNetworkResourcePoolRuntimeInfo")
  protected List<DvsVmVnicNetworkResourcePoolRuntimeInfo> dvsVmVnicNetworkResourcePoolRuntimeInfo;
  
  public List<DvsVmVnicNetworkResourcePoolRuntimeInfo> getDvsVmVnicNetworkResourcePoolRuntimeInfo() {
    if (this.dvsVmVnicNetworkResourcePoolRuntimeInfo == null)
      this.dvsVmVnicNetworkResourcePoolRuntimeInfo = new ArrayList<>(); 
    return this.dvsVmVnicNetworkResourcePoolRuntimeInfo;
  }
}
